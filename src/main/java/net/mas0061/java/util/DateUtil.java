package net.mas0061.java.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * DateUtil
 *
 * <p>
 * This class offers the utility method to a Date class. 
 * </p>
 *
 * @author mas0061
 *
 */
public class DateUtil {

	/**
	 * isValidDate
	 *
	 * <p>
	 * This method inspects whether the character string has agreed in the format of "yyyy-mm-dd". 
	 * </p>
	 *
	 * @param text
	 * @return
	 */
	public static boolean isValidDate(String text) {
		return isValidRegexp(text, "^[0-9]{4}-[01]?[0-9]-[0123]?[0-9]$");
	}

	/**
	 * isValidTime
	 *
	 * <p>
	 * This method inspects whether the character string has agreed in the format of "00:00". 
	 * </p>
	 *
	 * @param text
	 * @return
	 */
	public static boolean isValidTime(String text) {
		return isValidRegexp(text, "^[0-2]?[0-9]:[0-5]?[0-9]$");
	}
	
	private static boolean isValidRegexp(String text, String regexp) {
		Matcher matcher = Pattern.compile(regexp).matcher(text);
		return matcher.find();
	}
}
