package net.georgezeng.misterx.gwt.ui.ticket;

import net.georgezeng.gwt.base.jquery.core.JQuery;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class TicketPanel extends Composite {
	static interface ViewBinder extends UiBinder<Widget, TicketPanel> {

	}

	private static final ViewBinder BINDER = GWT.create(ViewBinder.class);

	private boolean isMisterX;

	@UiField
	DivElement hiddenWalkSign;

	@UiField
	DivElement x2Sign;

	public TicketPanel(boolean isMisterX) {
		this.isMisterX = isMisterX;
		initWidget(BINDER.createAndBindUi(this));
		RootPanel.get().add(this);
		if (!isMisterX) {
			JQuery.$(hiddenWalkSign).remove();
			JQuery.$(x2Sign).remove();
			JQuery.$(this).find("div.ticketPanel_middleTop")
					.css("width", "250px");
			JQuery.$(this).find("div.ticketPanel_middleCenter")
					.css("width", "250px");
			JQuery.$(this).find("div.ticketPanel_middleBottom")
					.css("width", "250px");
		}
		RootPanel.get().addDomHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				JQuery.$(TicketPanel.this).hide();
			}
		}, ClickEvent.getType());
	}

}
