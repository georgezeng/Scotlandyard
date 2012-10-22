package au.com.bglcorp.web.base.jquery.ui.widget.accordion;

import au.com.bglcorp.web.base.jquery.core.bean.animate.AnimateEasing;
import au.com.bglcorp.web.base.jquery.ui.bean.BaseOptions;
import au.com.bglcorp.web.base.js.util.JavaScriptObjectFunctions;

import com.google.gwt.dom.client.Element;

public class AccordionOption extends BaseOptions {
  protected AccordionOption() {

  }

  public final native void setActiveSelector(String selector) /*-{
		this.active = selector;
  }-*/;

  public final String getActiveSelector() {
    return JavaScriptObjectFunctions.getPropertyValue(this, "active", String.class);
  }

  public final native void setActiveElement(Element element) /*-{
		this.active = element;
  }-*/;

  public final Element getActiveElement() {
    return JavaScriptObjectFunctions.getPropertyValue(this, "active", Element.class);
  }

  public final native void setActive(int index) /*-{
		this.active = index;
  }-*/;

  public final Integer getActiveIndex() {
    return JavaScriptObjectFunctions.getPropertyValue(this, "active", Integer.class);
  }

  public final native void setAnimated(AnimateEasing easing) /*-{
		this.animated = easing;
  }-*/;

  public final AnimateEasing getAnimated() {
    String animated = JavaScriptObjectFunctions.getPropertyValue(this, "animated", String.class);
    return AnimateEasing.valueOf(AnimateEasing.class, animated);
  }

  public final native void setAnimated(boolean isAnimated) /*-{
		this.animated = isAnimated;
  }-*/;

  public final Boolean isAnimated() {
    return JavaScriptObjectFunctions.getPropertyValue(this, "animated", Boolean.class);
  }

}
