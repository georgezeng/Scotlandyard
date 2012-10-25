package net.georgezeng.gwt.base.jquery.core.handler.base;

import com.google.gwt.dom.client.Element;

public interface JQValueHandler<T, R> extends JQueryHandler {
  R call(Element thisEl, int index, T currentValue);
}
