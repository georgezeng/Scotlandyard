package net.georgezeng.misterx.gwt.vo;

import net.georgezeng.misterx.shared.domain.Station;
import net.georgezeng.misterx.shared.enums.RoadType;

public class StationRoads {
	private Station start;
	private Station end;
	private RoadType[] types;

	public StationRoads(Station start, Station end, RoadType... types) {
		this.start = start;
		this.end = end;
		this.types = types;
	}

	public Station getStart() {
		return start;
	}

	public Station getEnd() {
		return end;
	}

	public RoadType[] getTypes() {
		return types;
	}
	
}
