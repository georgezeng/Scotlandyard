package au.com.bglcorp.web.base.jquery.ui.widget.dialog.component;

import au.com.bglcorp.web.base.jquery.ui.widget.dialog.DialogButtonFactory;

public class MessageBox extends InformationDialog {

  public MessageBox() {
    setButtons(DialogButtonFactory.newSimpleOKButton());
    setModal(true);
    setResizable(false);
  }

}
