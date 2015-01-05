package bludau.study.algorithms.impl.search;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.api.search.SearchProcessor;
import bludau.study.algorithms.api.search.qualifier.BrutForceSearchQualifier;
import bludau.study.algorithms.config.SpringConfig;

/**
 * Unit test for the {@link SearchProcessorBrutForceImpl} class.
 * 
 * @author Anatol Bludau
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class SearchProcessorBruteForceImplTest extends
		SearchProcessorAbstractTest {

	@Autowired
	@BrutForceSearchQualifier
	private void setSearchProcessor(SearchProcessor searchProcessor) {
		this.searchProcessor = searchProcessor;
	}
}
