package net.georgezeng.misterx.gwt.util;

import net.georgezeng.misterx.gwt.Entry;
import net.georgezeng.misterx.gwt.activity.Activity;
import net.georgezeng.misterx.gwt.ui.login.LoginPanel;
import net.georgezeng.misterx.gwt.ui.ready.ReadyPanel;
import net.georgezeng.misterx.shared.domain.GameStatus;
import net.georgezeng.misterx.shared.domain.Player;

import com.google.web.bindery.event.shared.SimpleEventBus;

public class Constant {
	public static final Activity ACTIVITY = new Activity();
	public static final SimpleEventBus EVENT_BUS = new SimpleEventBus();
	public static Entry ENTRY_UI;
	public static LoginPanel LOGIN_PANEL;
	public static ReadyPanel READY_PANEL;
	public static GameStatus STATUS;
	public static Player PALYER;
	public static GameStatusChecker statusChecker;
}
