package net.georgezeng.gwt.base.js.util;

public class JSObject {
  public static <T extends Enum<T>> T valueOf(Class<T> typeClass, String typeStr) {
    try {
      return Enum.valueOf(typeClass, typeStr);
    } catch (Exception e) {

    }
    return null;
  }

}
