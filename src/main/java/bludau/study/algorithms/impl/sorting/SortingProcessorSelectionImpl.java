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
	 */
	@Override
	public <T extends Comparable<T>> T[] sort(T[] inputArray) {
		return sortArray(inputArray, (x, y) -> {
			return x.compareTo(y);
		});
	}
	
	private <T> T[] sortArray(T[] inputArray, BiFunction<T, T, Integer> compareFunction){
		for (int i = 0; i < inputArray.length; i++){
			T currentMin = inputArray[i];
			int currentMinPosition = i;
			for (int j = i+1; j < inputArray.length; i++){
				if (compareFunction.apply(currentMin, inputArray[j]) > 0){
					currentMin = inputArray[j];
					currentMinPosition = j;
				}
			}
			
			arrayElementUtils.swap(inputArray, i, currentMinPosition);
		}
		
		return inputArray;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T> T[] sort(final T[] inputArray, final Comparator<T> comparator) {
		return sortArray(inputArray, (x, y) -> comparator.compare(x, y));
	}

}
