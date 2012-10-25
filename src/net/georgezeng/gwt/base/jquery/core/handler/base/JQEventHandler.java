package net.georgezeng.gwt.base.jquery.core.handler.base;

import net.georgezeng.gwt.base.jquery.core.bean.event.JQEvent;

import com.google.gwt.dom.client.Element;

public interface JQEventHandler extends JQueryHandler {
  void call(Element thisEl, JQEvent jqEvent);
}
