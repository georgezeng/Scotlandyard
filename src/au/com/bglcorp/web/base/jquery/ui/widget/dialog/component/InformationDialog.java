package au.com.bglcorp.web.base.jquery.ui.widget.dialog.component;

import au.com.bglcorp.web.base.jquery.ui.widget.dialog.Dialog;

import com.google.gwt.user.client.Timer;

public abstract class InformationDialog extends Dialog {
	public InformationDialog() {
		setTitle("系统信息");
		setResizable(false);
	}

	public void showMessage(final String msg) {
		new Timer() {

			@Override
			public void run() {
//				if (contentDiv != null) {
					setContent(msg);
//					contentDiv.addClassName("informationBox");
					open();
					showMessagePostProcesss();
					this.cancel();
//				}
			}

		}.scheduleRepeating(10);
	}

	protected void showMessagePostProcesss() {

	}
}
