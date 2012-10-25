package net.georgezeng.gwt.base.jquery.ui.handler;

import net.georgezeng.gwt.base.jquery.ui.bean.UISetting;

import com.google.gwt.user.client.Event;

public interface JQueryUIHandler {
  boolean call(Event event, UISetting ui);
}