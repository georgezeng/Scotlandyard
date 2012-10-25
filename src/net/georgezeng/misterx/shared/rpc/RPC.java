package net.georgezeng.misterx.shared.rpc;

import net.georgezeng.misterx.shared.domain.GameStatus;
import net.georgezeng.misterx.shared.domain.Player;
import net.georgezeng.misterx.shared.exception.RPCException;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("../rpc/MisterXRPC")
public interface RPC extends RemoteService {
	class Instance {
		public static final RPCAsync get() {
			return GWT.create(RPC.class);
		}
	}

	/**
	 * 检查游戏状态
	 * 
	 * @return
	 */
	GameStatus checkStatus() throws RPCException;

	GameStatus readyToGame(Player player) throws RPCException;

	/**
	 * 玩家退出游戏
	 * 
	 * @param player
	 */
	void quit(Player player)  throws RPCException;

}
