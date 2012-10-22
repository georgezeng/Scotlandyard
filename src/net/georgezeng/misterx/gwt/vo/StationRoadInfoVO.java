package net.georgezeng.misterx.gwt.vo;

import net.georgezeng.misterx.shared.enums.StationCompareInfo;

public class StationRoadInfoVO {
	private StationVO start;
	private StationVO end;
	private RoadInfoVO[] roads;

	public StationRoadInfoVO(StationVO start, StationVO end, RoadInfoVO... roads) {
		if (start.getLocX() > end.getLocX()) {
			this.start = end;
			this.end = start;
		} else {
			this.start = start;
			this.end = end;
		}
		this.roads = roads;
	}

	public StationVO getStart() {
		return start;
	}

	public void setStart(StationVO start) {
		this.start = start;
	}

	public StationVO getEnd() {
		return end;
	}

	public void setEnd(StationVO end) {
		this.end = end;
	}

	private StationCompareInfo getCompareInfo() {
		if (start.getLocX() == end.getLocX()) {
			return StationCompareInfo.sameX;
		}
		if (start.getLocY() == end.getLocY()) {
			return StationCompareInfo.sameY;
		}
		if (start.getLocY() > end.getLocY()) {
			return StationCompareInfo.highY;
		}
		return StationCompareInfo.lowY;
	}

	public RoadInfoVO[] getRoads() {
		return roads;
	}

	public void setRoads(RoadInfoVO[] roads) {
		this.roads = roads;
	}

	private double startX;
	private double startY;
	private double endX;
	private double endY;

	public void calculate(RoadInfoVO road) {
		int roadDelta = road.getSide().getDelta();
		switch (getCompareInfo()) {
		case sameX: {
			startX = start.getLocX() + roadDelta;
			startY = start.getLocY();
			endX = end.getLocX() + roadDelta;
			endY = end.getLocY();
		}
			return;
		case sameY: {
			startX = start.getLocX();
			startY = start.getLocY() + roadDelta;
			endX = end.getLocX();
			endY = end.getLocY() + roadDelta;
		}
			return;
		case highY: {
			double halfX = getHalfX(road);
			double halfY = getHalfY(road);
			double triangleX = end.getLocX() - halfX;
			double triangleY = halfY - end.getLocY();
			double triangleDelta = getSqrt(triangleX, triangleY);
			double deltaX = triangleY / triangleDelta * roadDelta;
			double deltaY = triangleX / triangleDelta * roadDelta;
			startX = start.getLocX() + deltaX;
			startY = start.getLocY() + deltaY;
			endX = end.getLocX() + deltaX;
			endY = end.getLocY() + deltaY;
		}
			return;
		case lowY: {
			double halfX = getHalfX(road);
			double halfY = getHalfY(road);
			double triangleX = halfX - start.getLocX();
			double triangleY = halfY - start.getLocY();
			double triangleDelta = getSqrt(triangleX, triangleY);
			double deltaX = triangleY / triangleDelta * roadDelta;
			double deltaY = triangleX / triangleDelta * roadDelta;
			startX = start.getLocX() + deltaX;
			startY = start.getLocY() - deltaY;
			endX = end.getLocX() + deltaX;
			endY = end.getLocY() - deltaY;
		}
			return;
		}
	}

	private double getHalfX(RoadInfoVO road) {
		double startX = start.getLocX();
		double endX = end.getLocX();
		return startX + (endX - startX) / 2;
	}

	private double getHalfY(RoadInfoVO road) {
		double startY = start.getLocY();
		double endY = end.getLocY();
		return startY + (endY - startY) / 2;
	}

	private double getSqrt(double deltaX, double deltaY) {
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}

	public double getStartX() {
		return startX;
	}

	public double getStartY() {
		return startY;
	}

	public double getEndX() {
		return endX;
	}

	public double getEndY() {
		return endY;
	}

}
