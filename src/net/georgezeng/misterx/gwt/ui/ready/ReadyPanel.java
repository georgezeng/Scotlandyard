package net.georgezeng.misterx.gwt.ui.ready;

import java.util.List;

import net.georgezeng.gwt.base.jquery.core.JQuery;
import net.georgezeng.gwt.base.jquery.core.bean.JQueryObject;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.Dialog;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.DialogButton;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.DialogButtonFactory;
import net.georgezeng.misterx.gwt.util.Constant;
import net.georgezeng.misterx.shared.domain.PlayerUnit;
import net.georgezeng.misterx.shared.enums.PlayerUnitType;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ReadyPanel extends Composite {
	static interface ViewBinder extends UiBinder<Widget, ReadyPanel> {

	}

	private static final ViewBinder BINDER = GWT.create(ViewBinder.class);

	private Dialog dialog;

	@UiField
	DivElement misterXText;

	@UiField
	DivElement policeAText;

	@UiField
	DivElement policeBText;

	@UiField
	DivElement policeCText;

	@UiField
	DivElement policeDText;

	@UiField
	DivElement policeEText;

	@UiField
	DivElement misterXTick;

	@UiField
	DivElement policeATick;

	@UiField
	DivElement policeBTick;

	@UiField
	DivElement policeCTick;

	@UiField
	DivElement policeDTick;

	@UiField
	DivElement policeETick;

	public ReadyPanel() {
		initWidget(BINDER.createAndBindUi(this));
		initContent();
		initDialog();
	}

	private void initContent() {
		misterXText.setInnerHTML(PlayerUnitType.MisterX.getName());
		policeAText.setInnerHTML(PlayerUnitType.PoliceA.getName());
		policeBText.setInnerHTML(PlayerUnitType.PoliceB.getName());
		policeCText.setInnerHTML(PlayerUnitType.PoliceC.getName());
		policeDText.setInnerHTML(PlayerUnitType.PoliceD.getName());
		policeEText.setInnerHTML(PlayerUnitType.PoliceE.getName());
		showTicks(Constant.STATUS.getTotalUnits());
		Constant.START_CHECKER.scheduleRepeating(3000);
	}

	public void showTicks(List<PlayerUnit> units) {
		for (PlayerUnit unit : units) {
			switch (unit.getType()) {
			case MisterX: {
				JQuery.$(misterXTick).show();
			}
				break;
			case PoliceA: {
				JQuery.$(policeATick).show();
			}
				break;
			case PoliceB: {
				JQuery.$(policeBTick).show();
			}
				break;
			case PoliceC: {
				JQuery.$(policeCTick).show();
			}
				break;
			case PoliceD: {
				JQuery.$(policeDTick).show();
			}
				break;
			case PoliceE: {
				JQuery.$(policeETick).show();
			}
				break;
			}
		}
	}

	private JQueryObject btn;

	private void initDialog() {
		dialog = new Dialog(350, 400);
		dialog.setResizable(false);
		dialog.setTitle("系统信息");
		dialog.setContent(this);
		DialogButton okButton = DialogButtonFactory.newButton("等待中...", new JQCommonHandler() {

			@Override
			public void call(Element thisEl) {
			}
		});
		dialog.setButtons(okButton);
		dialog.open();
		btn = JQuery.$(ReadyPanel.this).parent().parent().find("button");
		btn.disabled();
		dialog.removeCloseBtn();
	}

	public void close() {
		dialog.destroy();
	}
	
}
