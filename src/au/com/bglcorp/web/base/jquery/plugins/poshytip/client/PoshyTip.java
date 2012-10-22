package au.com.bglcorp.web.base.jquery.plugins.poshytip.client;

 

import au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Node;

/**
 * 
 * @author Kong Fan Zhi(Denny)
 * 
 *         tutorial :http://vadikom.com/tools/poshy-tip-jquery-plugin-for-stylish-tooltips/
 */
public class PoshyTip {

  public static PoshyTipOptions getDefaultOptions() {
    return new PoshyTipOptions();
  }

  public static PoshyTipOptions getTipsOptions() {
    PoshyTipOptions options = getDefaultOptions();
    options.setAlignX("center");
    options.setOffsetY(15);
    return options;
  }

  public static PoshyTipOptions getFocusOptions() {
    PoshyTipOptions options = new PoshyTipOptions();
    options.setShowOn("focus");
    options.setAlignTo("target");
    options.setAlignX("inner-left");
    options.setOffsetX(0);
    options.setOffsetY(5);

    return options;
  }

  public static void poshyTip(Node node, PoshyTipOptions options) {
    destroy(node);
    poshyTip(node, createJsObject(options));
  }

  public static void poshyTip(String cssSelector, PoshyTipOptions options) {
    destroy(cssSelector);
    poshyTip(cssSelector, createJsObject(options));
  }

  private static native void poshyTip(Node node, JavaScriptObject options)/*-{
		$wnd.$(node).poshytip(options);
  }-*/;

  private static native void poshyTip(String cssSelector, JavaScriptObject options) /*-{
		$wnd.$(cssSelector).poshytip(options);
  }-*/;

  public static native void update(Node node, String content) /*-{
		$wnd.$(node).poshytip('update', content);
  }-*/;

  public static native void update(String cssSelector, String content) /*-{
		$wnd.$(cssSelector).poshytip('update', content);
  }-*/;

  public static native void show(Node node) /*-{
		$wnd.$(node).poshytip('show');
  }-*/;

  public static native void show(String cssSelector) /*-{
		$wnd.$(cssSelector).poshytip('show');
  }-*/;

  public static native void hide(Node node) /*-{
		$wnd.$(node).poshytip('hide');
  }-*/;

  public static native void hide(String cssSelector) /*-{
		$wnd.$(cssSelector).poshytip('hide');
  }-*/;

  public static native void disable(Node node) /*-{
		$wnd.$(node).poshytip('disable');
  }-*/;

  public static native void disable(String cssSelector) /*-{
		$wnd.$(cssSelector).poshytip('disable');
  }-*/;

  public static native void enable(Node node) /*-{
		$wnd.$(node).poshytip('enable');
  }-*/;

  public static native void enable(String cssSelector) /*-{
		$wnd.$(cssSelector).poshytip('enable');
  }-*/;

  public static native void destroy(Node node) /*-{
		$wnd.$(node).poshytip('destroy');
  }-*/;

  public static native void destroy(String cssSelector) /*-{
		$wnd.$(cssSelector).poshytip('destroy');
  }-*/;

  public static void showTips(Node node, PoshyTipOptions options) {
    PoshyTip.poshyTip(node, options);
  }

  public static void showTips(String cssSelector, PoshyTipOptions options) {
    PoshyTip.poshyTip(cssSelector, options);
  }

  public static void showTips(String cssSelector) {
    showTips(cssSelector, getTipsOptions());
  }

  public static void showTips(Node node) {
    showTips(node, getTipsOptions());
  }

  public static void showTips(String cssSelector, String content) {
    PoshyTipOptions options = getTipsOptions();
    options.setContent(content);
    showTips(cssSelector, options);
  }

  public static void showTips(Node node, String content) {
    PoshyTipOptions options = getTipsOptions();
    options.setContent(content);
    showTips(node, options);
  }

  private static native JavaScriptObject createJsObject(PoshyTipOptions options) /*-{
		return {
			// content to display ('[title]', 'string', element, function(updateCallback){...}, jQuery)
			content : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getContent()(),

			// class for the tips
			className : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getClassName()(),

			// size in pixels for the background-image (if set in CSS) frame around the inner content of the tip
			bgImageFrameSize : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getBgImageFrameSize()(),

			// timeout before showing the tip (in milliseconds 1000 == 1 second)
			showTimeout : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getShowTimeout()(),

			// timeout before hiding the tip
			hideTimeout : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getHideTimeout()(),

			// handler for showing the tip ('hover', 'focus', 'none') - use 'none' to trigger it manually		
			showOn : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getShowOn()(),

			// align/position the tip relative to ('cursor', 'target')
			alignTo : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getAlignTo()(),

			// horizontal alignment for the tip relative to the mouse cursor or the target element
			// ('right', 'center', 'left', 'inner-left', 'inner-right') - 'inner-*' matter if alignTo:'target'
			alignX : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getAlignX()(),

			// vertical alignment for the tip relative to the mouse cursor or the target element
			// ('bottom', 'center', 'top', 'inner-bottom', 'inner-top') - 'inner-*' matter if alignTo:'target'
			alignY : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getAlignY()(),

			// offset X pixels from the default position - doesn't matter if alignX:'center'
			offsetX : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getOffsetX()(),

			// offset Y pixels from the default position - doesn't matter if alignY:'center'
			offsetY : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getOffsetY()(),

			// allow hovering the tip without hiding it onmouseout of the target - matters only if showOn:'hover'
			allowTipHover : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::isAllowTipHover()(),

			// if the tip should follow the cursor - matters only if showOn:'hover' and alignTo:'cursor'		
			followCursor : false,

			// use fade animation
			fade : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::isFade()(),

			// use slide animation
			slide : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::isSlide()(),

			// slide animation offset
			slideOffset : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getSlideOffset()(),

			// show animation duration - set to 0 if you don't want show animation
			showAniDuration : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getShowAniDuration()(),

			// hide animation duration - set to 0 if you don't want hide animation	
			hideAniDuration : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::getHideAniDuration()(),
			// expansion by Denny.show /hide infoIcon
			showInfoIcon : options.@au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions::isShowInfoIcon()()
		};
  }-*/;

}
