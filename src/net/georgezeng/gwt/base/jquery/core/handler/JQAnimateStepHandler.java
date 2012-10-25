package net.georgezeng.gwt.base.jquery.core.handler;

import net.georgezeng.gwt.base.jquery.core.JQuery;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQueryHandler;

import com.google.gwt.dom.client.Element;

public interface JQAnimateStepHandler extends JQueryHandler {
  void call(Element thisEl, double now, JQuery.FX jqueryFx);
}
