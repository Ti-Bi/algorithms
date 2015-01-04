package bludau.study.algorithms.impl.sorting;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.api.sorting.SortingProcessor;
import bludau.study.algorithms.api.sorting.qualifier.InsertionSortQualifier;
import bludau.study.algorithms.config.SpringConfig;

/**
 * The unit test for insertion test.
 * 
 * @author Anatol Bludau
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class SortingProcessorInsertionSortImplTest extends
		SortingProcessorAbstractImplTest {

	@Autowired
	@InsertionSortQualifier
	private void setSortingProcessor(SortingProcessor sortingProcessor) {
		this.sortingProcessor = sortingProcessor;
	}

}
