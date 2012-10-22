package net.georgezeng.misterx.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import net.georgezeng.misterx.shared.domain.GameStatus;
import net.georgezeng.misterx.shared.domain.Player;
import net.georgezeng.misterx.shared.exception.RPCException;

public class GameSet {
	private Long roomId;
	private GameStatus status;
	private List<Player> players = new ArrayList<Player>();
	private volatile String key;

	public GameSet(Long roomId) {
		this.roomId = roomId;
		this.status = new GameStatus();
	}

	public Long getRoomId() {
		return roomId;
	}

	public void start() {
		// 检查游戏人数
		// if (misterX == null) {
		// throw new RPCException("没有人成为X先生，游戏无法进行，请重新选择角色。");
		// }
		//
		// if (policeUnits.size() < 5) {
		// throw new RPCException("游戏最少要求5人参与，请选择更多角色。");
		// }
	}

	public synchronized GameStatus checkStatus() {
		String tmpKey = null;
		if (key == null) {
			key = UUID.randomUUID().toString();
			tmpKey = key;
		}
		status.setKey(tmpKey);
		return status;
	}

	public GameStatus readyToGame(Player player) {
		if (players.contains(player)) {
			throw new RPCException("昵称已被使用，请重新输入新的昵称");
		}
		players.add(player);
		if (player.getKey() != null) {
			if (!key.equals(player.getKey())) {
				throw new RPCException("key不对，玩家身份非法，请联系管理员");
			}
			status.setHost(player);
		}
		if (player.isMisterX()) {
			status.setMisterX(player);
		} else {
			status.addPolice(player);
		}
		return status;
	}

	public synchronized void quit(Player player) {
		if (status.isHost(player)) {
			// 把游戏房主给下一个玩家
			status.goToNextHost(player);
		} else {
			status.clearPlayer(player);
		}
	}
}
