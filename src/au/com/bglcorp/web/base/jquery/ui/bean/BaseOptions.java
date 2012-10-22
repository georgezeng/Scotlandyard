package au.com.bglcorp.web.base.jquery.ui.bean;

import com.google.gwt.core.client.JavaScriptObject;

public class BaseOptions extends JavaScriptObject {
  protected BaseOptions() {

  }

  public final native void setDisabled(boolean isDisabled) /*-{
		this.disabled = isDisabled;
  }-*/;

  public final native boolean isDisabled() /*-{
		return this.disabled;
  }-*/;

}
