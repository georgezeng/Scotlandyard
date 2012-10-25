package net.georgezeng.gwt.base.jquery.core.bean;

import com.google.gwt.core.client.JavaScriptObject;

public final class Position extends JavaScriptObject {
  protected Position() {

  }

  public final native double getTop() /*-{
		return this.top;
  }-*/;

  public final native void setTop(double top) /*-{
		this.top = top;
  }-*/;

  public final native double getLeft() /*-{
		return this.left;
  }-*/;

  public final native void setLeft(double left) /*-{
		this.left = left;
  }-*/;

  public final native void setLeftAuto() /*-{
		this.left = 'auto';
  }-*/;

  public final native void setTopAuto() /*-{
		this.top = 'auto';
  }-*/;
}
