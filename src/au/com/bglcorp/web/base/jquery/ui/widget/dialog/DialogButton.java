package au.com.bglcorp.web.base.jquery.ui.widget.dialog;

import au.com.bglcorp.web.base.jquery.core.handler.base.JQCommonHandler;

import com.google.gwt.core.client.JavaScriptObject;

public class DialogButton extends JavaScriptObject {
  protected DialogButton() {

  }

  public native final void setName(String name) /*-{
		this.text = name;
  }-*/;

  public native final void setClickHandler(JQCommonHandler handler) /*-{
		this.click = function() {
			handler.@au.com.bglcorp.web.base.jquery.core.handler.base.JQCommonHandler::call(Lcom/google/gwt/dom/client/Element;)(this);
		};
  }-*/;

}
