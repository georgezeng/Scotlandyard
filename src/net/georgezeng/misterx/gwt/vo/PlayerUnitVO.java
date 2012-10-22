package net.georgezeng.misterx.gwt.vo;

import net.georgezeng.misterx.shared.domain.PlayerUnit;
import au.com.bglcorp.web.base.jquery.core.JQuery;
import au.com.bglcorp.web.base.jquery.core.bean.JQueryObject;
import au.com.bglcorp.web.base.jquery.core.bean.Position;

import com.google.gwt.user.client.ui.RootPanel;

public class PlayerUnitVO {
	public static final String MISTERX = "MisterX";
	public static final String POLICE_RED = "policeRed";
	public static final String POLICE_GREEN = "policeGreen";
	public static final String POLICE_BLUE = "policeBlue";
	public static final String POLICE_PINK = "policePink";
	public static final String POLICE_YELLOW = "policeYellow";

	private PlayerUnit unit;
	private JQueryObject jUnit;

	public PlayerUnitVO(PlayerUnit unit, String roleName) {
		this.unit = unit;
		jUnit = JQuery.$("<div></div>").appendTo(RootPanel.getBodyElement());
		jUnit.addClass("stationHolder", roleName);
	}

	public PlayerUnit getRole() {
		return unit;
	}

	public void inPosition(Position offset) {
		jUnit.offset(offset);
	}
}
