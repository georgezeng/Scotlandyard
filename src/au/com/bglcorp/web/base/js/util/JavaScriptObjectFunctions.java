package au.com.bglcorp.web.base.js.util;

import com.google.gwt.core.client.JavaScriptObject;

public class JavaScriptObjectFunctions {
  protected JavaScriptObjectFunctions(){
    
  }
  public final native static void call(JavaScriptObject jsObject, String functionName) /*-{
		jsObject[functionName]();
  }-*/;

  @SuppressWarnings("unchecked")
  public final static <T> T getPropertyValue(JavaScriptObject jsObject, String propertyName,
      Class<T> clazz) {
    Object result = getPropertyValue(jsObject, propertyName);
    if (result != null && result.getClass().equals(clazz)) {
      return (T) result;
    }
    return null;
  }

  private final native static Object getPropertyValue(JavaScriptObject jsObject, String propertyName) /*-{
		return jsObject[propertyName];
  }-*/;

  public final static void setPropertyValue(JavaScriptObject jsObject, String propertyName,
      Enum<?> value) {
    setPropertyValueNative(jsObject, propertyName, value.name());
  }

  public final static void setPropertyValue(JavaScriptObject jsObject, String propertyName,
      String value) {
    setPropertyValueNative(jsObject, propertyName, value);
  }

  public final static void setPropertyValue(JavaScriptObject jsObject, String propertyName,
      Integer value) {
    setPropertyValueNative(jsObject, propertyName, value);
  }

  public final static void setPropertyValue(JavaScriptObject jsObject, String propertyName,
      Double value) {
    setPropertyValueNative(jsObject, propertyName, value);
  }

  private final native static Object setPropertyValueNative(JavaScriptObject jsObject,
      String propertyName, Object value) /*-{
		jsObject[propertyName] = value;
  }-*/;

}
