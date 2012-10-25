package net.georgezeng.gwt.base.jquery.ui.bean;

import net.georgezeng.gwt.base.jquery.core.bean.JQueryObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;

public class UISetting extends JavaScriptObject {
  protected UISetting() {

  }

  public final native JQueryObject getHelper() /*-{
		return this.helper;
  }-*/;

  public final native PositionObject getPosition() /*-{
		return this.position;
  }-*/;

  public final native PositionObject getOriginalPosition() /*-{
		return this.originalPosition;
  }-*/;

  public final native PositionObject getOffset() /*-{
		return this.offset;
  }-*/;

  public final native AnchorElement getTab() /*-{
		return this.tab;
  }-*/;

  public final native Element getPanel() /*-{
		return this.panel;
  }-*/;

  public final native int getIndex() /*-{
		return this.index;
  }-*/;

  public final native boolean isChecked() /*-{
		return this.checked;
  }-*/;

  public final native String getValue() /*-{
		return this.value;
  }-*/;

  public final native String getTitle() /*-{
		return this.text;
  }-*/;

}