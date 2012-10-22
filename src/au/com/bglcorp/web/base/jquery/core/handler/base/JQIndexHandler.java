package au.com.bglcorp.web.base.jquery.core.handler.base;

import com.google.gwt.dom.client.Element;

/**
 * 
 * @author GeorgeZeng
 * 
 */
public interface JQIndexHandler<T> extends JQueryHandler {
  T call(int index, Element currentElement);
}
