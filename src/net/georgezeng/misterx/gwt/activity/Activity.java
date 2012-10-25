package net.georgezeng.misterx.gwt.activity;

import net.georgezeng.gwt.base.jquery.ui.widget.dialog.BaseDialogFactory;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.component.WaitBox;
import net.georgezeng.misterx.gwt.util.Constant;
import net.georgezeng.misterx.shared.domain.GameStatus;
import net.georgezeng.misterx.shared.rpc.RPC;

public class Activity {

	private WaitBox waitBox = BaseDialogFactory.getWaitBox();

	public void openWaitBox(String msg) {
		waitBox.setContent(msg);
		waitBox.open();
	}

	public void closeWaitBox() {
		waitBox.close();
	}

	public void checkGameStatus() {
		openWaitBox("正在检查，请稍候...");
		RPC.Instance.get().checkStatus(new AbstractAsyncCallback<GameStatus>() {

			@Override
			public void onSuccess(GameStatus status) {
				waitBox.close();
				if (status.isGaming()) {
					BaseDialogFactory.getMessageBox().showMessage("正在游戏中，暂时无法进入，请稍后刷新页面重试");
					return;
				}
				Constant.STATUS = status;
				Constant.ENTRY_UI.showLoginPanel();
			}

		});
	}

	public void readyToGame() {
		openWaitBox("正在检查，请稍候...");
		RPC.Instance.get().readyToGame(Constant.PALYER, new AbstractAsyncCallback<GameStatus>() {

			@Override
			public void onSuccess(GameStatus status) {
				waitBox.close();
				Constant.STATUS = status;
				Constant.LOGIN_PANEL.close();
				Constant.ENTRY_UI.showReadyPanel();
			}

		});
	}

	public void quitGame() {
		RPC.Instance.get().quit(Constant.PALYER, new AbstractAsyncCallback<Void>() {

			@Override
			public void onSuccess(Void result) {
			}

		});
	}

	private boolean isGettingStatus = false;

	public void checkIfCanStartGame() {
		if (!isGettingStatus) {
			isGettingStatus = true;
			RPC.Instance.get().getGameStatus(new AbstractAsyncCallback<GameStatus>() {

				@Override
				public void onSuccess(GameStatus status) {
					isGettingStatus = false;
					Constant.STATUS = status;
					// 修改成员列表
					Constant.READY_PANEL.showTicks(status.getTotalUnits());

					// 检查是否可以开始游戏
					if (status.isCouldPlayGame()) {
						Constant.START_CHECKER.cancel();
						Constant.ENTRY_UI.createGame();
					}
				}

				@Override
				protected void doOnFailure() {
					isGettingStatus = false;
				}

			});
		}
	}

	public void toSyncAllPlayers() {

	}
}
