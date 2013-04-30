package net.mas0061.java.util;

import java.util.List;
import java.util.Map;

/**
 * Correction2Array
 *
 * <p>
 * This class makes Array from the class which implemented the Collection interface.
 * </p>
 *
 * @author mas0061
 *
 */
public class Correction2Array {

	/**
	 * mapToArrayDouble
	 *
	 * <p>
	 * Two-dimensional array is made from Map.
	 *
	 * !!! The key of Map needs to be located in a line in order by zero origin.
	 * </p>
	 *
	 * @param map
	 * @return
	 */
	public static double[][] mapToArrayDouble(Map<Integer, List<Double>> map) {
		double[][] retArray = null;
		boolean first = true;

		for (Integer i : map.keySet()) {
			if (first) {
				retArray = new double[map.size()][map.get(i).size()];
				first = false;
			}

			for (int j = 0; j < map.get(i).size(); j++) {
				retArray[i][j] = map.get(i).get(j);
			}
		}

		return retArray;
	}

	/**
	 * listListToArray
	 *
	 * <p>
	 * The two-dimensional array of double is made from List of List of Double.
	 * </p>
	 *
	 * @param list
	 * @return
	 */
	public static double[][] listListToArray(List<List<Double>> list) {
		int maxElementSize = 0;
		for (List<Double> l : list) {
			if (maxElementSize < l.size()) {
				maxElementSize = l.size();
			}
		}

		double[][] retArray = new double[list.size()][maxElementSize];

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				retArray[i][j] = list.get(i).get(j);
			}
		}

		return retArray;
	}

	/**
	 * listToArrayDouble
	 *
	 * <p>
	 * The array of Double is made from List of Double.
	 * </p>
	 *
	 * @param list
	 * @return
	 */
	public static Double[] listToArrayDouble(List<Double> list) {
		return list.toArray(new Double[list.size()]);
	}

}
