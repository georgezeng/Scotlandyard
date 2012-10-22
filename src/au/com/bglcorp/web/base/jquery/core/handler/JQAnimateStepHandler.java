package au.com.bglcorp.web.base.jquery.core.handler;

import au.com.bglcorp.web.base.jquery.core.JQuery;
import au.com.bglcorp.web.base.jquery.core.handler.base.JQueryHandler;

import com.google.gwt.dom.client.Element;

public interface JQAnimateStepHandler extends JQueryHandler {
  void call(Element thisEl, double now, JQuery.FX jqueryFx);
}
