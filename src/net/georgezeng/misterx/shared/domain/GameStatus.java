package net.georgezeng.misterx.shared.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.georgezeng.misterx.shared.enums.PlayerUnitType;
import net.georgezeng.misterx.shared.exception.RPCException;

public class GameStatus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean isGaming;
	private List<PlayerUnit> policeRegUnits = new ArrayList<PlayerUnit>();
	private List<PlayerUnit> policeUnits = new ArrayList<PlayerUnit>();
	private List<PlayerUnit> totalUnits = new ArrayList<PlayerUnit>();
	private Player misterX;
	private Player host;
	private List<Player> policePlayers = new ArrayList<Player>();
	private String key;
	private List<Player> totalPlayers = new ArrayList<Player>();

	public GameStatus() {
		policeRegUnits.add(new PlayerUnit(PlayerUnitType.PoliceA));
		policeRegUnits.add(new PlayerUnit(PlayerUnitType.PoliceB));
		policeRegUnits.add(new PlayerUnit(PlayerUnitType.PoliceC));
		policeRegUnits.add(new PlayerUnit(PlayerUnitType.PoliceD));
		policeRegUnits.add(new PlayerUnit(PlayerUnitType.PoliceE));
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isGaming() {
		return isGaming;
	}

	public void setGaming(boolean isGaming) {
		this.isGaming = isGaming;
	}

	public boolean isHostBeMisterX() {
		return host != null && host == misterX;
	}

	public List<PlayerUnit> getPoliceUnits() {
		return policeUnits;
	}

	public List<PlayerUnit> getTotalUnits() {
		return totalUnits;
	}

	public List<PlayerUnit> getPoliceRegUnits() {
		return policeRegUnits;
	}

	public Player getMisterX() {
		return misterX;
	}

	public void setMisterX(Player misterX) {
		this.misterX = misterX;
	}

	public Player getHost() {
		return host;
	}

	public void setHost(Player host) {
		this.host = host;
		totalUnits.addAll(host.getUnits());
		totalPlayers.add(host);
	}

	public List<Player> getPolicePlayers() {
		return policePlayers;
	}

	public void addPolice(Player player) {
		policePlayers.add(player);
		policeUnits.addAll(player.getUnits());
		policeRegUnits.removeAll(player.getUnits());
		totalPlayers.add(player);
		totalUnits.addAll(player.getUnits());
	}

	public Player goToNextHost(Player quitPlayer) {
		clearPlayer(quitPlayer);
		host = null;
		if (misterX != null && misterX.equals(quitPlayer)) {
			misterX = null;
		}
		if (totalPlayers.size() > 0) {
			host = totalPlayers.get(0);
		}
		if (host != null && host.isMisterX()) {
			host.setKey(quitPlayer.getKey());
			misterX = host;
		}
		return host;
	}

	public void clearPlayer(Player quitPlayer) {
		policePlayers.remove(quitPlayer);
		totalPlayers.remove(quitPlayer);
		policeUnits.removeAll(quitPlayer.getUnits());
		policeRegUnits.addAll(quitPlayer.getUnits());
		totalUnits.removeAll(quitPlayer.getUnits());
	}

	public void checkHasBeenChosen(Player player) {
		if (misterX != null && player.isMisterX()) {
			throw new RPCException("X先生已经被选取，请重新选择其它角色。");
		}
		if (!player.isMisterX()) {
			List<PlayerUnit> chosenUnits = player.getUnits();
			StringBuilder errorMsg = new StringBuilder();
			for (PlayerUnit unit : chosenUnits) {
				if (!policeRegUnits.contains(unit)) {
					errorMsg.append(unit.getType().getName() + ", ");
				}
			}
			int len = errorMsg.length();
			if (len > 0) {
				errorMsg.setLength(len - 2);
				errorMsg.append(" 已经被选取，请选择其它角色。");
				throw new RPCException(errorMsg.toString());
			}
		}
	}

}
