package net.georgezeng.misterx.gwt.ui.map;

import net.georgezeng.misterx.gwt.vo.RoadInfoVO;
import net.georgezeng.misterx.gwt.vo.StationVO;
import net.georgezeng.misterx.gwt.vo.StationRoadInfoVO;
import net.georgezeng.misterx.shared.enums.RoadType;

import com.google.gwt.canvas.dom.client.Context2d;

public class Creator {
	private Context2d ctx;
	private String taxiColor = RoadType.Taxi.getColor();
	private String busColor = RoadType.Bus.getColor();
	private String metroColor = RoadType.Metro.getColor();
	private String stationOutLineColor = "black";

	public Creator(Context2d ctx) {
		this.ctx = ctx;
	}

	public void draw() {
		for (StationRoadInfoVO info : RoadInfos.LIST) {
			drawRoad(info);
		}

		for (StationVO s : Stations.MAP.values()) {
			drawStation(s);
		}
	}

	private void drawRoad(StationRoadInfoVO info) {
		for (RoadInfoVO road : info.getRoads()) {
			drawRoad(info, road);
		}
	}

	private void drawRoad(StationRoadInfoVO info, RoadInfoVO road) {
		info.calculate(road);
		ctx.beginPath();
		ctx.setStrokeStyle(road.getType().getColor());
		ctx.setLineWidth(5);
		ctx.moveTo(info.getStartX(), info.getStartY());
		ctx.lineTo(info.getEndX(), info.getEndY());
		ctx.stroke();
		ctx.closePath();
	}

	private void drawStation(StationVO s) {
		int stationRadius = 30;

		ctx.beginPath();
		ctx.setFillStyle(taxiColor);
		ctx.arc(s.getLocX(), s.getLocY(), stationRadius, 0, Math.PI, true);
		ctx.fill();
		ctx.setStrokeStyle(stationOutLineColor);
		ctx.setLineWidth(1);
		ctx.moveTo(s.getLocX() - stationRadius, s.getLocY());
		ctx.lineTo(s.getLocX() + stationRadius, s.getLocY());
		ctx.stroke();
		ctx.closePath();

		ctx.beginPath();
		ctx.setFillStyle(s.getStation().isBus() ? busColor : taxiColor);
		ctx.arc(s.getLocX(), s.getLocY(), stationRadius, 0, Math.PI, false);
		ctx.fill();
		ctx.setStrokeStyle(stationOutLineColor);
		ctx.setLineWidth(1);
		ctx.stroke();
		ctx.closePath();

		ctx.beginPath();
		ctx.strokeRect(s.getLocX() - stationRadius + 10, s.getLocY() - 15, 40,
				30);
		ctx.setFillStyle(s.getStation().isMetro() ? metroColor : taxiColor);
		ctx.fillRect(s.getLocX() - stationRadius + 10, s.getLocY() - 15, 40, 30);
		ctx.closePath();

		ctx.beginPath();
		ctx.setFillStyle(stationOutLineColor);
		ctx.setLineWidth(1);
		ctx.setFont("italic 22px sans-serif");
		double startTextX = s.getLocX() - stationRadius + 23;
		double startTextY = s.getLocY() + 8;
		if (s.getStation().getNum() > 99) {
			startTextX -= 11;
		} else if (s.getStation().getNum() > 9) {
			startTextX -= 5;
		}
		ctx.fillText(s.getStation().getNum() + "", startTextX, startTextY);
		ctx.closePath();
	}
}
