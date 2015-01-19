package bludau.study.algorithms.impl.search;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.search.qualifier.BinarySearchQualifier;
import bludau.study.algorithms.api.sorting.SortingProcessor;

@Component
@BinarySearchQualifier
public class SearchProcessorBinaryImpl implements SortingProcessor {

	/**
	 * {@inheritDoc}
	 * <p>
	 * The binary search implementation.
	 * </p>
	 */
	@Override
	public <T extends Comparable<T>> T[] sort(T[] inputArray) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] sort(T[] inputArray, Comparator<T> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

}
