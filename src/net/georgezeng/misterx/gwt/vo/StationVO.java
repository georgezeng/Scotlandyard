package net.georgezeng.misterx.gwt.vo;

import net.georgezeng.misterx.gwt.Entry;
import net.georgezeng.misterx.shared.domain.Station;
import au.com.bglcorp.web.base.jquery.core.JQuery;
import au.com.bglcorp.web.base.jquery.core.bean.JQueryObject;
import au.com.bglcorp.web.base.jquery.core.bean.Position;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class StationVO {
	private double locX;
	private double locY;
	private JQueryObject holder;
	private PlayerUnitVO currentPlayer;
	private Station station;

	public StationVO(int num, double locX, double locY, boolean isBus,
			boolean isMetro) {
		station = new Station(num, isBus, isMetro);
		this.locX = locX;
		this.locY = locY;
		holder = JQuery.$("<div></div>").appendTo(RootPanel.getBodyElement());
		holder.css("top", (locY - 32) + "px");
		holder.css("left", (locX - 32) + "px");
		holder.addClass("stationHolder");
		HTMLPanel holderPanel = HTMLPanel.wrap(holder.getElement());
		holderPanel.addDomHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				if (currentPlayer == null) {
					Position offset = holder.offset();
					JQuery.$(Entry.TICKET_PANEL)
							.show()
							.offset((int) offset.getTop() + 73,
									(int) offset.getLeft());
				}
				event.stopPropagation();
			}
		}, ClickEvent.getType());
	}

	public double getLocX() {
		return locX;
	}

	public void setLocX(double locX) {
		this.locX = locX;
	}

	public double getLocY() {
		return locY;
	}

	public void setLocY(double locY) {
		this.locY = locY;
	}

	public PlayerUnitVO getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(PlayerUnitVO currentPlayer) {
		this.currentPlayer = currentPlayer;
		currentPlayer.inPosition(holder.offset());
	}

	public Station getStation() {
		return station;
	}

}
