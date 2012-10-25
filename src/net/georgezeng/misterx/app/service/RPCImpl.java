package net.georgezeng.misterx.app.service;

import net.georgezeng.misterx.shared.domain.GameStatus;
import net.georgezeng.misterx.shared.domain.Player;
import net.georgezeng.misterx.shared.rpc.RPC;

import org.springframework.stereotype.Service;

@Service("MisterXRPC")
public class RPCImpl implements RPC {

	private GameSet gameSet = new GameSet(1L);

	@Override
	public GameStatus checkStatus() {
		return gameSet.checkStatus();
	}

	@Override
	public GameStatus readyToGame(Player player) {
		return gameSet.readyToGame(player);
	}

	@Override
	public void quit(Player player) {
		gameSet.quit(player);
	}

	public void resetGame() {
		gameSet = new GameSet(1L);
	}

}
