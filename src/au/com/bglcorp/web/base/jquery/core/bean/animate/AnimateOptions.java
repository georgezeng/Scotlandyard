package au.com.bglcorp.web.base.jquery.core.bean.animate;

import au.com.bglcorp.web.base.jquery.core.handler.JQAnimateStepHandler;
import au.com.bglcorp.web.base.jquery.core.handler.base.JQCommonHandler;
import au.com.bglcorp.web.base.js.util.JavaScriptObjectFunctions;
import au.com.bglcorp.web.base.js.util.JavaScriptObjectWrapper;
import au.com.bglcorp.web.base.js.util.JSObject;
 
 

import com.google.gwt.core.client.JavaScriptObject;

public class AnimateOptions extends JavaScriptObject {
  protected AnimateOptions() {

  }

  public final native void setDuration(Integer duration) /*-{
		this.duration = duration;
  }-*/;

  public final native Integer getDurationTime() /*-{
		if (!$wnd.isNaN(this.duration)) {
			return this.duration;
		} else {
			return null;
		}
  }-*/;

  public final void setDuration(AnimateDuration duration) {
    setDurationNative(duration.name());
  }

  private final native void setDurationNative(String duration) /*-{
		this.duration = duration;
  }-*/;

  public final AnimateDuration getDuration() {
    return JSObject.valueOf(AnimateDuration.class, getDurationNative());
  }

  private final native String getDurationNative() /*-{
		if (typeof (this.duration) == 'string') {
			return this.duration;
		} else {
			return null;
		}
  }-*/;

  public final native void setOpacity(Double opacity) /*-{
		this.opacity = opacity;
  }-*/;

  public final native Double getOpacity() /*-{
		return this.opacity;
  }-*/;

  public final void setEasing(AnimateEasing easing) {
    setEasingNative(easing.name());
  }

  private final native void setEasingNative(String easing) /*-{
		this.easing = easing;
  }-*/;

  public final AnimateEasing getEasing() {
    return JSObject.valueOf(AnimateEasing.class, JavaScriptObjectFunctions.getPropertyValue(this,
        "easing", String.class));
  }

  public final native void setCompleteHandler(JQCommonHandler handler) /*-{
		this.complete = function() {
			handler.@au.com.bglcorp.web.base.jquery.core.handler.base.JQCommonHandler::call(Lcom/google/gwt/dom/client/Element;)(this);
		};
  }-*/;

  public final native void setStepHandler(JQAnimateStepHandler handler) /*-{
		this.step = function(now, fx) {
			handler.@au.com.bglcorp.web.base.jquery.core.handler.JQAnimateStepHandler::call(Lcom/google/gwt/dom/client/Element;DLau/com/bglcorp/web/base/jquery/core/JQuery$FX;)(this, now, fx);
		};
  }-*/;

  public final native void clearCompleteHandler() /*-{
		this.complete = null;
  }-*/;

  public final native void clearStepHandler() /*-{
		this.step = null;
  }-*/;

  public final native void setInQueue(boolean isInQueue) /*-{
		this.queue = isInQueue;
  }-*/;

  public final native boolean isInQueue() /*-{
		return this.queue;
  }-*/;

  public final native void setQueueName(String queueName) /*-{
		this.queue = queueName;
  }-*/;

  public final native String getQueueName() /*-{
		return this.queue;
  }-*/;

  public final native void setSpecialEasing(JavaScriptObjectWrapper specialEasing) /*-{
		this.specialEasing = specialEasing;
  }-*/;

  public final native JavaScriptObjectWrapper getSpecialEasing() /*-{
		return this.specialEasing;
  }-*/;
}
