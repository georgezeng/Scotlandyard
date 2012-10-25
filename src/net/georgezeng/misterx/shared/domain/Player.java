package net.georgezeng.misterx.shared.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 玩家
 * 
 * @author GeorgeZeng
 * 
 */
public class Player implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private List<PlayerUnit> units;
	private List<Integer> record = new ArrayList<Integer>();
	private String key;

	Player() {

	}

	public Player(String name, List<PlayerUnit> units, String key) {
		this.name = name;
		this.units = units;
		this.key = key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}

	public boolean isHost() {
		return key != null;
	}

	public String getName() {
		return name;
	}

	public List<PlayerUnit> getUnits() {
		return units;
	}

	public void track(int num) {
		record.add(num);
	}

	public boolean isMisterX() {
		return units.get(0).isMisterX();
	}

	public String getKey() {
		return key;
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object instanceof Player) {
			Player tmp = (Player) object;
			return this.name.equals(tmp.name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return ("Player_" + this.name).hashCode();
	}

}
