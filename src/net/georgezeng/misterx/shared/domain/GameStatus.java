package net.georgezeng.misterx.shared.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GameStatus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean isGaming;
	private List<PlayerUnit> policeUnits = new ArrayList<PlayerUnit>();
	private Player misterX;
	private Player host;
	private List<Player> policePlayers = new ArrayList<Player>();
	private String key;
	private List<Player> totalPlayers = new ArrayList<Player>();

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
		totalPlayers.add(host);
	}

	public boolean isHost(Player player) {
		return host.getName().equals(player.getName());
	}

	public List<Player> getPolicePlayers() {
		return policePlayers;
	}

	public void addPolice(Player player) {
		policePlayers.add(player);
		policeUnits.addAll(player.getUnits());
		totalPlayers.add(player);
	}

	public void goToNextHost(Player quitPlayer) {
		clearPlayer(quitPlayer);
		host = null;
		if (misterX != null && misterX.equals(quitPlayer)) {
			misterX = null;
		}
		if (totalPlayers.size() > 0) {
			host = totalPlayers.get(0);
		}
		if (host != null && host.isMisterX()) {
			misterX = host;
		}
	}

	public void clearPlayer(Player quitPlayer) {
		policePlayers.remove(quitPlayer);
		totalPlayers.remove(quitPlayer);
	}

}
