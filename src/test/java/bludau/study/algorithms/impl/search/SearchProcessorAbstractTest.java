package bludau.study.algorithms.impl.search;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import bludau.study.algorithms.api.search.SearchProcessor;

/**
 * The abstract set of unit tests for {@link SearchProcessor}.
 * 
 * @author Anatol Bludau
 *
 */
public abstract class SearchProcessorAbstractTest {

	/**
	 * Target processor for the test.
	 */
	protected SearchProcessor searchProcessor;

	/**
	 * Simple array with data for test.
	 */
	private Integer[] simpleArrayForTest;

	/**
	 * Data initialization for test.
	 */
	@Before
	public void before() {
		simpleArrayForTest = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	}

	/**
	 * The test for returning array index if target element is not found.
	 */
	@Test
	public void testFindNotFoundReturnMessage() {
		int res = searchProcessor.find(simpleArrayForTest, 11);
		assertEquals(-1, res);
	}

	@Test
	public void testFindSimpleCase() {
		int res = searchProcessor.find(simpleArrayForTest, 6);
		assertEquals(5, res);
	}

	@Test(expected = NullPointerException.class)
	public void testFindNullPointerExceptionAtNullArray() {
		searchProcessor.find(null, 4);
	}

	@Test(expected = NullPointerException.class)
	public void testFindNullPointerExceptionAtNullElement() {
		searchProcessor.find(simpleArrayForTest, null);
	}
}