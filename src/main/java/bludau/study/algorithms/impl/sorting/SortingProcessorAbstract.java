package bludau.study.algorithms.impl.sorting;

import java.util.Comparator;
import java.util.function.BiFunction;

import bludau.study.algorithms.api.sorting.SortingProcessor;

abstract class SortingProcessorAbstract implements SortingProcessor {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends Comparable<T>> T[] sort(T[] inputArray) {
		return sortArray(inputArray, (x, y) -> x.compareTo(y));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T> T[] sort(final T[] inputArray, final Comparator<T> comparator) {
		return sortArray(inputArray, (x, y) -> comparator.compare(x, y));
	}
	
	/**
	 * The implementation of the sorting algorithm. The source array is
	 * modified.
	 * 
	 * @param inputArray
	 *            the array for sorting
	 * @param compareFunction
	 *            function for compare elements
	 * @return sorted array (the same object with inputArray)
	 */
	abstract protected <T> T[] sortArray(T[] inputArray,
			BiFunction<T, T, Integer> compareFunction);
}
