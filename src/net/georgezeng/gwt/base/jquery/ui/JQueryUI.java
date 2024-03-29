package net.georgezeng.gwt.base.jquery.ui;

import net.georgezeng.gwt.base.jquery.core.JQuery;
import net.georgezeng.gwt.base.jquery.core.bean.JQueryObject;
import net.georgezeng.gwt.base.jquery.ui.bean.JQueryUIObject;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * JQuery api with ui feature
 * 
 * @author GeorgeZeng
 * 
 */
public class JQueryUI extends JQuery {
  public  static JQueryUIObject $(Widget widget) {
    return $(widget.getElement());
  }

  public static native JQueryUIObject $(Element node) /*-{
		return $wnd.jQuery(node);
  }-*/;

  public static native JQueryUIObject $(String selector) /*-{
		return $wnd.jQuery(selector);
  }-*/;

  public static native JQueryUIObject $(String selector, Element context) /*-{
		return $wnd.jQuery(selector, context);
  }-*/;

  public static native JQueryUIObject $(String selector, JQueryObject context) /*-{
		return $wnd.jQuery(selector, context);
  }-*/;
}
