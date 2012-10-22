package net.georgezeng.misterx.shared.domain;

import java.io.Serializable;

public class Station implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
	private boolean isBus;
	private boolean isMetro;

	Station() {

	}

	public Station(int num, boolean isBus, boolean isMetro) {
		this.num = num;
		this.isBus = isBus;
		this.isMetro = isMetro;
	}

	public int getNum() {
		return num;
	}

	public boolean isBus() {
		return isBus;
	}

	public boolean isMetro() {
		return isMetro;
	}
}
