package net.georgezeng.misterx.shared.rpc;

import net.georgezeng.misterx.shared.domain.GameStatus;
import net.georgezeng.misterx.shared.domain.Player;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RPCAsync {

	void checkStatus(AsyncCallback<GameStatus> callback);

	void readyToGame(Player player, AsyncCallback<GameStatus> callback);

	void quit(Player player, AsyncCallback<Void> callback);

}
