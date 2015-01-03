package bludau.study.algorithms.api.sorting;

import java.util.Comparator;

/**
 * The sorting Processor.
 * 
 * @author Anatol Bludau
 *
 */
public interface SortingProcessor {
	/**
	 * Sorts the input array. The original array is modified.
	 * 
	 * @param inputArray
	 *            the input array
	 * @return sorted array (the same object with input array)
	 */
	<T extends Comparable<T>> T[] sort(T[] inputArray);

	/**
	 * Sorts the input array using {@link Comparator}. The original array is
	 * modified.
	 * 
	 * @param inputArray
	 *            the input array
	 * @param comparator
	 *            the comparator for sorting
	 * @return sorted array (the same object with input array)
	 */
	<T> T[] sort(T[] inputArray, Comparator<T> comparator);
}
