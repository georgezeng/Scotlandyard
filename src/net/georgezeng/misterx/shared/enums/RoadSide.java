package net.georgezeng.misterx.shared.enums;

public enum RoadSide {
	Left(-1), Middle(0), Right(1);

	private static final int DELTA = 12;
	private int by;

	private RoadSide(int by) {
		this.by = by;
	}

	public int getDelta() {
		return by * DELTA;
	}
	
	public int getBy() {
		return by;
	}

}
