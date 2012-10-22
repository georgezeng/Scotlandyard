package net.georgezeng.misterx.app.service.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	public static String getValue(HttpServletRequest req, String name) {
		Cookie[] cookies = req.getCookies();
		if (cookies != null && cookies.length > 0) {
			for (Cookie cookie : cookies) {
				if (name.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}

	public static void writeCookie(HttpServletResponse res, String name, String value, boolean isSecure, int expiry) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(expiry);
		cookie.setSecure(isSecure);
		cookie.setPath("/");
		res.addCookie(cookie);
	}
}
