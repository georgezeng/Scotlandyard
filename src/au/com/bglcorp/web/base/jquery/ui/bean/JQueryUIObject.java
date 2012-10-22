package au.com.bglcorp.web.base.jquery.ui.bean;

import au.com.bglcorp.web.base.jquery.core.bean.JQueryObject;
import au.com.bglcorp.web.base.jquery.ui.widget.dialog.DialogDirective;
import au.com.bglcorp.web.base.jquery.ui.widget.dialog.DialogOptions;

/**
 * JQueryUI
 * 
 * @author GeorgeZeng
 * 
 */
public class JQueryUIObject extends JQueryObject {
  protected JQueryUIObject() {

  }

  // -----------------------
  // accordion
  // -----------------------

  public final native JQueryUIObject accordion() /*-{
		return this.accordion();
  }-*/;

  // -----------------------
  // dialog
  // -----------------------

  public final native JQueryUIObject dialog(DialogOptions option) /*-{
		return this.dialog(option);
  }-*/;

  public final JQueryUIObject dialog(DialogDirective directive) {
    return dialogNative(directive.name());
  }

  private final native JQueryUIObject dialogNative(String directive) /*-{
		return this.dialog(directive);
  }-*/;

  public final native JQueryUIObject dialog(String action) /*-{
    return this.dialog(action);
  }-*/;

}
