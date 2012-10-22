package au.com.bglcorp.web.base.jquery.core;

import au.com.bglcorp.web.base.jquery.core.bean.JQueryObject;
import au.com.bglcorp.web.base.jquery.ui.bean.JQueryUIObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.user.client.ui.Widget;

/**
 * This class is to add jquery available
 * 
 * @author GeorgeZeng
 * 
 */
public class JQuery {

  /**
   * jQuery.browser
   */
  public static class Browser {
    public static native String version() /*-{
			return $wnd.jQuery.browser.version;
    }-*/;

    public static native boolean msie() /*-{
			return $wnd.jQuery.browser.msie == true;
    }-*/;
    
    public static native boolean chrome() /*-{
      return $wnd.$.browser.chrome == true;
    }-*/;

    public static native boolean safari() /*-{
      return $wnd.$.browser.safari == true;
    }-*/;

    public static native boolean mozilla() /*-{
			return $wnd.jQuery.browser.mozilla == true;
    }-*/;

    public static native boolean opera() /*-{
			return $wnd.jQuery.browser.opera == true;
    }-*/;

    public static native boolean webkit() /*-{
			return $wnd.jQuery.browser.webkit == true;
    }-*/;

    public static native void close()/*-{
//			var answer = confirm("Do you wnat to close this window ?");
//			if (answer) {
//				netscape.security.PrivilegeManager
//						.enablePrivilege('UniversalBrowserWrite');
//				$wnd.close();
//			} else {
//				stop;
//			}
    $wnd.jQuery($wnd).close();
	//		$wnd.opener = null;
	//		$wnd.open('', '_self');
	//		$wnd.focus()
	//		$wnd.close();
    }-*/;

  }

  /**
   * jQuery.fx
   */
  public static final class FX extends JavaScriptObject {
    public static native int getInterval() /*-{
			return $wnd.jQuery.fx.interval;
    }-*/;

    public static native void setInterval(int milliseconds) /*-{
			$wnd.jQuery.fx.interval = milliseconds;
    }-*/;

    public static native boolean isOff() /*-{
			return $wnd.jQuery.fx.off;
    }-*/;

    public static native void setOff(boolean isOff) /*-{
			$wnd.jQuery.fx.off = isOff;
    }-*/;

    protected FX() {

    }

    public native Element getElement() /*-{
			return this.elem;
    }-*/;

  }

  public static JQueryObject $(Widget widget) {
    return $(widget.getElement());
  }

  public static native JQueryObject $(Element element) /*-{
		return $wnd.jQuery(element);
  }-*/;

  public static native JQueryObject $(Node node) /*-{
		return $wnd.jQuery(node);
  }-*/;

  public static native JQueryObject $(String selector) /*-{
		return $wnd.jQuery(selector);
  }-*/;

  public static native JQueryObject $(String selector, Element context) /*-{
		return $wnd.jQuery(selector, context);
  }-*/;

  public static native JQueryObject $(String selector, JQueryObject context) /*-{
		return $wnd.jQuery(selector, context);
  }-*/;

  public static native JQueryObject $window() /*-{
		return $wnd.jQuery($wnd);
  }-*/;

  public static native JQueryObject $document() /*-{
		return $wnd.jQuery($wnd.document);
  }-*/;

  public static native JQueryUIObject $UI(Node node) /*-{
    return $wnd.$(node);
  }-*/;

}
