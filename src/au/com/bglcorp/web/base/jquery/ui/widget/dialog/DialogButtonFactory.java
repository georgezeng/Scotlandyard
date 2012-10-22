package au.com.bglcorp.web.base.jquery.ui.widget.dialog;

import au.com.bglcorp.web.base.jquery.core.handler.base.JQCommonHandler;
import au.com.bglcorp.web.base.jquery.ui.JQueryUI;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public final class DialogButtonFactory {
  private static final String OK_TEXT = "确定";
  private static final String CANCEL_TEXT = "取消";

  private final static JQCommonHandler CLOSE_HANDLER = new JQCommonHandler() {

    @Override
    public void call(Element thisEl) {
      JQueryUI.$(thisEl).dialog(DialogDirective.close);
    }
  };

  public static DialogButton newButton(String buttonName, JQCommonHandler buttonHandler) {
    DialogButton button = JavaScriptObject.createObject().cast();
    button.setName(buttonName);
    button.setClickHandler(buttonHandler);
    return button;
  }

  public static DialogButton newSimpleOKButton() {
    return newButton(OK_TEXT, CLOSE_HANDLER);
  }

  public static DialogButton newOKButton(JQCommonHandler handler) {
    return newButton(OK_TEXT, handler);
  }

  public static DialogButton newSimpleCancelButton() {
    return newButton(CANCEL_TEXT, CLOSE_HANDLER);
  }

  public static DialogButton newCancelButton(JQCommonHandler handler) {
    return newButton(CANCEL_TEXT, handler);
  }
}
