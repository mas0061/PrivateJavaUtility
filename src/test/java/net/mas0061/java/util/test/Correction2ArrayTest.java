package net.mas0061.java.util.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.mas0061.java.util.Correction2Array;

import org.junit.Before;
import org.junit.Test;

public class Correction2ArrayTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMapToArrayDouble() {
		Map<Integer, List<Double>> map = new HashMap<>();
		List<Double> list1 = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0));
		List<Double> list2 = new ArrayList<Double>(Arrays.asList(4.0, 5.0, 6.0));
		List<Double> list3 = new ArrayList<Double>(Arrays.asList(7.0, 8.0, 9.0));
		map.put(0, list1);
		map.put(1, list2);
		map.put(2, list3);

		double[][] doubleArray = Correction2Array.mapToArrayDouble(map);
		List<Double> dList = new ArrayList<>(list1);
		dList.addAll(list2);
		dList.addAll(list3);

		int cnt = 0;
		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				assertTrue(doubleArray[i][j] == dList.get(cnt));
				cnt++;
			}
		}
	}

	@Test
	public void testListListToArray() {
		List<List<Double>> org = new ArrayList<>();
		org.add(new ArrayList<Double>(Arrays.asList(0.0, 1.0, 2.0)));
		org.add(new ArrayList<Double>(Arrays.asList(3.0, 4.0, 5.0)));
		org.add(new ArrayList<Double>(Arrays.asList(6.0, 7.0, 8.0)));

		double[][] array = Correction2Array.listListToArray(org);

		for (int i = 0; i < org.size(); i++) {
			for (int j = 0; j < org.get(i).size(); j++) {
				assertTrue(array[i][j] == org.get(i).get(j));
			}
		}
	}

	@Test
	public void testListListToArray2() {
		List<List<Double>> org = new ArrayList<>();
		org.add(new ArrayList<Double>(Arrays.asList(0.0, 1.0, 2.0)));
		org.add(new ArrayList<Double>(Arrays.asList(3.0, 4.0)));
		org.add(new ArrayList<Double>(Arrays.asList(6.0, 7.0, 8.0)));

		double[][] array = Correction2Array.listListToArray(org);

		for (int i = 0; i < org.size(); i++) {
			for (int j = 0; j < org.get(i).size(); j++) {
				assertTrue(array[i][j] == org.get(i).get(j));
			}
		}
	}

	@Test
	public void testListToArrayDouble() {
		List<Double> dList = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
		Double[] dArray = Correction2Array.listToArrayDouble(dList);
		assertTrue(dList.equals(Arrays.asList(dArray)));
	}

}
