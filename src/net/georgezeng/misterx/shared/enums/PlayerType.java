package net.georgezeng.misterx.shared.enums;

public enum PlayerType {
	MisterX(4, 3, 3), Police(10, 8, 4);

	private int taxi;
	private int bus;
	private int metro;

	private PlayerType(int taxi, int bus, int metro) {
		this.taxi = taxi;
		this.bus = bus;
		this.metro = metro;
	}

	public int getTaxi() {
		return taxi;
	}

	public int getBus() {
		return bus;
	}

	public int getMetro() {
		return metro;
	}

}
