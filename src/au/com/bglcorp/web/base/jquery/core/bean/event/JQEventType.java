package au.com.bglcorp.web.base.jquery.core.bean.event;

public enum JQEventType {
  load, submit, click, dblclick, focus, blur, change, mouseover, mouseout, mousedown, mouseup, mouseenter, mouseleave, scroll, select, hover,
  /**
   * recommended to use it as the first choice when dealing with the key press event
   */
  keydown,
  /**
   * it may not work at some browser
   */
  keyup,
  /**
   * it may not work at some browser
   */
  keypress
}
