package net.georgezeng.gwt.base.jquery.ui.widget.dialog.component;

import net.georgezeng.gwt.base.jquery.ui.widget.dialog.DialogButtonFactory;

public class MessageBox extends InformationDialog {

  public MessageBox() {
    setButtons(DialogButtonFactory.newSimpleOKButton());
    setModal(true);
    setResizable(false);
  }

}
