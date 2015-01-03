package bludau.study.algorithms.api.sorting;

import org.springframework.beans.factory.annotation.Autowired;

import bludau.study.algorithms.api.sorting.qualifier.SelectionSortQualifier;

public class SortingProcessorSelectionImplTest {
	
	@Autowired
	@SelectionSortQualifier
	SortingProcessor selectionSortProcessor;
}
