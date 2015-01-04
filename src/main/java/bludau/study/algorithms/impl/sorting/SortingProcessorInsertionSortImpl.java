package bludau.study.algorithms.impl.sorting;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.sorting.qualifier.InsertionSortQualifier;

/**
 * The implementation of the insertion sorting processor.
 * 
 * @author Anatol Bludau
 *
 */
@Component
@InsertionSortQualifier
public class SortingProcessorInsertionSortImpl extends SortingProcessorAbstract {

	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * The insertion sorting implementation.
	 * </p>
	 */
	@Override
	protected <T> T[] sortArray(T[] inputArray, Comparator<T> compareFunction) {

		for (int i = 1; i < inputArray.length; i++) {
			for (int j = i; j > 0; j--) {

			}
		}
		return null;
	}

}
