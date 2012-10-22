package net.georgezeng.misterx.gwt.ui.map;

import java.util.LinkedHashMap;
import java.util.Map;

import net.georgezeng.misterx.gwt.vo.StationRoads;
import net.georgezeng.misterx.gwt.vo.StationVO;
import net.georgezeng.misterx.shared.enums.RoadType;

public class StationRoadsInfo {
	private static final Map<String, StationRoads> MAP = new LinkedHashMap<String, StationRoads>();

	public static final StationRoads SR1_8 = newSR(Stations.S1, Stations.S8, RoadType.Taxi);
	public static final StationRoads SR1_9 = newSR(Stations.S1, Stations.S9, RoadType.Taxi);

	private static String getKey(StationRoads sr) {
		return sr.getStart().getNum() + "_" + sr.getEnd().getNum();
	}

	public static final void get(StationRoads sr) {
		MAP.get(getKey(sr));
	}

	private static StationRoads newSR(StationVO start, StationVO end,
			RoadType... types) {
		StationRoads sr = new StationRoads(start.getStation(),
				end.getStation(), types);
		MAP.put(getKey(sr), sr);
		return sr;
	}
}
