package bludau.study.algorithms.impl.sorting;

import java.util.Comparator;
import java.util.function.BiFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.sorting.SortingProcessor;
import bludau.study.algorithms.api.sorting.qualifier.SelectionSortQualifier;
import bludau.study.algorithms.api.util.ArrayElementUtils;

/**
 * The selection sort implementation of {@link SortingProcessor}.
 * 
 * @author Anatol Bludau
 *
 */
@Component
@SelectionSortQualifier
public class SortingProcessorSelectionImpl implements SortingProcessor {

	@Autowired
	private ArrayElementUtils arrayElementUtils;

	/**
	 * {@inheritDoc}
	 * 
	 * <p>Implementation using the selection sort algorithm.</p>
	 */
	@Override
	public <T extends Comparable<T>> T[] sort(T[] inputArray) {
		return sortArray(inputArray, (x, y) -> x.compareTo(y));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * <p>Implementation using the selection sort algorithm.</p>
	 */
	@Override
	public <T> T[] sort(final T[] inputArray, final Comparator<T> comparator) {
		return sortArray(inputArray, (x, y) -> comparator.compare(x, y));
	}

	/**
	 * The implementation of the selection sort algorithm. The source array is
	 * modified.
	 * 
	 * @param inputArray
	 *            the array for sorting
	 * @param compareFunction
	 *            function for compare elements
	 * @return sorted array (the same object with inputArray)
	 */
	private <T> T[] sortArray(T[] inputArray,
			BiFunction<T, T, Integer> compareFunction) {
		for (int i = 0; i < inputArray.length; i++) {
			T currentMin = inputArray[i];
			int currentMinPosition = i;
			
			// looking for a minimum element
			for (int j = i + 1; j < inputArray.length; j++) {
				if (compareFunction.apply(currentMin, inputArray[j]) > 0) {
					currentMin = inputArray[j];
					currentMinPosition = j;
				}
			}

			// swap current element with minimum
			arrayElementUtils.swap(inputArray, i, currentMinPosition);
		}

		return inputArray;
	}
}
