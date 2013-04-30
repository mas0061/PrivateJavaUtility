package net.mas0061.java.util;

import java.sql.Timestamp;
import java.util.Calendar;

/**
 * TimestampUtil
 *
 * <p>
 * This class is a utility of a java.sql.Timestamp class.
 * </p>
 *
 * @author mas0061
 *
 */
public class TimestampUtil {

	/**
	 * getDayFirst
	 *
	 * <p>
	 * The Timestamp class which hits at 0:00:00.000 of the day of the specified time is returned.
	 * </p>
	 *
	 * @param currentMillis
	 * @return
	 */
	public static Timestamp getDayFirst(long currentMillis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(currentMillis);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new Timestamp(calendar.getTimeInMillis());
	}

	/**
	 * getDayLast
	 *
	 * <p>
	 * The Timestamp class which hits at 23:59:59.999 of the day of the specified time is returned.
	 * </p>
	 *
	 * @param currentMillis
	 * @return
	 */
	public static Timestamp getDayLast(long currentMillis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(currentMillis);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return new Timestamp(calendar.getTimeInMillis());
	}

	/**
	 * addMinutes
	 *
	 * <p>
	 * Timestamp adding a part to have been specified as the specified time is returned.
	 * </p>
	 *
	 * @param currentMillis
	 * @param addMinutes
	 * @return
	 */
	public static Timestamp addMinutes(long currentMillis, int addMinutes) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(currentMillis);
		calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) + addMinutes);
		return new Timestamp(calendar.getTimeInMillis());
	}
}
