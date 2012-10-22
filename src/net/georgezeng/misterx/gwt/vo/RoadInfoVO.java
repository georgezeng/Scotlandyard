package net.georgezeng.misterx.gwt.vo;

import net.georgezeng.misterx.shared.enums.RoadSide;
import net.georgezeng.misterx.shared.enums.RoadType;

public class RoadInfoVO {
	private RoadType type;
	private RoadSide side;

	public RoadInfoVO(RoadType type, RoadSide side) {
		this.type = type;
		this.side = side;
	}

	public RoadType getType() {
		return type;
	}

	public void setType(RoadType type) {
		this.type = type;
	}

	public RoadSide getSide() {
		return side;
	}

	public void setSide(RoadSide side) {
		this.side = side;
	}

}
