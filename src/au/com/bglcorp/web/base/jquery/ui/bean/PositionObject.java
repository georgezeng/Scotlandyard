package au.com.bglcorp.web.base.jquery.ui.bean;

import com.google.gwt.core.client.JavaScriptObject;

public class PositionObject extends JavaScriptObject {
  protected PositionObject() {

  }

  public final native int getTop() /*-{
		return this.top;
  }-*/;

  public final native void setTop(int top) /*-{
		this.top = top;
  }-*/;

  public final native int getLeft() /*-{
		return this.left;
  }-*/;

  public final native void setLeft(int left) /*-{
		this.left = left;
  }-*/;
}
