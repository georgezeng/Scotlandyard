package net.georgezeng.misterx.gwt.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.Random;

/**
 * 用于选出游戏者初始位置
 * 
 * @author GeorgeZeng
 * 
 */
public class Locator {

	private static final List<Integer> locations = new ArrayList<Integer>();

	public static final int locate() {
		int num = 0;
		do {
			num = Random.nextInt(199);
		} while (!locations.contains(num));
		locations.add(num);
		return num;
	}
}
