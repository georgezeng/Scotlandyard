package net.georgezeng.misterx.gwt.util;

import net.georgezeng.misterx.gwt.activity.AbstractAsyncCallback;
import net.georgezeng.misterx.shared.domain.GameStatus;
import net.georgezeng.misterx.shared.rpc.RPC;

import com.google.gwt.user.client.Timer;

public abstract class GameStatusChecker extends Timer {

	private boolean isRunning = false;

	@Override
	public void run() {
		if (!isRunning) {
			isRunning = true;
			RPC.Instance.get().getGameStatus(new AbstractAsyncCallback<GameStatus>() {

				@Override
				public void onSuccess(GameStatus status) {
					check(status);
					isRunning = false;
				}

				@Override
				protected void doOnFailure() {
					isRunning = false;
				}

			});
		}

	}

	protected abstract void check(GameStatus status);
	
	public GameStatusChecker start() {
		scheduleRepeating(3000);
		return this;
	}

}
