package net.georgezeng.misterx.shared.enums;

public enum PlayerUnitType {
	MisterX("X先生"), PoliceA("警察-A"), PoliceB("警察-B"), PoliceC("警察-C"), PoliceD("警察-D"), PoliceE("警察-E");

	private String name;

	private PlayerUnitType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
