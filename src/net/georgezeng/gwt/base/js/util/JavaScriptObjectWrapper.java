package net.georgezeng.gwt.base.js.util;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Use this to build a javascript object in quick mode
 * 
 * @author GeorgeZeng
 * 
 */
public class JavaScriptObjectWrapper extends JavaScriptObject {
  protected JavaScriptObjectWrapper() {

  }

  public final native void setValue(String propName, Object value) /*-{
		this[propName] = value;
  }-*/;

  @SuppressWarnings("unchecked")
  public final <T> T getValue(String propName) {
    return (T) getValueNative(propName);
  }

  private final native <T> T getValueNative(String propName) /*-{
		return this[propName];
  }-*/;

}
