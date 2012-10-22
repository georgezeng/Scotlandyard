package au.com.bglcorp.web.base.jquery.ui.handler;

import au.com.bglcorp.web.base.jquery.ui.bean.UISetting;

import com.google.gwt.user.client.Event;

public interface JQueryUIHandler {
  boolean call(Event event, UISetting ui);
}