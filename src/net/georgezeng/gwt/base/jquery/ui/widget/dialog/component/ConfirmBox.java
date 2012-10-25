package net.georgezeng.gwt.base.jquery.ui.widget.dialog.component;

import net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.DialogButton;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.DialogButtonFactory;

import com.google.gwt.dom.client.Element;

public class ConfirmBox extends InformationDialog {

	public static interface Handler {
		void call();
	}

	private static class JQueryHandlerImpl implements JQCommonHandler {

		private Handler handler;
		private ConfirmBox box;

		public void setHandler(Handler handler) {
			this.handler = handler;
		}

		public JQueryHandlerImpl(ConfirmBox box) {
			this.box = box;
		}

		@Override
		public void call(Element thisEl) {
			box.close();
			if (handler != null) {
				handler.call();
			}
		}

	}

	private JQueryHandlerImpl jHandler = new JQueryHandlerImpl(this);

	public ConfirmBox() {
		setButtons(DialogButtonFactory.newButton("确定", jHandler), DialogButtonFactory.newSimpleCancelButton());
		setModal(true);
		setResizable(false);
	}

	public ConfirmBox(String confirmBtnText, String cancelBtnText) {
		DialogButton cancelBtn = DialogButtonFactory.newSimpleCancelButton();
		cancelBtn.setName(cancelBtnText);
		setButtons(DialogButtonFactory.newButton(confirmBtnText, jHandler), cancelBtn);
		setModal(true);
		setResizable(false);
	}

	public void showMessage(String confirmMsg, Handler handler) {
		jHandler.setHandler(handler);
		super.showMessage(confirmMsg);
	}

}
