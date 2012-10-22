package net.georgezeng.misterx.shared.domain;

import java.io.Serializable;

import net.georgezeng.misterx.shared.enums.PlayerType;
import net.georgezeng.misterx.shared.enums.PlayerUnitType;
import net.georgezeng.misterx.shared.enums.RoadType;
import net.georgezeng.misterx.shared.exception.RPCException;

/**
 * 角色
 * 
 * @author GeorgeZeng
 * 
 */
public class PlayerUnit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PlayerUnitType type;
	private int taxi;
	private int bus;
	private int metro;
	private int x2;
	private int invisible;
	private boolean isMisterX;

	PlayerUnit() {

	}

	public PlayerUnit(PlayerUnitType unitType) {
		this.isMisterX = unitType.equals(PlayerUnitType.MisterX);
		this.type = unitType;
		PlayerType type = isMisterX ? PlayerType.MisterX : PlayerType.Police;
		this.taxi = type.getTaxi();
		this.bus = type.getBus();
		this.metro = type.getMetro();
		if (isMisterX) {
			x2 = 2;
		}
	}

	public boolean isMisterX() {
		return isMisterX;
	}

	public int getTaxi() {
		return taxi;
	}

	public int getBus() {
		return bus;
	}

	public int getX2() {
		return x2;
	}

	public int getInvisible() {
		return invisible;
	}

	public void setInvisibile(int policeNum) {
		this.invisible = policeNum;
	}

	public PlayerUnitType getType() {
		return type;
	}

	public void use(RoadType roadType) {
		switch (roadType) {
		case Taxi: {
			checkResourceRunout(roadType, taxi);
			taxi--;
		}
			break;
		case Bus: {
			checkResourceRunout(roadType, bus);
			bus--;
		}
			break;
		case Metro: {
			checkResourceRunout(roadType, metro);
			metro--;
		}
			break;
		case invisible: {
			checkResourceRunout(roadType, invisible);
			invisible--;
		}
		case x2: {
			checkResourceRunout(roadType, x2);
			x2--;
		}
		}
	}

	private void checkResourceRunout(RoadType roadType, int num) {
		if (num == 0) {
			throw new RPCException(roadType.getName() + "票已经用完，无法使用此类交通工具。");
		}
	}

	/**
	 * 从警察处获取车票
	 * 
	 * @param roadType
	 */
	@SuppressWarnings("incomplete-switch")
	public void get(RoadType roadType) {
		switch (roadType) {
		case Taxi: {
			taxi++;
		}
			break;
		case Bus: {
			bus++;
		}
			break;
		case Metro: {
			metro++;
		}
			break;
		}
	}

}
