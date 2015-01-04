package bludau.study.algorithms.impl.sorting;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.api.sorting.SortingProcessor;
import bludau.study.algorithms.api.sorting.qualifier.SelectionSortQualifier;
import bludau.study.algorithms.config.SpringConfig;

/**
 * Unit test for the selection sort.
 * 
 * @author Anatol Bludau
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class SortingProcessorSelectionSortImplTest extends
		SortingProcessorAbstractImplTest {

	@Autowired
	@SelectionSortQualifier
	private void setSortingProcessor(SortingProcessor sortingProcessor) {
		this.sortingProcessor = sortingProcessor;
	}
}
