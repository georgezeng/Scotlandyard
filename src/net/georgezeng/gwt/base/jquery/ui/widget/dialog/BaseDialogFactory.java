package net.georgezeng.gwt.base.jquery.ui.widget.dialog;

import java.util.HashMap;
import java.util.Map;

import net.georgezeng.gwt.base.jquery.ui.widget.dialog.component.ConfirmBox;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.component.MessageBox;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.component.WaitBox;

public final class BaseDialogFactory {
	private static final Map<String, MessageBox> messageBoxMap = new HashMap<String, MessageBox>();
	private static final Map<String, WaitBox> waitBoxMap = new HashMap<String, WaitBox>();
	private static MessageBox MESSAGE_BOX;
	private static WaitBox WAIT_BOX;
	private static ConfirmBox CONFIRM_BOX;

	public static MessageBox getMessageBox() {
		if (MESSAGE_BOX == null) {
			MESSAGE_BOX = new MessageBox();
		}
		return MESSAGE_BOX;
	}

	public static WaitBox getWaitBox() {
		if (WAIT_BOX == null) {
			WAIT_BOX = new WaitBox();
		}
		return WAIT_BOX;
	}

	public static WaitBox openWaitBox(String content) {
		WaitBox box = getWaitBox();
		box.setContent(content);
		box.open();
		return box;
	}

	public static MessageBox getMessageBox(String boxName) {
		MessageBox msgBox = messageBoxMap.get(boxName);
		if (msgBox == null) {
			msgBox = new MessageBox();
			messageBoxMap.put(boxName, msgBox);
		}
		return msgBox;
	}

	public static WaitBox getWaitBox(String boxName) {
		WaitBox waitBox = waitBoxMap.get(boxName);
		if (waitBox == null) {
			waitBox = new WaitBox();
			waitBoxMap.put(boxName, waitBox);
		}
		return waitBox;
	}

	public static ConfirmBox getConfirmBox() {
		if (CONFIRM_BOX == null) {
			CONFIRM_BOX = new ConfirmBox();
		}
		return CONFIRM_BOX;
	}
}
