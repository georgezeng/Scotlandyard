package au.com.bglcorp.web.base.jquery.core.bean.event;

 

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;
import au.com.bglcorp.web.base.js.util.JSObject;


public class JQEvent extends JavaScriptObject {
  protected JQEvent() {

  }

  public final native Element getTarget() /*-{
		return this.target;
  }-*/;

  public final native Element getRelatedTarget() /*-{
		return this.relatedTarget;
  }-*/;

  public final native int getPageX() /*-{
		return this.pageX;
  }-*/;

  public final native int getPageY() /*-{
		return this.pageY;
  }-*/;

  public final native int getWhich() /*-{
		return this.which;
  }-*/;

  public final native boolean isMetaKey() /*-{
		return this.metaKey;
  }-*/;

  public final native Element getCurrentTarget() /*-{
		return this.currentTarget;
  }-*/;

  public final native Element getDelegateTarget() /*-{
		return this.delegateTarget;
  }-*/;

  public final native Event getOriginalEvent() /*-{
		return this.originalEvent;
  }-*/;

  public final JQEventType getType() {
    return JSObject.valueOf(JQEventType.class, getTypeNative());
  }

  private final native String getTypeNative() /*-{
		return this.type;
  }-*/;

  public final native String getNameSpace() /*-{
		return this.namespace;
  }-*/;

  public final native void stopImmediatePropagation() /*-{
		this.stopImmediatePropagation();
  }-*/;

  public final native void stopPropagation() /*-{
		this.stopPropagation();
  }-*/;

  public final native void preventDefault() /*-{
		this.preventDefault();
  }-*/;

  public final native boolean isImmediatePropagationStopped() /*-{
		return this.isImmediatePropagationStopped();
  }-*/;

  public final native boolean isPropagationStopped() /*-{
		return this.isPropagationStopped();
  }-*/;

  public final native boolean isDefaultPrevented() /*-{
		return this.isDefaultPrevented();
  }-*/;
}
