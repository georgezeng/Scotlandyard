package net.georgezeng.misterx.gwt.ui.login;

import java.util.ArrayList;
import java.util.List;

import net.georgezeng.gwt.base.jquery.core.JQuery;
import net.georgezeng.gwt.base.jquery.core.bean.JQueryObject;
import net.georgezeng.gwt.base.jquery.core.bean.event.JQEvent;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQEventHandler;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.BaseDialogFactory;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.Dialog;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.DialogButton;
import net.georgezeng.gwt.base.jquery.ui.widget.dialog.DialogButtonFactory;
import net.georgezeng.misterx.gwt.util.Constant;
import net.georgezeng.misterx.shared.domain.Player;
import net.georgezeng.misterx.shared.domain.PlayerUnit;
import net.georgezeng.misterx.shared.enums.PlayerType;
import net.georgezeng.misterx.shared.enums.PlayerUnitType;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginPanel extends Composite {
	static interface ViewBinder extends UiBinder<Widget, LoginPanel> {

	}

	private static final ViewBinder BINDER = GWT.create(ViewBinder.class);

	private Dialog loginDialog;

	@UiField
	TextBox playerName;

	@UiField
	ListBox playerSide;

	@UiField
	DivElement policeList;

	@UiField
	CheckBox policeA;

	@UiField
	CheckBox policeB;

	@UiField
	CheckBox policeC;

	@UiField
	CheckBox policeD;

	@UiField
	CheckBox policeE;

	@UiField
	SpanElement policeAText;

	@UiField
	SpanElement policeBText;

	@UiField
	SpanElement policeCText;

	@UiField
	SpanElement policeDText;

	@UiField
	SpanElement policeEText;

	@UiField
	SpanElement tip;

	public LoginPanel() {
		initWidget(BINDER.createAndBindUi(this));
		initContent();
		initDialog();
	}

	@SuppressWarnings("incomplete-switch")
	private void initContent() {
		final JQueryObject jTip = JQuery.$(tip).hide();
		final JQueryObject jPlist = JQuery.$(policeList).hide();
		if (Constant.STATUS.getMisterX() == null) {
			playerSide.addItem("反派 - X先生", PlayerType.MisterX.name());
			JQuery.$(playerSide).change(new JQEventHandler() {
				
				@Override
				public void call(Element thisEl, JQEvent jqEvent) {
					JQueryObject jThis = JQuery.$(thisEl);
					if (jThis.val().equals("MisterX")) {
						jTip.hide();
						jPlist.hide();
					} else {
						jTip.show();
						jPlist.show();
					}
				}
			});
		} else {
			jPlist.show();
		}
		playerSide.addItem("正派 - 警察", PlayerType.Police.name());
		for (PlayerUnit unit : Constant.STATUS.getPoliceRegUnits()) {
			switch (unit.getType()) {
			case PoliceA: {
				showOrHidePoliceText(policeAText, PlayerUnitType.PoliceA, unit.getType());
			}
				break;
			case PoliceB: {
				showOrHidePoliceText(policeBText, PlayerUnitType.PoliceB, unit.getType());
			}
				break;
			case PoliceC: {
				showOrHidePoliceText(policeCText, PlayerUnitType.PoliceC, unit.getType());
			}
				break;
			case PoliceD: {
				showOrHidePoliceText(policeDText, PlayerUnitType.PoliceD, unit.getType());
			}
				break;
			case PoliceE: {
				showOrHidePoliceText(policeEText, PlayerUnitType.PoliceE, unit.getType());
			}
				break;
			}
		}
	}

	private void showOrHidePoliceText(SpanElement policeText, PlayerUnitType type1, PlayerUnitType type2) {
		policeText.setInnerHTML(type1.getName());
	}

	private void initDialog() {
		loginDialog = new Dialog(600, 300);
		loginDialog.setResizable(false);
		loginDialog.setTitle("欢迎来到【苏格兰场】桌游");
		loginDialog.setContent(this);
		String btnName = Constant.STATUS.getKey() != null ? "创建游戏" : "参与游戏";
		DialogButton okButton = DialogButtonFactory.newButton(btnName, new JQCommonHandler() {

			@Override
			public void call(Element thisEl) {
				String name = playerName.getValue();
				if (name.isEmpty() || name.length() < 3 || name.length() > 10) {
					BaseDialogFactory.getMessageBox().showMessage("昵称只能在3-10个字符之间");
					return;
				}

				PlayerType type = PlayerType.valueOf(JQuery.$(playerSide).val());
				List<PlayerUnit> units = new ArrayList<PlayerUnit>();
				if (PlayerType.MisterX.equals(type)) {
					units.add(new PlayerUnit(PlayerUnitType.MisterX));
				} else {
					addPlayerUnit(policeA, PlayerUnitType.PoliceA, units);
					addPlayerUnit(policeB, PlayerUnitType.PoliceB, units);
					addPlayerUnit(policeC, PlayerUnitType.PoliceC, units);
					addPlayerUnit(policeD, PlayerUnitType.PoliceD, units);
					addPlayerUnit(policeE, PlayerUnitType.PoliceE, units);
				}

				Constant.PALYER = new Player(name, units, Constant.STATUS.getKey());
				Constant.ACTIVITY.readyToGame();
			}
		});
		loginDialog.setButtons(okButton);
		loginDialog.open();
		loginDialog.removeCloseBtn();
	}

	private void addPlayerUnit(CheckBox cb, PlayerUnitType unitType, List<PlayerUnit> units) {
		if (cb.getValue()) {
			units.add(new PlayerUnit(unitType));
		}
	}

	public void close() {
		loginDialog.destroy();
	}

}
