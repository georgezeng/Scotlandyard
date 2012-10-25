package net.georgezeng.misterx.app.service;

import java.util.UUID;

import net.georgezeng.misterx.shared.domain.GameStatus;
import net.georgezeng.misterx.shared.domain.Player;
import net.georgezeng.misterx.shared.exception.RPCException;

public class GameSet {
	private Long roomId;
	private GameStatus status;
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
		if (status.getTotalUnits().size() == 6) {
			throw new RPCException("房间已满员，请等待其它玩家退出或者游戏结束后重新抢位进入");
		}
		String tmpKey = null;
		if (key == null) {
			key = UUID.randomUUID().toString();
			tmpKey = key;
		}
		status.setKey(tmpKey);
		return status;
	}

	public synchronized GameStatus readyToGame(Player player) {
		// 检查昵称是否重复
		if (status.getPlayers().contains(player)) {
			throw new RPCException("昵称已被使用，请重新输入新的昵称");
		}
		// 检查角色是否已经被选取
		status.checkHasBeenChosen(player);
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
		if (player.isHost()) {
			// 把游戏房主给下一个玩家
			if (status.goToNextHost(player) == null) {
				key = null;
			}
		} else {
			status.clearPlayer(player);
		}
	}

	public GameStatus getStatus() {
		return status;
	}
}
