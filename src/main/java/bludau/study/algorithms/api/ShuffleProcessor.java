package bludau.study.algorithms.api;

import java.util.Comparator;

/**
 * The class represents a processor for shuffling an array.
 * 
 * @author Anatol Bludau
 *
 */
public interface ShuffleProcessor {

	/**
	 * Shuffle an array of objects which implements the {@link Comparable}
	 * interface.
	 * <p>
	 * <font color='red'><b>The original array is changed.</b></font>
	 * </p>
	 * 
	 * @param inputArray
	 *            array for sorting
	 */
	<T> void shuffle(Comparable<T>[] inputArray);

	/**
	 * Shuffle an array of objects with provided comporator.
	 * <p>
	 * <font color='red'><b>The original array is changed.</b></font>
	 * </p>
	 * 
	 * @param inputArray
	 *            array for sorting
	 */
	<T> void shuffle(T[] inputArray, Comparator<T> comparator);
}
