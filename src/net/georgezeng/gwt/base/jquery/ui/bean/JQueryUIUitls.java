package net.georgezeng.gwt.base.jquery.ui.bean;

import net.georgezeng.gwt.base.jquery.core.JQuery;
import net.georgezeng.gwt.base.jquery.core.bean.JQueryObject;

import com.google.gwt.user.client.Element;

 

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
