package net.georgezeng.gwt.base.jquery.ui.widget.dialog;

import net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler;

import com.google.gwt.core.client.JavaScriptObject;

public class DialogButton extends JavaScriptObject {
  protected DialogButton() {

  }

  public native final void setName(String name) /*-{
		this.text = name;
  }-*/;

  public native final void setClickHandler(JQCommonHandler handler) /*-{
		this.click = function() {
			handler.@net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler::call(Lcom/google/gwt/dom/client/Element;)(this);
		};
  }-*/;

}
