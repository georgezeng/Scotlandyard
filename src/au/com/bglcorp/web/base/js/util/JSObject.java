package au.com.bglcorp.web.base.js.util;

/**
 * @author Denny(Kong Fan Zhi)
 * @date 2012-7-18
 * 
 */
public class JSObject {
  public static <T extends Enum<T>> T valueOf(Class<T> typeClass, String typeStr) {
    try {
      return Enum.valueOf(typeClass, typeStr);
    } catch (Exception e) {

    }
    return null;
  }

}
