package au.com.bglcorp.web.base.jquery.core.handler;

import au.com.bglcorp.web.base.jquery.core.handler.base.JQueryHandler;

import com.google.gwt.dom.client.Element;

public interface JQToggleClassHandler extends JQueryHandler {
  String call(Element thisEl, int index, String currentClassNames, boolean currentIsSwitch);
}
