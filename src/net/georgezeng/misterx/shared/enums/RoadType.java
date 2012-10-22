package net.georgezeng.misterx.shared.enums;

public enum RoadType {
	Taxi("的士", "white"), Bus("巴士", "#37ADA0"), Metro("地铁", "#EB9678"), invisible(
			"隐步", ""), x2("2倍", "");

	private String color;
	private String name;

	private RoadType(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public String getName() {
		return name;
	}
}
