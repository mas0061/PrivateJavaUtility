package net.mas0061.java.util.test;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Calendar;

import net.mas0061.java.util.TimestampUtil;

import org.junit.Test;

public class TimestampUtilTest {

	@Test
	public void testGetDayFirst() {
		long currentMillis = System.currentTimeMillis();
		Timestamp timestamp = TimestampUtil.getDayFirst(currentMillis);

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(timestamp.getTime());
		assertTrue(cal.get(Calendar.HOUR_OF_DAY) == 0 && cal.get(Calendar.MINUTE) == 0 && cal.get(Calendar.SECOND) == 0
			&& cal.get(Calendar.DATE) == getTodayDate()
		);
	}

	@Test
	public void testGetDayLast() {
		long currentMillis = System.currentTimeMillis();
		Timestamp timestamp = TimestampUtil.getDayLast(currentMillis);

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(timestamp.getTime());
		assertTrue(cal.get(Calendar.HOUR_OF_DAY) == 23 && cal.get(Calendar.MINUTE) == 59 && cal.get(Calendar.SECOND) == 59
			&& cal.get(Calendar.DATE) == getTodayDate()
		);
	}

	@Test
	public void testAddMinutes() {
		Calendar cal = Calendar.getInstance();
		int currentMinutes = cal.get(Calendar.MINUTE);
//		printTime(cal);

		Timestamp addMinTimestamp = TimestampUtil.addMinutes(cal.getTimeInMillis(), 5);
		Calendar addCal = Calendar.getInstance();
		addCal.setTimeInMillis(addMinTimestamp.getTime());
//		printTime(addCal);

		assertTrue(currentMinutes + 5 == addCal.get(Calendar.MINUTE));
	}

	private void printTime(Calendar cal) {
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));

	}

	private int getTodayDate() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.DATE);
	}

}
