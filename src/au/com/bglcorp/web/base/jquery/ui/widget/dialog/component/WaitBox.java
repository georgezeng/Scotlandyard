package au.com.bglcorp.web.base.jquery.ui.widget.dialog.component;

import au.com.bglcorp.web.base.jquery.core.JQuery;
import au.com.bglcorp.web.base.jquery.core.bean.JQueryObject;
import au.com.bglcorp.web.base.jquery.ui.JQueryUI;
import au.com.bglcorp.web.base.jquery.ui.widget.dialog.DialogDirective;

import com.google.gwt.user.client.Timer;

public class WaitBox extends InformationDialog {
	public WaitBox() {
		setModal(true);
		setResizable(false);
	}

	protected void showMessagePostProcesss() {
		JQuery.$(this.getElement()).parents(".ui-dialog")
				.find(".ui-icon-closethick").hide();
	}

	JQueryObject jThis;

	public JQueryObject open() {
		setAutoHeight();
		setAutoWidth();
		setResizable(false);
		JQueryObject jDialog = super.open();
		super.removeCloseBtn();
		return jDialog;
	}

	public JQueryObject close() {
		new Timer() {

			@Override
			public void run() {
				jThis = JQueryUI.$(WaitBox.this.getElement()).dialog(
						DialogDirective.close);
			}

		}.schedule(1);
		return jThis;
	}

}
