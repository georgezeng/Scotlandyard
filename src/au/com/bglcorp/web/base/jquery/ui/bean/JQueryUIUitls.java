package au.com.bglcorp.web.base.jquery.ui.bean;

import au.com.bglcorp.web.base.jquery.core.JQuery;
import au.com.bglcorp.web.base.jquery.core.bean.JQueryObject;

import com.google.gwt.user.client.Element;

 

/**
 * @author Denny(Kong Fan Zhi)
 * @date 2011-12-10
 * 
 */
public class JQueryUIUitls {


  public static void enabled(Element element, boolean isEnabled) {
    enabled(JQuery.$(element), isEnabled);
  }

  public static void enabled(JQueryObject jElement, boolean isEnabled) {
    if (isEnabled) {
      jElement.removeClass("ui-state-disabled").enabled(true);
    } else {
      jElement.addClass("ui-state-disabled").enabled(false);
    }
  }
  
  public static native void jTipInit() /*-{
    $wnd.JT_init();
  }-*/;

}
