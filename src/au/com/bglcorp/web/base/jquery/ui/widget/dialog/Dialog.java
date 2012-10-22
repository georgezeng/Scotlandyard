package au.com.bglcorp.web.base.jquery.ui.widget.dialog;

import au.com.bglcorp.web.base.jquery.core.JQuery;
import au.com.bglcorp.web.base.jquery.core.bean.JQueryObject;
import au.com.bglcorp.web.base.jquery.core.bean.event.JQEvent;
import au.com.bglcorp.web.base.jquery.core.handler.base.JQEventHandler;
import au.com.bglcorp.web.base.jquery.ui.JQueryUI;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Dialog extends Composite {
	private DialogOptions options = JavaScriptObject.createObject().cast();
	private HTMLPanel dialogPanel;
	protected DivElement contentDiv;
	private boolean isToDestoryWithCloseImg;
	private ContentTable contentTable;

	public Dialog() {
		this(400, 300);
	}

	public Dialog(int width) {
		this(width, 0);
	}

	public Dialog(int width, int height) {
		if (width <= 0) {
			setAutoWidth();
		} else {
			setWidth(width);
		}
		if (height > 0) {
			setHeight(height);
		}
		DivElement dialogPanelDiv = Document.get().createDivElement();
		Document.get().getBody().appendChild(dialogPanelDiv);
		JQuery.$(dialogPanelDiv).hide();
		dialogPanel = HTMLPanel.wrap(dialogPanelDiv);
		initWidget(dialogPanel);
		setModal(true);
		attach();
	}

	public void attach() {
		if (RootPanel.get().isAttached() && !isAttached()) {
			RootPanel.get().add(this);
		}
	}

	private JQueryObject jThis;

	public JQueryObject open() {
		options.closeOnEscape(false);
		JQueryObject dialog = JQueryUI.$(this.getElement()).dialog(options)
				.parents(".ui-dialog");
		jThis = dialog;
		if (isToDestoryWithCloseImg) {
			JQuery.$(getElement()).parents(".ui-dialog")
					.find("span.ui-icon-closethick")
					.click(new JQEventHandler() {

						@Override
						public void call(Element thisEl, JQEvent jqEvent) {
							destroy();
						}
					});
		}
		adjustAutoWidthInIE7(dialog);
		return dialog;
	}

	private native void adjustAutoWidthInIE7(JQueryObject dialog) /*-{
		if ($wnd.$.browser.msie && $wnd.$.browser.version < 8
				&& dialog.dialog('option', 'width') == 'auto') {
			dialog.dialog('option', 'width', dialog[0].offsetWidth);
			dialog.parent().find('.ui-dialog-titlebar').each(function() {
				$wnd.$(this).width(dialog.width());
			});
			dialog.parent().css('width', dialog[0].offsetWidth + 1 + "px");
			dialog
					.parents('.ui-dialog')
					.css(
							"left",
							($wnd.$("body").width() / 2 - (dialog[0].offsetWidth + 1) / 2)
									+ "px");
		}
	}-*/;

	public void setDestroyWithCloseImg() {
		isToDestoryWithCloseImg = true;
	}

	public JQueryObject close() {
		return JQueryUI.$(this.getElement()).dialog(DialogDirective.close);
	}

	/**
	 * If new too many instances of dialog than use this method to instead of
	 * close method.
	 */
	public void destroy() {
		JQueryUI.$(this.getElement()).dialog(DialogDirective.close).remove();
	}

	public void setContent(Widget widget) {
		dialogPanel.clear();
		dialogPanel.add(widget);
	}

	public void setContent(Element element) {
		contentTable = new ContentTable();
		String width = options.getWidth();
		if (!"auto".equals(options.getWidth())) {
			width = Integer.valueOf(width) * 0.9 + "px";
		}
		contentTable.setContent(width, element);
		setContent(contentTable);
	}

	public void setContent(String html) {
		DivElement content = Document.get().createDivElement();
		content.setInnerHTML(html);
		setContent(content);
	}

	public void setButtons(DialogButton... buttons) {
		if (buttons != null && buttons.length > 0) {
			JsArray<DialogButton> jButtons = JavaScriptObject.createArray()
					.cast();
			for (DialogButton button : buttons) {
				jButtons.push(button);
			}
			options.setButtons(jButtons);
		}
	}

	public void setResizable(boolean resizable) {
		options.setResizable(resizable);
	}

	public void setModal(boolean modal) {
		options.setModal(modal);
	}

	public void setTitle(String title) {
		options.setTitle(title);
	}

	public void setWidth(int width) {
		options.setWidth(width);
	}

	public void setAutoWidth() {
		options.setAutoWidth();
	}

	public void setHeight(int height) {
		options.setHeight(height);
	}

	public void setAutoHeight() {
		options.setAutoHeight();
	}

	public void removeCloseBtn() {
		jThis.find("a.ui-dialog-titlebar-close").remove();
	}

}
