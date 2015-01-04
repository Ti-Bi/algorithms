package bludau.study.algorithms.impl.sorting;

import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.sorting.qualifier.InsertionSortQualifier;
import bludau.study.algorithms.api.util.ArrayElementUtils;

/**
 * The implementation of the insertion sorting processor.
 * 
 * @author Anatol Bludau
 *
 */
@Component
@InsertionSortQualifier
public class SortingProcessorInsertionSortImpl extends SortingProcessorAbstract {

	@Autowired
	private ArrayElementUtils arrayElementUtils;

	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * The insertion sorting implementation.
	 * </p>
	 */
	@Override
	protected <T> T[] sortArray(T[] inputArray, Comparator<T> comparator) {

		for (int i = 1; i < inputArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (comparator.compare(inputArray[j - 1], inputArray[j]) > 0) {
					arrayElementUtils.swap(inputArray, j - 1, j);
				}
			}
		}

		return inputArray;
	}

}
