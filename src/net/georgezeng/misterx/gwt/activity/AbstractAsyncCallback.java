package net.georgezeng.misterx.gwt.activity;

import net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.Dialog;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.DialogButtonFactory;
import net.georgezeng.misterx.gwt.util.Constant;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class AbstractAsyncCallback<T> implements AsyncCallback<T> {

	@Override
	public void onFailure(Throwable caught) {
		Constant.ACTIVITY.closeWaitBox();
		final Dialog dialog = new Dialog();
		dialog.setTitle("系统通知");
		dialog.setContent(caught.getMessage());
		dialog.setButtons(DialogButtonFactory.newButton("确定", new JQCommonHandler() {

			@Override
			public void call(Element thisEl) {
				dialog.destroy();
			}
		}));
		dialog.open();
		dialog.setAutoHeight();
		dialog.setAutoWidth();
		doOnFailure();
	}
	
	protected void doOnFailure() {
		
	}

}
