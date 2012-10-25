package net.georgezeng.gwt.base.jquery.core.util;

import java.util.Map;

import net.georgezeng.gwt.base.jquery.core.bean.JQueryObject;
import net.georgezeng.gwt.base.jquery.core.bean.animate.AnimateOptions;
import net.georgezeng.gwt.base.jquery.core.handler.JQToggleClassHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQEventHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQIndexHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQValueHandler;
import net.georgezeng.gwt.base.js.util.JavaScriptObjectFunctions;
 

public class JQueryObjectFunctions extends JavaScriptObjectFunctions {
  protected JQueryObjectFunctions(){
    
  }
  public final native static <T> T treatWithJQIndexHandler(JQueryObject jqObj, String functionName,
      JQIndexHandler<?> handler) /*-{
		return jqObj[functionName]
				(function(index, currentElement) {
					return handler.@net.georgezeng.gwt.base.jquery.core.handler.base.JQIndexHandler::call(ILcom/google/gwt/dom/client/Element;)(index, currentElement);
				});
  }-*/;

  public final native static <T> T treatWithJQCommonHandler(JQueryObject jqObj,
      String functionName, JQCommonHandler handler) /*-{
		return jqObj[functionName]
				(function(index, currentValue) {
					return handler.@net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler::call(Lcom/google/gwt/dom/client/Element;)(this);
				});
  }-*/;

  public final native static <T> T treatWithJQValueHandler(JQueryObject jqObj, String functionName,
      JQValueHandler<?, ?> handler) /*-{
		return jqObj[functionName]
				(function(index, currentValue) {
					return handler.@net.georgezeng.gwt.base.jquery.core.handler.base.JQValueHandler::call(Lcom/google/gwt/dom/client/Element;ILjava/lang/Object;)(this, index, currentValue);
				});
  }-*/;

  public final static <T> String concat(T... types) {
    if (types != null && types.length > 0) {
      if (types.length > 1) {
        String typesStr = "";
        for (T type : types) {
          typesStr += type.toString() + " ";
        }
        return typesStr.substring(0, typesStr.length() - 1);
      } else {
        return types[0].toString() + "";
      }
    }
    return null;
  }

  public final static JQueryObject treatClass(JQueryObject jqObj, String functionName,
      String... classNames) {
    return treatClassNative(jqObj, functionName, concat(classNames));
  }

  private final native static JQueryObject treatClassNative(JQueryObject jqObj,
      String functionName, String classNames) /*-{
		return jqObj[functionName](classNames);
  }-*/;

  public final native static JQueryObject toggleClass(JQueryObject jqObj,
      JQToggleClassHandler handler, boolean isSwitch) /*-{
		return jqObj
				.toggleClass(
						function(index, currrentClassName, currrentIsSwitch) {
							return handler.@net.georgezeng.gwt.base.jquery.core.handler.JQToggleClassHandler::call(Lcom/google/gwt/dom/client/Element;ILjava/lang/String;Z)(this, index, currrentClassName, currrentIsSwitch);
						}, isSwitch);
  }-*/;

  public final native static JQueryObject treatProperty(JQueryObject jqObj, String functionName,
      String propName, String propValue) /*-{
		return jqObj[functionName](propName, propValue);
  }-*/;

  public final static JQueryObject treatProperty(JQueryObject jqObj, String functionName,
      Map<String, String> props) {
    for (Map.Entry<String, String> entry : props.entrySet()) {
      treatProperty(jqObj, functionName, entry.getKey(), entry.getValue());
    }
    return jqObj;
  }

  public final native static JQueryObject treatProperty(JQueryObject jqObj, String functionName,
      String propName, JQValueHandler<?, ?> handler) /*-{
		return jqObj[functionName]
				(
						propName,
						function(index, currentValue) {
							return handler.@net.georgezeng.gwt.base.jquery.core.handler.base.JQValueHandler::call(Lcom/google/gwt/dom/client/Element;ILjava/lang/Object;)(index, currentValue);
						});
  }-*/;

  public final native static <T> T getPropertyValue(JQueryObject jqObj, String functionName,
      String propName) /*-{
		return jqObj[functionName](propName);
  }-*/;

  public final native static JQueryObject treatAnimate(JQueryObject jqObj, String functionName,
      AnimateOptions options) /*-{
		var argumentArr = [];
		if (options.duration) {
			argumentArr.push(options.duration);
		}
		if (options.opacity) {
			argumentArr.push(options.opacity);
		}
		if (options.easing) {
			argumentArr.push(options.easing);
		}
		if (options.complete) {
			argumentArr.push(options.complete);
		}
		return jqObj[functionName].apply(jqObj, argumentArr);
  }-*/;

  public final native static JQueryObject treatEvent(JQueryObject jqObj, String functionName,
      String selector, String eventTypes, JQEventHandler handler,
      boolean exchangeArgumentPositionForSelectorAndEventTypes) /*-{
		var argumentArr = [];
		if (!exchangeArgumentPositionForSelectorAndEventTypes) {
			if (selector) {
				argumentArr.push(selector);
			}
			if (eventTypes) {
				argumentArr.push(eventTypes);
			}
		} else {
			if (eventTypes) {
				argumentArr.push(eventTypes);
			}
			if (selector) {
				argumentArr.push(selector);
			}
		}
		if (handler) {
			argumentArr
					.push(function(event) {
						handler.@net.georgezeng.gwt.base.jquery.core.handler.base.JQEventHandler::call(Lcom/google/gwt/dom/client/Element;Lau/com/bglcorp/web/base/jquery/core/bean/event/JQEvent;)(this, event);
					});
		}
		return jqObj[functionName].apply(jqObj, argumentArr);
  }-*/;

  public final static JQueryObject treatEvent(JQueryObject jqObj, String functionName,
      String selector, String eventTypes, JQEventHandler handler) {
    return treatEvent(jqObj, functionName, selector, eventTypes, handler, false);
  }

}
