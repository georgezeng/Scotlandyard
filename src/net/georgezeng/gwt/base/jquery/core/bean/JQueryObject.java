package net.georgezeng.gwt.base.jquery.core.bean;

import java.util.Map;

import net.georgezeng.gwt.base.jquery.core.bean.animate.AnimateDuration;
import net.georgezeng.gwt.base.jquery.core.bean.animate.AnimateEasing;
import net.georgezeng.gwt.base.jquery.core.bean.animate.AnimateOptions;
import net.georgezeng.gwt.base.jquery.core.bean.event.JQEventType;
import net.georgezeng.gwt.base.jquery.core.handler.JQToggleClassHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQCommonHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQEventHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQIndexHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQValueHandler;
import net.georgezeng.gwt.base.jquery.core.handler.base.JQueryHandler;
import net.georgezeng.gwt.base.jquery.core.util.JQueryObjectFunctions;
import net.georgezeng.gwt.base.js.util.JavaScriptObjectWrapper;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * see the API at http://api.jquery.com
 * 
 * @author GeorgeZeng
 * 
 */
public class JQueryObject extends JavaScriptObject {
	protected JQueryObject() {

	}

	public final native JQueryObject contents() /*-{
		return this.contents();
	}-*/;

	// -----------------------------------------
	// addclass
	// -----------------------------------------

	public final JQueryObject addClass(String... classNames) {
		return JQueryObjectFunctions.treatClass(this, "addClass", classNames);
	}

	public final JQueryObject addClass(JQValueHandler<String, String> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this, "addClass",
				handler);
	}

	// -----------------------------------------
	// removeClass
	// -----------------------------------------

	public final JQueryObject removeClass(String... classNames) {
		return JQueryObjectFunctions
				.treatClass(this, "removeClass", classNames);
	}

	public final JQueryObject removeClass(JQValueHandler<String, String> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this,
				"removeClass", handler);
	}

	// -----------------------------------------
	// toggleClass
	// -----------------------------------------

	public final native String toggleClass() /*-{
		return this.toggleClass();
	}-*/;

	public final JQueryObject toggleClass(String... classNames) {
		return JQueryObjectFunctions
				.treatClass(this, "toggleClass", classNames);
	}

	public final native JQueryObject toggleClass(boolean isSwitch) /*-{
		return this.toggleClass(isSwitch);
	}-*/;

	public final JQueryObject toggleClass(boolean isSwitch,
			String... classNames) {
		return toggleClassNative(JQueryObjectFunctions.concat(classNames),
				isSwitch);
	}

	private final native JQueryObject toggleClassNative(String classNames,
			boolean isSwitch) /*-{
		return this.toggleClass(classNames, isSwitch);
	}-*/;

	public final JQueryObject toggleClass(JQToggleClassHandler handler) {
		return JQueryObjectFunctions.toggleClass(this, handler, true);
	}

	public final JQueryObject toggleClass(JQToggleClassHandler handler,
			boolean isSwitch) {
		return JQueryObjectFunctions.toggleClass(this, handler, isSwitch);
	}

	// -----------------------------------------
	// hasClass
	// -----------------------------------------

	public final native boolean hasClass(String className) /*-{
		return this.hasClass(className);
	}-*/;

	// -----------------------------------------
	// html
	// -----------------------------------------

	public final native String html() /*-{
		return this.html();
	}-*/;

	public final native JQueryObject html(String html) /*-{
		return this.html(html);
	}-*/;

	public final JQueryObject html(JQValueHandler<String, String> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this, "addClass",
				handler);
	}

	// -----------------------------------------
	// text
	// -----------------------------------------

	public final native String text() /*-{
		return this.text();
	}-*/;

	public final native JQueryObject text(String text) /*-{
		return this.text(text);
	}-*/;

	public final JQueryObject text(JQValueHandler<String, String> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this, "text",
				handler);
	}

	// -----------------------------------------
	// attr
	// -----------------------------------------

	public final String attr(String attributeName) {
		return JQueryObjectFunctions.getPropertyValue(this, "attr",
				attributeName);
	}

	public final JQueryObject attr(String attributeName, String value) {
		return JQueryObjectFunctions.treatProperty(this, "attr", attributeName,
				value);
	}

	public final JQueryObject attr(Map<String, String> props) {
		return JQueryObjectFunctions.treatProperty(this, "attr", props);
	}

	public final JQueryObject attr(String attributeName,
			JQValueHandler<String, String> handler) {
		return JQueryObjectFunctions.treatProperty(this, "attr", attributeName,
				handler);
	}

	// -----------------------------------------
	// removeAttr
	// -----------------------------------------

	public final native JQueryObject removeAttr(String attributeName) /*-{
		return this.removeAttr(attributeName);
	}-*/;

	// -----------------------------------------
	// val
	// -----------------------------------------

	public final native String val() /*-{
		return this.val();
	}-*/;

	public final native JQueryObject val(String value) /*-{
		return this.val(value);
	}-*/;

	public final JQueryObject val(JQValueHandler<String, String> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this, "val",
				handler);
	}

	// -----------------------------------------
	// css
	// -----------------------------------------

	public final String css(String propertyName) {
		return JQueryObjectFunctions
				.getPropertyValue(this, "css", propertyName);
	}

	public final JQueryObject css(String propertyName, String value) {
		return JQueryObjectFunctions.treatProperty(this, "css", propertyName,
				value);
	}

	public final JQueryObject css(Map<String, String> props) {
		return JQueryObjectFunctions.treatProperty(this, "css", props);
	}

	public final JQueryObject css(String attributeName,
			JQValueHandler<String, String> handler) {
		return JQueryObjectFunctions.treatProperty(this, "css", attributeName,
				handler);
	}

	// -----------------------------------------
	// height
	// -----------------------------------------

	public final native int height() /*-{
		return this.height();
	}-*/;

	public final native JQueryObject height(int height) /*-{
		return this.height(height);
	}-*/;

	public final JQueryObject height(JQValueHandler<Integer, Integer> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this, "height",
				handler);
	}

	// -----------------------------------------
	// innerHeight
	// -----------------------------------------

	public final native int innerHeight() /*-{
		return this.innerHeight();
	}-*/;

	// -----------------------------------------
	// outerHeight
	// -----------------------------------------

	public final native int outerHeight(boolean includeMargin) /*-{
		return this.outerHeight(includeMargin);
	}-*/;

	// -----------------------------------------
	// width
	// -----------------------------------------

	public final native int width() /*-{
		return this.width();
	}-*/;

	public final native JQueryObject width(int width) /*-{
		return this.width(width);
	}-*/;

	public final JQueryObject width(JQValueHandler<Integer, Integer> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this, "width",
				handler);
	}

	// -----------------------------------------
	// innerWidth
	// -----------------------------------------

	public final native int innerWidth() /*-{
		return this.innerWidth();
	}-*/;

	// -----------------------------------------
	// outerHeight
	// -----------------------------------------

	public final native int outerWidth(boolean includeMargin) /*-{
		return this.outerWidth(includeMargin);
	}-*/;

	// -----------------------------------------
	// offset
	// -----------------------------------------

	public final native Position offset() /*-{
		return this.offset();
	}-*/;

	public final native JQueryObject offset(Position offset) /*-{
		return this.offset(offset);
	}-*/;

	public final JQueryObject offset(JQValueHandler<Position, Position> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this, "offset",
				handler);
	}

	// -----------------------------------------
	// position
	// -----------------------------------------

	public final native Position position() /*-{
		return this.position();
	}-*/;

	// -----------------------------------------
	// scrollLeft
	// -----------------------------------------

	public final native int scrollLeft() /*-{
		return this.scrollLeft();
	}-*/;

	public final native JQueryObject scrollLeft(int left) /*-{
		return this.scrollLeft(left);
	}-*/;

	// -----------------------------------------
	// scrollTop
	// -----------------------------------------

	public final native int scrollTop() /*-{
		return this.scrollTop();
	}-*/;

	public final native JQueryObject scrollTop(int top) /*-{
		return this.scrollTop(top);
	}-*/;

	// -----------------------------------------
	// animate
	// -----------------------------------------

	public final native JQueryObject animate(JavaScriptObjectWrapper cssProps,
			AnimateOptions options) /*-{
		return this.animate(cssProps, options);
	}-*/;

	// -----------------------------------------
	// queue
	// -----------------------------------------

	public final native JsArrayMixed queue() /*-{
		return this.queue();
	}-*/;

	public final native JsArrayMixed queue(String queueName) /*-{
		return this.queue(queueName);
	}-*/;

	// -----------------------------------------
	// clearQueue
	// -----------------------------------------

	public final native JQueryObject clearQueue() /*-{
		return this.clearQueue();
	}-*/;

	public final native JQueryObject clearQueue(String queueName) /*-{
		return this.clearQueue(queueName);
	}-*/;

	// -----------------------------------------
	// dequeue
	// -----------------------------------------

	public final native JQueryObject dequeue() /*-{
		return this.dequeue();
	}-*/;

	public final native JQueryObject dequeue(String queueName) /*-{
		return this.dequeue(queueName);
	}-*/;

	// -----------------------------------------
	// delay
	// -----------------------------------------

	public final native JQueryObject delay(int duration) /*-{
		return this.delay(duration);
	}-*/;

	public final native JQueryObject delay(int duration, String queueName) /*-{
		return this.delay(duration, queueName);
	}-*/;

	// -----------------------------------------
	// stop
	// -----------------------------------------

	public final native JQueryObject stop() /*-{
		return this.stop();
	}-*/;

	public final native JQueryObject stop(boolean clearQueue) /*-{
		return this.stop(clearQueue);
	}-*/;

	public final native JQueryObject stop(boolean clearQueue, boolean jumpToEnd) /*-{
		return this.stop(clearQueue, jumpToEnd);
	}-*/;

	public final native JQueryObject stop(String queueName) /*-{
		return this.stop(queueName);
	}-*/;

	public final native JQueryObject stop(String queueName, boolean clearQueue) /*-{
		return this.stop(queueName, clearQueue);
	}-*/;

	public final native JQueryObject stop(String queueName, boolean clearQueue,
			boolean jumpToEnd) /*-{
		return this.stop(queueName, clearQueue, jumpToEnd);
	}-*/;

	// -----------------------------------------
	// fadeIn
	// -----------------------------------------

	public final native JQueryObject fadeIn() /*-{
		return this.fadeIn();
	}-*/;

	public final native JQueryObject fadeIn(int duration) /*-{
		return this.fadeIn(duration);
	}-*/;

	public final JQueryObject fadeIn(int duration, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeIn", options);
	}

	public final JQueryObject fadeIn(int duration, AnimateEasing easing,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeIn", options);
	}

	public final JQueryObject fadeIn(AnimateDuration duration) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		return JQueryObjectFunctions.treatAnimate(this, "fadeIn", options);
	}

	public final JQueryObject fadeIn(AnimateDuration duration,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeIn", options);
	}

	public final JQueryObject fadeIn(AnimateDuration duration,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeIn", options);
	}

	// -----------------------------------------
	// fadeOut
	// -----------------------------------------

	public final native JQueryObject fadeOut() /*-{
		return this.fadeOut();
	}-*/;

	public final native JQueryObject fadeOut(int duration) /*-{
		return this.fadeOut(duration);
	}-*/;

	public final JQueryObject fadeOut(int duration, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeOut", options);
	}

	public final JQueryObject fadeOut(int duration, AnimateEasing easing,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeOut", options);
	}

	public final JQueryObject fadeOut(AnimateDuration duration) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		return JQueryObjectFunctions.treatAnimate(this, "fadeOut", options);
	}

	public final JQueryObject fadeOut(AnimateDuration duration,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeOut", options);
	}

	public final JQueryObject fadeOut(AnimateDuration duration,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeOut", options);
	}

	// -----------------------------------------
	// fadeTo
	// -----------------------------------------

	public final native JQueryObject fadeTo(int duration, double opacity) /*-{
		return this.fadeTo(duration, opacity);
	}-*/;

	public final JQueryObject fadeTo(int duration, double opacity,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setOpacity(opacity);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeTo", options);
	}

	public final JQueryObject fadeTo(int duration, double opacity,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setOpacity(opacity);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeTo", options);
	}

	public final JQueryObject fadeTo(AnimateDuration duration, double opacity) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setOpacity(opacity);
		return JQueryObjectFunctions.treatAnimate(this, "fadeTo", options);
	}

	public final JQueryObject fadeTo(AnimateDuration duration, double opacity,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setOpacity(opacity);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeTo", options);
	}

	public final JQueryObject fadeTo(AnimateDuration duration, double opacity,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setOpacity(opacity);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeTo", options);
	}

	// -----------------------------------------
	// fadeToggle
	// -----------------------------------------

	public final native JQueryObject fadeToggle() /*-{
		return this.fadeToggle();
	}-*/;

	public final native JQueryObject fadeToggle(int duration) /*-{
		return this.fadeToggle(duration);
	}-*/;

	public final JQueryObject fadeToggle(int duration, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeToggle", options);
	}

	public final JQueryObject fadeToggle(int duration, AnimateEasing easing,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeToggle", options);
	}

	public final JQueryObject fadeToggle(AnimateDuration duration) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		return JQueryObjectFunctions.treatAnimate(this, "fadeToggle", options);
	}

	public final JQueryObject fadeToggle(AnimateDuration duration,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeToggle", options);
	}

	public final JQueryObject fadeToggle(AnimateDuration duration,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "fadeToggle", options);
	}

	// -----------------------------------------
	// hide
	// -----------------------------------------

	public final native JQueryObject hide() /*-{
		return this.hide();
	}-*/;

	public final native JQueryObject hide(int duration) /*-{
		return this.hide(duration);
	}-*/;

	public final JQueryObject hide(int duration, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "hide", options);
	}

	public final JQueryObject hide(int duration, AnimateEasing easing,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "hide", options);
	}

	public final JQueryObject hide(AnimateDuration duration) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		return JQueryObjectFunctions.treatAnimate(this, "hide", options);
	}

	public final JQueryObject hide(AnimateDuration duration,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "hide", options);
	}

	public final JQueryObject hide(AnimateDuration duration,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "hide", options);
	}

	// -----------------------------------------
	// show
	// -----------------------------------------

	public final native JQueryObject show() /*-{
		return this.show();
	}-*/;

	public final native JQueryObject show(int duration) /*-{
		return this.show(duration);
	}-*/;

	public final JQueryObject show(int duration, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "show", options);
	}

	public final JQueryObject show(int duration, AnimateEasing easing,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "show", options);
	}

	public final JQueryObject show(AnimateDuration duration) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		return JQueryObjectFunctions.treatAnimate(this, "show", options);
	}

	public final JQueryObject show(AnimateDuration duration,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "show", options);
	}

	public final JQueryObject show(AnimateDuration duration,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "show", options);
	}

	// -----------------------------------------
	// slideDown
	// -----------------------------------------

	public final native JQueryObject slideDown() /*-{
		return this.slideDown();
	}-*/;

	public final native JQueryObject slideDown(int duration) /*-{
		return this.slideDown(duration);
	}-*/;

	public final JQueryObject slideDown(int duration, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideDown", options);
	}

	public final JQueryObject slideDown(int duration, AnimateEasing easing,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideDown", options);
	}

	public final JQueryObject slideDown(AnimateDuration duration) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		return JQueryObjectFunctions.treatAnimate(this, "slideDown", options);
	}

	public final JQueryObject slideDown(AnimateDuration duration,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideDown", options);
	}

	public final JQueryObject slideDown(AnimateDuration duration,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideDown", options);
	}

	// -----------------------------------------
	// slideUp
	// -----------------------------------------

	public final native JQueryObject slideUp() /*-{
		return this.slideUp();
	}-*/;

	public final native JQueryObject slideUp(int duration) /*-{
		return this.slideUp(duration);
	}-*/;

	public final JQueryObject slideUp(int duration, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideUp", options);
	}

	public final JQueryObject slideUp(int duration, AnimateEasing easing,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideUp", options);
	}

	public final JQueryObject slideUp(AnimateDuration duration) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		return JQueryObjectFunctions.treatAnimate(this, "slideUp", options);
	}

	public final JQueryObject slideUp(AnimateDuration duration,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideUp", options);
	}

	public final JQueryObject slideUp(AnimateDuration duration,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideUp", options);
	}

	// -----------------------------------------
	// slideToggle
	// -----------------------------------------

	public final native JQueryObject slideToggle() /*-{
		return this.slideToggle();
	}-*/;

	public final native JQueryObject slideToggle(int duration) /*-{
		return this.slideToggle(duration);
	}-*/;

	public final JQueryObject slideToggle(int duration, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideToggle", options);
	}

	public final JQueryObject slideToggle(int duration, AnimateEasing easing,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideToggle", options);
	}

	public final JQueryObject slideToggle(AnimateDuration duration) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		return JQueryObjectFunctions.treatAnimate(this, "slideToggle", options);
	}

	public final JQueryObject slideToggle(AnimateDuration duration,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideToggle", options);
	}

	public final JQueryObject slideToggle(AnimateDuration duration,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "slideToggle", options);
	}

	// -----------------------------------------
	// toggle
	// -----------------------------------------

	public final native JQueryObject toggle() /*-{
		return this.toggle();
	}-*/;

	public final native JQueryObject toggle(int duration) /*-{
		return this.toggle(duration);
	}-*/;

	public final JQueryObject toggle(int duration, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "toggle", options);
	}

	public final JQueryObject toggle(int duration, AnimateEasing easing,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "toggle", options);
	}

	public final JQueryObject toggle(AnimateDuration duration) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		return JQueryObjectFunctions.treatAnimate(this, "toggle", options);
	}

	public final JQueryObject toggle(AnimateDuration duration,
			JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "toggle", options);
	}

	public final JQueryObject toggle(AnimateDuration duration,
			AnimateEasing easing, JQCommonHandler handler) {
		AnimateOptions options = JavaScriptObject.createObject().cast();
		options.setDuration(duration);
		options.setEasing(easing);
		options.setCompleteHandler(handler);
		return JQueryObjectFunctions.treatAnimate(this, "toggle", options);
	}

	public final native JQueryObject toggle(boolean isShow) /*-{
		return this.toggle(isShow);
	}-*/;

	// -----------------------------------------
	// bind
	// -----------------------------------------

	public final JQueryObject bind(JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "bind", null,
				JQueryObjectFunctions.concat(eventTypes), handler);
	}

	public final native JQueryObject bind(String eventName,
			JQueryHandler handler) /*-{
		
  }-*/;

	// -----------------------------------------
	// delegate
	// -----------------------------------------

	public final JQueryObject delegate(String selector, JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "delegate", selector,
				JQueryObjectFunctions.concat(eventTypes), handler);
	}

	// -----------------------------------------
	// live
	// -----------------------------------------

	public final JQueryObject live(JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "live", null,
				JQueryObjectFunctions.concat(eventTypes), handler);
	}

	// -----------------------------------------
	// unbind
	// -----------------------------------------

	public final native JQueryObject unbind() /*-{
		return this.unbind();
	}-*/;

	public final JQueryObject unbindReturnFalseHandler(
			JQEventType... eventTypes) {
		return unbindReturnFalseHandlerNative(JQueryObjectFunctions
				.concat(eventTypes));
	}

	private final native JQueryObject unbindReturnFalseHandlerNative(
			String eventTypes) /*-{
		return this.unbind(eventTypes, false);
	}-*/;

	public final JQueryObject unbind(JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "unbind", null,
				JQueryObjectFunctions.concat(eventTypes), null);
	}

	public final JQueryObject unbind(JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "unbind", null,
				JQueryObjectFunctions.concat(eventTypes), handler);
	}

	// -----------------------------------------
	// undelegate
	// -----------------------------------------

	public final native JQueryObject undelegate() /*-{
		return this.undelegate();
	}-*/;

	public final native JQueryObject undelegate(String namespace) /*-{
		return this.undelegate(namespace);
	}-*/;

	public final JQueryObject undelegate(String selector,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "undelegate", selector,
				JQueryObjectFunctions.concat(eventTypes), null);
	}

	public final JQueryObject undelegate(String selector,
			JQEventHandler handler, JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "undelegate", selector,
				JQueryObjectFunctions.concat(eventTypes), handler);
	}

	// -----------------------------------------
	// die
	// -----------------------------------------

	public final native JQueryObject die() /*-{
		return this.die();
	}-*/;

	public final JQueryObject die(JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "die", null,
				JQueryObjectFunctions.concat(eventTypes), null);
	}

	public final JQueryObject die(JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "die", null,
				JQueryObjectFunctions.concat(eventTypes), handler);
	}

	// -----------------------------------------
	// off
	// -----------------------------------------

	public final JQueryObject off(JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "off", null,
				JQueryObjectFunctions.concat(eventTypes), null);
	}

	public final JQueryObject off(JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "off", null,
				JQueryObjectFunctions.concat(eventTypes), handler);
	}

	public final JQueryObject off(String selector, JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "off", selector,
				JQueryObjectFunctions.concat(eventTypes), handler, true);
	}

	// -----------------------------------------
	// on
	// -----------------------------------------

	public final JQueryObject on(JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "on", null,
				JQueryObjectFunctions.concat(eventTypes), handler);
	}

	public final JQueryObject on(String selector, JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "on", selector,
				JQueryObjectFunctions.concat(eventTypes), handler, true);
	}

	// -----------------------------------------
	// one
	// -----------------------------------------

	public final JQueryObject one(JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "one", null,
				JQueryObjectFunctions.concat(eventTypes), handler);
	}

	public final JQueryObject one(String selector, JQEventHandler handler,
			JQEventType... eventTypes) {
		return JQueryObjectFunctions.treatEvent(this, "one", selector,
				JQueryObjectFunctions.concat(eventTypes), handler, true);
	}

	// -----------------------------------------
	// load
	// -----------------------------------------

	public final JQueryObject load(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "load", null, null,
				handler);
	}

	// -----------------------------------------
	// unload
	// -----------------------------------------

	public final JQueryObject unload(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "unload", null, null,
				handler);
	}

	// -----------------------------------------
	// submit
	// -----------------------------------------

	public final native JQueryObject submit() /*-{
		return this.submit();
	}-*/;

	public final JQueryObject submit(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "submit", null, null,
				handler);
	}

	// -----------------------------------------
	// resize
	// -----------------------------------------

	public final native JQueryObject resize() /*-{
		return this.resize();
	}-*/;

	public final JQueryObject resize(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "resize", null, null,
				handler);
	}

	// -----------------------------------------
	// blur
	// -----------------------------------------

	public final native JQueryObject blur() /*-{
		return this.blur();
	}-*/;

	public final JQueryObject blur(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "blur", null, null,
				handler);
	}

	public final native JQueryObject blur(JQueryHandler handler) /*-{

  }-*/;

	// -----------------------------------------
	// change
	// -----------------------------------------

	public final native JQueryObject change() /*-{
		return this.change();
	}-*/;

	public final JQueryObject change(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "change", null, null,
				handler);
	}

	// -----------------------------------------
	// click
	// -----------------------------------------

	public final native JQueryObject click() /*-{
		return this.click();
	}-*/;

	public final JQueryObject click(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "click", null, null,
				handler);
	}

	public final JQueryObject click(JQCommonHandler handler) {
		return JQueryObjectFunctions.treatWithJQCommonHandler(this,
				JQEventType.click.name(), handler);
	}

	// -----------------------------------------
	// dblclick
	// -----------------------------------------

	public final native JQueryObject dblclick() /*-{
		return this.dblclick();
	}-*/;

	public final JQueryObject dblclick(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "dblclick", null, null,
				handler);
	}

	// -----------------------------------------
	// focus
	// -----------------------------------------

	public final native JQueryObject focus() /*-{
		return this.focus();
	}-*/;

	public final JQueryObject focus(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "focus", null, null,
				handler);
	}

	public final native JQueryObject focus(JQueryHandler handler)/*-{
	
  }-*/;

	// -----------------------------------------
	// focusin
	// -----------------------------------------

	public final native JQueryObject focusIn() /*-{
		return this.focusin();
	}-*/;

	public final JQueryObject focusIn(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "focusin", null, null,
				handler);
	}

	// -----------------------------------------
	// focusout
	// -----------------------------------------

	public final native JQueryObject focusOut() /*-{
		return this.focusout();
	}-*/;

	public final JQueryObject focusOut(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "focusout", null, null,
				handler);
	}

	// -----------------------------------------
	// keydown
	// -----------------------------------------

	public final native JQueryObject keyDown() /*-{
		return this.keydown();
	}-*/;

	public final JQueryObject keyDown(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "keydown", null, null,
				handler);
	}

	// -----------------------------------------
	// keyup
	// -----------------------------------------

	public final native JQueryObject keyUp() /*-{
		return this.keyup();
	}-*/;

	public final JQueryObject keyUp(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "keyup", null, null,
				handler);
	}

	// -----------------------------------------
	// keypress
	// -----------------------------------------

	public final native JQueryObject keyPress() /*-{
		return this.keypress();
	}-*/;

	public final JQueryObject keyPress(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "keypress", null, null,
				handler);
	}

	// -----------------------------------------
	// hover
	// -----------------------------------------

	public final native JQueryObject hover(JQEventHandler hoverInHandler,
			JQEventHandler hoverOutHandler) /*-{
		return this
				.hover(
						function(event) {
							handler.@net.georgezeng.gwt.base.jquery.core.handler.base.JQEventHandler::call(Lcom/google/gwt/dom/client/Element;Lau/com/bglcorp/web/base/jquery/core/bean/event/JQEvent;)(this, event);
						},
						function(event) {
							handler.@net.georgezeng.gwt.base.jquery.core.handler.base.JQEventHandler::call(Lcom/google/gwt/dom/client/Element;Lau/com/bglcorp/web/base/jquery/core/bean/event/JQEvent;)(this, event);
						});
	}-*/;

	public final JQueryObject hover(JQEventHandler InAndOutHandler) {
		return JQueryObjectFunctions.treatEvent(this, "hover", null, null,
				InAndOutHandler);
	}

	// -----------------------------------------
	// mouseover
	// -----------------------------------------

	public final native JQueryObject mouseOver() /*-{
		return this.mouseover();
	}-*/;

	public final JQueryObject mouseOver(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "mouseover", null, null,
				handler);
	}

	// -----------------------------------------
	// mouseout
	// -----------------------------------------

	public final native JQueryObject mouseOut() /*-{
		return this.mouseout();
	}-*/;

	public final JQueryObject mouseOut(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "mouseout", null, null,
				handler);
	}

	// -----------------------------------------
	// mousedown
	// -----------------------------------------

	public final native JQueryObject mouseDown() /*-{
		return this.mousedown();
	}-*/;

	public final JQueryObject mouseDown(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "mousedown", null, null,
				handler);
	}

	// -----------------------------------------
	// mouseup
	// -----------------------------------------

	public final native JQueryObject mouseUp() /*-{
		return this.mouseup();
	}-*/;

	public final JQueryObject mouseUp(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "mouseup", null, null,
				handler);
	}

	// -----------------------------------------
	// mouseenter
	// -----------------------------------------

	public final native JQueryObject mouseEnter() /*-{
		return this.mouseenter();
	}-*/;

	public final JQueryObject mouseEnter(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "mouseenter", null, null,
				handler);
	}

	// -----------------------------------------
	// mouseleave
	// -----------------------------------------

	public final native JQueryObject mouseLeave() /*-{
		return this.mouseleave();
	}-*/;

	public final JQueryObject mouseLeave(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "mouseleave", null, null,
				handler);
	}

	// -----------------------------------------
	// scroll
	// -----------------------------------------

	public final native JQueryObject scroll() /*-{
		return this.scroll();
	}-*/;

	public final JQueryObject scroll(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "scroll", null, null,
				handler);
	}

	// -----------------------------------------
	// select
	// -----------------------------------------

	public final native JQueryObject select() /*-{
		return this.select();
	}-*/;

	public final JQueryObject select(JQEventHandler handler) {
		return JQueryObjectFunctions.treatEvent(this, "select", null, null,
				handler);
	}

	// -----------------------------------------
	// serialize
	// -----------------------------------------

	public final native String serialize() /*-{
		return this.serialize();
	}-*/;

	// -----------------------------------------
	// prepend
	// -----------------------------------------

	public final native JQueryObject prepend(String html) /*-{
		return this.prepend(html);
	}-*/;

	public final JQueryObject prepend(Widget widget) {
		return prepend(widget.getElement());
	}

	public final native JQueryObject prepend(Element element) /*-{
		return this.prepend(element);
	}-*/;

	public final native JQueryObject prepend(JQueryObject jqObj) /*-{
		return this.prepend(jqObj);
	}-*/;

	public final JQueryObject prepend(JQValueHandler<String, ?> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this, "prepend",
				handler);
	}

	// -----------------------------------------
	// append
	// -----------------------------------------

	public final native JQueryObject append(String html) /*-{
		return this.append(html);
	}-*/;

	public final JQueryObject append(Widget widget) {
		return append(widget.getElement());
	}

	public final native JQueryObject append(Element element) /*-{
		return this.append(element);
	}-*/;

	public final native JQueryObject append(JQueryObject jqObj) /*-{
		return this.append(jqObj);
	}-*/;

	public final JQueryObject append(JQValueHandler<String, ?> handler) {
		return JQueryObjectFunctions.treatWithJQValueHandler(this, "append",
				handler);
	}

	// -----------------------------------------
	// after
	// -----------------------------------------

	public final native JQueryObject after(String html) /*-{
		return this.after(html);
	}-*/;

	public final JQueryObject after(Widget widget) {
		return after(widget.getElement());
	}

	public final native JQueryObject after(Element element) /*-{
		return this.after(element);
	}-*/;

	public final native JQueryObject after(JQueryObject jqObj) /*-{
		return this.after(jqObj);
	}-*/;

	/**
	 * Need to return a html string or a dom element or a jquery object in
	 * handler
	 * 
	 * @param handler
	 * @return
	 */
	public final JQueryObject after(JQIndexHandler<Object> handler) {
		return JQueryObjectFunctions.treatWithJQIndexHandler(this, "after",
				handler);
	}

	// -----------------------------------------
	// before
	// -----------------------------------------

	public final native JQueryObject before(String html) /*-{
		return this.before(html);
	}-*/;

	public final JQueryObject before(Widget widget) {
		return before(widget.getElement());
	}

	public final native JQueryObject before(Element element) /*-{
		return this.before(element);
	}-*/;

	public final native JQueryObject before(JQueryObject jqObj) /*-{
		return this.before(jqObj);
	}-*/;

	/**
	 * Need to return a html string or a dom element or a jquery object in
	 * handler
	 * 
	 * @param handler
	 * @return
	 */
	public final JQueryObject before(JQIndexHandler<Object> handler) {
		return JQueryObjectFunctions.treatWithJQIndexHandler(this, "before",
				handler);
	}

	// -----------------------------------------
	// wrap
	// -----------------------------------------

	public final native JQueryObject wrap(String htmlOrSelector) /*-{
		return this.wrap(htmlOrSelector);
	}-*/;

	public final JQueryObject wrap(Widget widget) {
		return wrap(widget.getElement());
	}

	public final native JQueryObject wrap(Element element) /*-{
		return this.wrap(element);
	}-*/;

	public final native JQueryObject wrap(JQueryObject jqObj) /*-{
		return this.wrap(jqObj);
	}-*/;

	/**
	 * Need to return a html string or a dom element or a jquery object in
	 * handler
	 * 
	 * @param handler
	 * @return
	 */
	public final JQueryObject wrap(JQIndexHandler<Object> handler) {
		return JQueryObjectFunctions.treatWithJQIndexHandler(this, "wrap",
				handler);
	}

	// -----------------------------------------
	// wrapInner
	// -----------------------------------------

	public final native JQueryObject wrapInner(String htmlOrSelector) /*-{
		return this.wrapInner(htmlOrSelector);
	}-*/;

	public final JQueryObject wrapInner(Widget widget) {
		return wrapInner(widget.getElement());
	}

	public final native JQueryObject wrapInner(Element element) /*-{
		return this.wrapInner(element);
	}-*/;

	public final native JQueryObject wrapInner(JQueryObject jqObj) /*-{
		return this.wrapInner(jqObj);
	}-*/;

	/**
	 * Need to return a html string or a dom element or a jquery object in
	 * handler
	 * 
	 * @param handler
	 * @return
	 */
	public final JQueryObject wrapInner(JQIndexHandler<Object> handler) {
		return JQueryObjectFunctions.treatWithJQIndexHandler(this, "wrapInner",
				handler);
	}

	// -----------------------------------------
	// wrapAll
	// -----------------------------------------

	public final native JQueryObject wrapAll(String htmlOrSelector) /*-{
		return this.wrapAll(htmlOrSelector);
	}-*/;

	public final JQueryObject wrapAll(Widget widget) {
		return wrapAll(widget.getElement());
	}

	public final native JQueryObject wrapAll(Element element) /*-{
		return this.wrapAll(element);
	}-*/;

	public final native JQueryObject wrapAll(JQueryObject jqObj) /*-{
		return this.wrapAll(jqObj);
	}-*/;

	// -----------------------------------------
	// replaceWith
	// -----------------------------------------

	public final native JQueryObject replaceWith(String html) /*-{
		return this.replaceWith(html);
	}-*/;

	public final JQueryObject replaceWith(Widget widget) {
		return replaceWith(widget.getElement());
	}

	public final native JQueryObject replaceWith(Element element) /*-{
		return this.replaceWith(element);
	}-*/;

	public final native JQueryObject replaceWith(JQueryObject jqObj) /*-{
		return this.replaceWith(jqObj);
	}-*/;

	public final JQueryObject replaceWith(JQCommonHandler handler) {
		return JQueryObjectFunctions.treatWithJQCommonHandler(this,
				"replaceWith", handler);
	}

	// -----------------------------------------
	// prependTo
	// -----------------------------------------

	public final native JQueryObject prependTo(String htmlOrSelector) /*-{
		return this.prependTo(htmlOrSelector);
	}-*/;

	public final JQueryObject prependTo(Widget widget) {
		return prependTo(widget.getElement());
	}

	public final native JQueryObject prependTo(Element element) /*-{
		return this.prependTo(element);
	}-*/;

	public final native JQueryObject prependTo(JQueryObject jqObj) /*-{
		return this.prependTo(jqObj);
	}-*/;

	// -----------------------------------------
	// appendTo
	// -----------------------------------------

	public final native JQueryObject appendTo(String htmlOrSelector) /*-{
		return this.appendTo(htmlOrSelector);
	}-*/;

	public final JQueryObject appendTo(Widget widget) {
		return appendTo(widget.getElement());
	}

	public final native JQueryObject appendTo(Element element) /*-{
		return this.appendTo(element);
	}-*/;

	public final native JQueryObject appendTo(JQueryObject jqObj) /*-{
		return this.appendTo(jqObj);
	}-*/;

	// -----------------------------------------
	// insertAfter
	// -----------------------------------------

	public final native JQueryObject insertAfter(String htmlOrSelector) /*-{
		return this.insertAfter(htmlOrSelector);
	}-*/;

	public final JQueryObject insertAfter(Widget widget) {
		return insertAfter(widget.getElement());
	}

	public final native JQueryObject insertAfter(Element element) /*-{
		return this.insertAfter(element);
	}-*/;

	public final native JQueryObject insertAfter(JQueryObject jqObj) /*-{
		return this.insertAfter(jqObj);
	}-*/;

	// -----------------------------------------
	// insertBefore
	// -----------------------------------------

	public final native JQueryObject insertBefore(String htmlOrSelector) /*-{
		return this.insertBefore(htmlOrSelector);
	}-*/;

	public final JQueryObject insertBefore(Widget widget) {
		return insertBefore(widget.getElement());
	}

	public final native JQueryObject insertBefore(Element element) /*-{
		return this.insertBefore(element);
	}-*/;

	public final native JQueryObject insertBefore(JQueryObject jqObj) /*-{
		return this.insertBefore(jqObj);
	}-*/;

	// -----------------------------------------
	// replaceAll
	// -----------------------------------------

	public final native JQueryObject replaceAll(String selector) /*-{
		return this.replaceAll(selector);
	}-*/;

	// -----------------------------------------
	// clone
	// -----------------------------------------

	public final native JQueryObject clone() /*-{
		return this.clone();
	}-*/;

	public final native JQueryObject clone(boolean withDataAndEvents) /*-{
		return this.clone(withDataAndEvents);
	}-*/;

	public final native JQueryObject clone(boolean withDataAndEvents,
			boolean deepWithDataAndEvents) /*-{
		return this.clone(withDataAndEvents, deepWithDataAndEvents);
	}-*/;

	// -----------------------------------------
	// detach
	// -----------------------------------------

	public final native JQueryObject detach() /*-{
		return this.detach();
	}-*/;

	public final native JQueryObject detach(String selector) /*-{
		return this.detach(selector);
	}-*/;

	// -----------------------------------------
	// empty
	// -----------------------------------------

	public final native JQueryObject empty() /*-{
		return this.empty();
	}-*/;

	// -----------------------------------------
	// unwrap
	// -----------------------------------------

	public final native JQueryObject unwrap() /*-{
		return this.unwrap();
	}-*/;

	// -----------------------------------------
	// add
	// -----------------------------------------

	public final native JQueryObject add(String htmlOrSelector) /*-{
		return this.add(htmlOrSelector);
	}-*/;

	public final JQueryObject add(Widget widget) {
		return add(widget.getElement());
	}

	public final native JQueryObject add(Element element) /*-{
		return this.add(element);
	}-*/;

	public final native JQueryObject add(JQueryObject jqObj) /*-{
		return this.add(jqObj);
	}-*/;

	public final native JQueryObject add(String htmlOrSelector, Element context) /*-{
		return this.add(htmlOrSelector, context);
	}-*/;

	public final JQueryObject add(Widget widget, Element context) {
		return add(widget.getElement(), context);
	}

	public final native JQueryObject add(Element element, Element context) /*-{
		return this.add(element, context);
	}-*/;

	public final native JQueryObject add(JQueryObject jqObj, Element context) /*-{
		return this.add(jqObj, context);
	}-*/;

	public final native JQueryObject add(String htmlOrSelector,
			JQueryObject context) /*-{
		return this.add(htmlOrSelector, context);
	}-*/;

	public final JQueryObject add(Widget widget, JQueryObject context) {
		return add(widget.getElement(), context);
	}

	public final native JQueryObject add(Element element, JQueryObject context) /*-{
		return this.add(element, context);
	}-*/;

	public final native JQueryObject add(JQueryObject jqObj,
			JQueryObject context) /*-{
		return this.add(jqObj, context);
	}-*/;

	// -----------------------------------------
	// remove
	// -----------------------------------------

	public final native JQueryObject remove() /*-{
		return this.remove();
	}-*/;

	public final native JQueryObject remove(String selector) /*-{
		return this.remove(selector);
	}-*/;

	// -----------------------------------------
	// length
	// -----------------------------------------

	public final native int length() /*-{
		return this.length;
	}-*/;

	// -----------------------------------------
	// size
	// -----------------------------------------

	public final native int size() /*-{
		return this.size();
	}-*/;

	// -----------------------------------------
	// andSelf
	// -----------------------------------------

	public final native JQueryObject andSelf() /*-{
		return this.andSelf();
	}-*/;

	// -----------------------------------------
	// children
	// -----------------------------------------

	public final native JQueryObject children() /*-{
		return this.children();
	}-*/;

	public final native JQueryObject children(String selector) /*-{
		return this.children(selector);
	}-*/;

	// -----------------------------------------
	// each
	// -----------------------------------------

	/**
	 * Need to return a boolean value in handler, when it's false then break the
	 * loop
	 * 
	 * @param handler
	 * @return
	 */
	public final JQueryObject each(JQIndexHandler<Boolean> handler) {
		return JQueryObjectFunctions.treatWithJQIndexHandler(this, "each",
				handler);
	}

	public final native JQueryObject each(JQueryHandler handler)/*-{
 	
  }-*/;

	// -----------------------------------------
	// end
	// -----------------------------------------

	public final native JQueryObject end() /*-{
		return this.end();
	}-*/;

	// -----------------------------------------
	// eq
	// -----------------------------------------

	public final native JQueryObject eq(int index) /*-{
		return this.eq(index);
	}-*/;

	// -----------------------------------------
	// filter
	// -----------------------------------------

	public final native JQueryObject filter(String selector) /*-{
		return this.filter(selector);
	}-*/;

	public final JQueryObject filter(Widget widget) {
		return filter(widget.getElement());
	}

	public final native JQueryObject filter(Element element) /*-{
		return this.filter(element);
	}-*/;

	public final native JQueryObject filter(JQueryObject jqObj) /*-{
		return this.filter(jqObj);
	}-*/;

	/**
	 * Need to return boolean value in handler, when it's true that means to add
	 * the matched element into filtered set.
	 * 
	 * @param handler
	 * @return
	 */
	public final JQueryObject filter(JQIndexHandler<Boolean> handler) {
		return JQueryObjectFunctions.treatWithJQIndexHandler(this, "filter",
				handler);
	}

	// -----------------------------------------
	// not
	// -----------------------------------------

	public final native JQueryObject not(String selector) /*-{
		return this.not(selector);
	}-*/;

	public final JQueryObject not(Widget widget) {
		return not(widget.getElement());
	}

	public final native JQueryObject not(Element element) /*-{
		return this.not(element);
	}-*/;

	public final native JQueryObject not(JQueryObject jqObj) /*-{
		return this.not(jqObj);
	}-*/;

	/**
	 * Need to return boolean value in handler, when it's true that means the
	 * element is matched to not
	 * 
	 * @param handler
	 * @return
	 */
	public final JQueryObject not(JQIndexHandler<Boolean> handler) {
		return JQueryObjectFunctions.treatWithJQIndexHandler(this, "not",
				handler);
	}

	// -----------------------------------------
	// find
	// -----------------------------------------

	public final native JQueryObject find(String selector) /*-{
		return this.find(selector);
	}-*/;

	public final JQueryObject find(Widget widget) {
		return find(widget.getElement());
	}

	public final native JQueryObject find(Element element) /*-{
		return this.find(element);
	}-*/;

	public final native JQueryObject find(JQueryObject jqObj) /*-{
		return this.find(jqObj);
	}-*/;

	// -----------------------------------------
	// first
	// -----------------------------------------

	public final native JQueryObject first() /*-{
		return this.first();
	}-*/;

	// -----------------------------------------
	// last
	// -----------------------------------------

	public final native JQueryObject last() /*-{
		return this.last();
	}-*/;

	// -----------------------------------------
	// has
	// -----------------------------------------

	public final native JQueryObject has(String selector) /*-{
		return this.has(selector);
	}-*/;

	public final JQueryObject has(Widget widget) {
		return has(widget.getElement());
	}

	public final native JQueryObject has(Element element) /*-{
		return this.has(element);
	}-*/;

	// -----------------------------------------
	// is
	// -----------------------------------------

	public final native boolean is(String selector) /*-{
		return this.is(selector);
	}-*/;

	public final boolean is(Widget widget) {
		return is(widget.getElement());
	}

	public final native boolean is(Element element) /*-{
		return this.is(element);
	}-*/;

	public final native boolean is(JQueryObject jqObj) /*-{
		return this.is(jqObj);
	}-*/;

	/**
	 * Need to return boolean value in handler, when it's true that means to add
	 * the matched element into filtered set.
	 * 
	 * @param handler
	 * @return
	 */
	public final boolean is(JQIndexHandler<Boolean> handler) {
		return (Boolean) JQueryObjectFunctions.treatWithJQIndexHandler(this,
				"is", handler);
	}

	// -----------------------------------------
	// next
	// -----------------------------------------

	public final native JQueryObject next() /*-{
		return this.next();
	}-*/;

	public final native JQueryObject next(String selector) /*-{
		return this.next(selector);
	}-*/;

	// -----------------------------------------
	// nextAll
	// -----------------------------------------

	public final native JQueryObject nextAll() /*-{
		return this.nextAll();
	}-*/;

	public final native JQueryObject nextAll(String selector) /*-{
		return this.nextAll(selector);
	}-*/;

	// -----------------------------------------
	// prev
	// -----------------------------------------

	public final native JQueryObject prev() /*-{
		return this.prev();
	}-*/;

	public final native JQueryObject prev(String selector) /*-{
		return this.prev(selector);
	}-*/;

	// -----------------------------------------
	// prevAll
	// -----------------------------------------

	public final native JQueryObject prevAll() /*-{
		return this.prevAll();
	}-*/;

	public final native JQueryObject prevAll(String selector) /*-{
		return this.prevAll(selector);
	}-*/;

	// -----------------------------------------
	// siblings
	// -----------------------------------------

	public final native JQueryObject siblings() /*-{
		return this.siblings();
	}-*/;

	public final native JQueryObject siblings(String selector) /*-{
		return this.siblings(selector);
	}-*/;

	// -----------------------------------------
	// parent
	// -----------------------------------------

	public final native JQueryObject parent() /*-{
		return this.parent();
	}-*/;

	public final native JQueryObject parent(String selector) /*-{
		return this.parent(selector);
	}-*/;

	// -----------------------------------------
	// parents
	// -----------------------------------------

	public final native JQueryObject parents() /*-{
		return this.parents();
	}-*/;

	public final native JQueryObject parents(String selector) /*-{
		return this.parents(selector);
	}-*/;

	// -----------------------------------------
	// offsetParent
	// -----------------------------------------

	public final native JQueryObject offsetParent() /*-{
		return this.offsetParent();
	}-*/;

	// -----------------------------------------
	// slice
	// -----------------------------------------

	public final native JQueryObject slice(int start) /*-{
		return this.slice(start);
	}-*/;

	public final native JQueryObject slice(int start, int end) /*-{
		return this.slice(start, end);
	}-*/;

	// -----------------------------------------
	// nextUntil
	// -----------------------------------------

	public final native JQueryObject nextUntil() /*-{
		return this.nextUntil();
	}-*/;

	public final native boolean nextUntil(String selector) /*-{
		return this.nextUntil(selector);
	}-*/;

	public final boolean nextUntil(Widget widget) {
		return nextUntil(widget.getElement());
	}

	public final native boolean nextUntil(Element element) /*-{
		return this.nextUntil(element);
	}-*/;

	public final native boolean nextUntil(JQueryObject jqObj) /*-{
		return this.nextUntil(jqObj);
	}-*/;

	public final native boolean nextUntil(String selector, String filterSelector) /*-{
		return this.nextUntil(selector, filterSelector);
	}-*/;

	public final boolean nextUntil(Widget widget, String filterSelector) {
		return nextUntil(widget.getElement(), filterSelector);
	}

	public final native boolean nextUntil(Element element, String filterSelector) /*-{
		return this.nextUntil(element, filterSelector);
	}-*/;

	public final native boolean nextUntil(JQueryObject jqObj,
			String filterSelector) /*-{
		return this.nextUntil(jqObj, filterSelector);
	}-*/;

	// -----------------------------------------
	// prevUtil
	// -----------------------------------------

	public final native JQueryObject prevUtil() /*-{
		return this.prevUtil();
	}-*/;

	public final native boolean prevUtil(String selector) /*-{
		return this.prevUtil(selector);
	}-*/;

	public final boolean prevUtil(Widget widget) {
		return prevUtil(widget.getElement());
	}

	public final native boolean prevUtil(Element element) /*-{
		return this.prevUtil(element);
	}-*/;

	public final native boolean prevUtil(JQueryObject jqObj) /*-{
		return this.prevUtil(jqObj);
	}-*/;

	public final native boolean prevUtil(String selector, String filterSelector) /*-{
		return this.prevUtil(selector, filterSelector);
	}-*/;

	public final boolean prevUtil(Widget widget, String filterSelector) {
		return prevUtil(widget.getElement(), filterSelector);
	}

	public final native boolean prevUtil(Element element, String filterSelector) /*-{
		return this.prevUtil(element, filterSelector);
	}-*/;

	public final native boolean prevUtil(JQueryObject jqObj,
			String filterSelector) /*-{
		return this.prevUtil(jqObj, filterSelector);
	}-*/;

	// -----------------------------------------
	// parentsUntil
	// -----------------------------------------

	public final native JQueryObject parentsUntil() /*-{
		return this.parentsUntil();
	}-*/;

	public final native boolean parentsUntil(String selector) /*-{
		return this.parentsUntil(selector);
	}-*/;

	public final boolean parentsUntil(Widget widget) {
		return parentsUntil(widget.getElement());
	}

	public final native boolean parentsUntil(Element element) /*-{
		return this.parentsUntil(element);
	}-*/;

	public final native boolean parentsUntil(JQueryObject jqObj) /*-{
		return this.parentsUntil(jqObj);
	}-*/;

	public final native boolean parentsUntil(String selector,
			String filterSelector) /*-{
		return this.parentsUntil(selector, filterSelector);
	}-*/;

	public final boolean parentsUntil(Widget widget, String filterSelector) {
		return parentsUntil(widget.getElement(), filterSelector);
	}

	public final native boolean parentsUntil(Element element,
			String filterSelector) /*-{
		return this.parentsUntil(element, filterSelector);
	}-*/;

	public final native boolean parentsUntil(JQueryObject jqObj,
			String filterSelector) /*-{
		return this.parentsUntil(jqObj, filterSelector);
	}-*/;

	// -----------------------------------------
	// get
	// -----------------------------------------
	public final native <T extends Element> T get() /*-{
		return this.get();
	}-*/;

	public final native <T extends Element> T get(int index) /*-{
		return this.get(index);
	}-*/;

	// -----------------------------------------
	// outerHtml
	// -----------------------------------------
	public final native String outerHTML() /*-{
		return this.outerHTML();
	}-*/;

	public final native void enabled(boolean enabled) /*-{

		this.attr("disabled", !enabled);
	}-*/;

	public final native JQueryObject focusEnd() /*-{
		var tempVal = this.val();
		return this.focus().val('').val(tempVal);
	}-*/;

	public final native JQueryObject slideDown(String code) /*-{
		return this.slideDown(code);
	}-*/;

	public final native JQueryObject slideUp(String code) /*-{
		return this.slideUp(code);
	}-*/;

	public final native void disabled() /*-{
		this.attr("disabled", true);
	}-*/;

	public final native int outerWidth() /*-{
		return this.outerWidth();
	}-*/;

	public final native Element getElement() /*-{
		return this[0];
	}-*/;

	public final native int offsetLeft() /*-{
		return this.offset().left;
	}-*/;

	public final native int offsetTop() /*-{
		return this.offset().top;
	}-*/;

	public final native int outerHeight() /*-{
		return this.outerHeight();
	}-*/;

	public final native JQueryObject offset(int topPx, int leftPx) /*-{
		return this.offset({
			top : topPx,
			left : leftPx
		});
	}-*/;

	public final JQueryObject trigger(JQEventType eventType) {
		return trigger(eventType.name());
	}

	private final native JQueryObject trigger(String eventType) /*-{
		return this.trigger(eventType);
	}-*/;

}
