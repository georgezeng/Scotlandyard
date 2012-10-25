package net.georgezeng.gwt.base.jquery.ui.widget.dialog;

import net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler;
import net.georgezeng.gwt.base.jquery.ui.bean.BaseOptions;

import com.google.gwt.core.client.JsArray;

public class DialogOptions extends BaseOptions {
  protected DialogOptions() {

  }

  public native final void setButtons(JsArray<DialogButton> buttons) /*-{
		this.buttons = buttons;
  }-*/;

  public native final void setTitle(String title) /*-{
		this.title = title;
  }-*/;

  public native final void setResizable(boolean resizable) /*-{
		this.resizable = resizable;
  }-*/;

  public native final void setWidth(int width) /*-{
		this.width = width;
  }-*/;

  public native final String getWidth() /*-{
		return this.width + "";
  }-*/;

  public native final void setAutoWidth() /*-{
		this.width = 'auto';
  }-*/;

  public native final boolean isAutoWidth() /*-{
		return !(this.width > 0);
  }-*/;

  public native final void setHeight(int height) /*-{
		this.height = height;
  }-*/;

  public native final void setAutoHeight() /*-{
		this.height = 'auto';
  }-*/;

  public native final void setModal(boolean modal) /*-{
		this.modal = modal;
  }-*/;
  
  public native final void addButton(String buttonName, JQCommonHandler handler) /*-{
	
  }-*/;
  
  public native final void closeOnEscape(boolean isClose) /*-{
		this.closeOnEscape = isClose;
  }-*/;
}
