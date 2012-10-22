package net.georgezeng.misterx.gwt;

import net.georgezeng.misterx.gwt.ui.login.LoginPanel;
import net.georgezeng.misterx.gwt.ui.map.Creator;
import net.georgezeng.misterx.gwt.ui.ready.ReadyPanel;
import net.georgezeng.misterx.gwt.ui.ticket.TicketPanel;
import net.georgezeng.misterx.gwt.util.Constant;
import au.com.bglcorp.web.base.jquery.ui.widget.dialog.BaseDialogFactory;
import au.com.bglcorp.web.base.jquery.ui.widget.dialog.Dialog;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Entry extends Composite implements EntryPoint {
	static interface ViewBinder extends UiBinder<Widget, Entry> {

	}

	private static final ViewBinder BINDER = GWT.create(ViewBinder.class);

	@UiField(provided = true)
	Canvas map = Canvas.createIfSupported();

	public static TicketPanel TICKET_PANEL;

	public Entry() {
		Constant.ENTRY_UI = this;
		map.getElement().setAttribute("width", "3500");
		map.getElement().setAttribute("height", "3000");
		initWidget(BINDER.createAndBindUi(this));
	}

	@Override
	public void onModuleLoad() {
		RootPanel root = RootPanel.get();
		root.add(this);
		Constant.ACTIVITY.checkGameStatus();
	}

	public void showLoginPanel() {
		Constant.LOGIN_PANEL = new LoginPanel();
	}

	public void createGame() {
		Constant.LOGIN_PANEL.close();
		final Dialog waitBox = BaseDialogFactory.openWaitBox("正在加载内容，请耐心等待...");
		new Timer() {

			@Override
			public void run() {
				try {
					toCreateGame();
					waitBox.destroy();
				} catch (Exception e) {
					waitBox.destroy();
					BaseDialogFactory.getMessageBox().showMessage("创建失败，请联系管理员");
				}
			}

		}.schedule(500);
	}

	private void toCreateGame() {
		new Creator(map.getContext2d()).draw();

		// for test
		TICKET_PANEL = new TicketPanel(false);
		// Stations.S1.setCurrentPlayer(new PlayerUI(PlayerType.MisterX,
		// "George"));
	}

	private final native void onBeforeUnload() /*-{
		window.onbeforeunload = function() {
			return "离开当前页面将导致无法继续游戏，确定离开吗？";
		};
	}-*/;

	public void showReadyPanel() {
		onBeforeUnload();
		Window.addCloseHandler(new CloseHandler<Window>() {

			@Override
			public void onClose(CloseEvent<Window> event) {
				// 结束玩家状态
				Constant.ACTIVITY.quitGame();
			}
		});
		Constant.READY_PANEL = new ReadyPanel();
	}

}
