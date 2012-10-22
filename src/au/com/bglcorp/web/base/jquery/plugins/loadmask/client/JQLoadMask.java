package au.com.bglcorp.web.base.jquery.plugins.loadmask.client;

import au.com.bglcorp.web.base.jquery.core.bean.JQueryObject;

import com.google.gwt.dom.client.Element;

/**
 * @author Denny(Kong Fan Zhi)
 * @date 2012-4-24
 * 
 */
public class JQLoadMask {
  
  public static void loading(JQueryObject object) {
    mask(object, "Loading",false);
  };


  public static void loading(String selector) {
    mask(selector, "Loading",false);
  };

  public static void waiting(String selector) {
    mask(selector, "Waiting",false);
  };

  public static void loading(Element node) {
    mask(node, "Loading",false);
  };

  public static void waiting(Element node) {
    mask(node, "Waiting",false);
  };
  
  public static void loading(String selector,boolean isHideMask) {
    mask(selector, "Loading",isHideMask);
  };

  public static void waiting(String selector,boolean isHideMask) {
    mask(selector, "Waiting",isHideMask);
  };

  public static void loading(Element node,boolean isHideMask) {
    mask(node, "Loading",isHideMask);
  };

  public static void waiting(Element node,boolean isHideMask) {
    mask(node, "Waiting",isHideMask);
  };

  public static native void mask(String selector, String msg,boolean isHideMask) /*-{
		$wnd.jQuery(selector).mask(msg,isHideMask);
  }-*/;
  
  public static native void mask(JQueryObject obj, String msg,boolean isHideMask) /*-{
  $wnd.jQuery(obj).mask(msg,isHideMask);
}-*/;

  public static native void mask(String selector, String msg,boolean isHideMask, int delay) /*-{
		$wnd.jQuery(selector).mask(msg,isHideMask, delay);
  }-*/;

  public static native void mask(Element node, String msg,boolean isHideMask) /*-{
		$wnd.jQuery(node).mask(msg,isHideMask);
  }-*/;

  public static native void mask(Element node, String msg, boolean isHideMask,int delay) /*-{
		$wnd.jQuery(node).mask(msg, isHideMask,delay);
  }-*/;

  public static native void unmask(Element node) /*-{
		$wnd.jQuery(node).unmask();
  }-*/;

  public static native void unmask(String selector) /*-{
		$wnd.jQuery(selector).unmask();
  }-*/;
}
