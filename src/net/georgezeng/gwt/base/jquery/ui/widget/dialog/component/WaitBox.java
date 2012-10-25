package net.georgezeng.gwt.base.jquery.ui.widget.dialog.component;

import net.georgezeng.gwt.base.jquery.core.JQuery;
import net.georgezeng.gwt.base.jquery.core.bean.JQueryObject;
import net.georgezeng.gwt.base.jquery.ui.JQueryUI;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.DialogDirective;

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
