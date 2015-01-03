package bludau.study.algorithms.impl.sorting;

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
public class SortingProcessorSelectionImpl extends SortingProcessorAbstract {

	@Autowired
	private ArrayElementUtils arrayElementUtils;

	/**
	 * {@inheritDoc}
	 * 
	 * <p>The Selection sort algorithm is used for this implementation.</p>
	 */
	protected <T> T[] sortArray(T[] inputArray,
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
