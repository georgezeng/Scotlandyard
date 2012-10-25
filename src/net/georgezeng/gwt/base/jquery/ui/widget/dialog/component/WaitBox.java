package net.georgezeng.gwt.base.jquery.ui.widget.dialog.component;

import net.georgezeng.gwt.base.jquery.core.JQuery;
import net.georgezeng.gwt.base.jquery.core.bean.JQueryObject;

public class WaitBox extends InformationDialog {
	public WaitBox() {
		setModal(true);
		setResizable(false);
	}

	protected void showMessagePostProcesss() {
		JQuery.$(this.getElement()).parents(".ui-dialog").find(".ui-icon-closethick").hide();
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

}
