package bludau.study.algorithms.impl.sorting;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.sorting.SortingProcessor;
import bludau.study.algorithms.api.sorting.qualifier.SelectionSortQualifier;

@Component
@SelectionSortQualifier
public class SortingProcessorSelectionImpl implements SortingProcessor {

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
