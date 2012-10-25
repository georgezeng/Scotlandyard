package net.georgezeng.gwt.base.jquery.ui.widget.dialog.component;

import net.georgezeng.gwt.base.jquery.ui.widget.dialog.Dialog;

import com.google.gwt.user.client.ui.Composite;

public abstract class AbstractEditPanel extends Composite {

  protected Dialog dialog = new Dialog();

  public AbstractEditPanel() {
    createUI();
    dialog.setDestroyWithCloseImg();
    dialog.setContent(this);
    dialog.setResizable(false);
  }

  protected abstract void createUI();

  protected abstract void renderInit();

  public void render() {
    renderInit();
    dialog.open();
  }
}