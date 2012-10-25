package net.georgezeng.gwt.base.jquery.ui.widget.dialog;

import net.georgezeng.gwt.base.jquery.core.JQuery;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TableElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ContentTable extends Composite {
  static interface ViewBinder extends UiBinder<Widget, ContentTable> {

  }

  private static final ViewBinder VIEW_BINDER = GWT.create(ViewBinder.class);

  public ContentTable() {
    initWidget(VIEW_BINDER.createAndBindUi(this));
  }

  @UiField
  TableElement contentPanel;

  public void setContent(String width, Element content) {
    contentPanel.setWidth(width);
    JQuery.$(contentPanel).find("td").append(content);
  }
}
