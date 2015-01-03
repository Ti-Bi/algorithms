package bludau.study.algorithms.api.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.api.sorting.qualifier.SelectionSortQualifier;
import bludau.study.algorithms.config.SpringConfig;
import bludau.study.algorithms.impl.sorting.SortingProcessorSelectionImpl;

/**
 * The test class for the {@link SortingProcessorSelectionImpl} class.
 * 
 * @author Anatol Bludau
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class SortingProcessorSelectionImplTest {

	@Autowired
	@SelectionSortQualifier
	private SortingProcessor selectionSortProcessor;

	private Integer[] simpleArrayForSorting;
	private Integer[] sortedSimpleArray;
	private Comparator<Integer> comparator = (x, y) -> x.compareTo(y);

	@Before
	public void before() {
		simpleArrayForSorting = new Integer[] { 3, 2, 5, 4, 1 };
		sortedSimpleArray = ArrayUtils.clone(simpleArrayForSorting);
		Arrays.sort(sortedSimpleArray);
	}

	/**
	 * Check that result of sorting an empty array is empty array too.
	 */
	@Test
	public void testSortWithEmptyArray() {
		Integer[] emptyArray = new Integer[] {};
		Integer[] result = selectionSortProcessor.sort(emptyArray);
		assertTrue(ArrayUtils.isEmpty(result));
	}

	/**
	 * Check that result of sorting an array with single element it's equals
	 * array.
	 */
	@Test
	public void testSortWithOneElementArray() {
		Integer[] singleElementArray = new Integer[] { 3 };
		Integer[] sourceArray = ArrayUtils.clone(singleElementArray);
		Integer[] resultArray = selectionSortProcessor.sort(sourceArray);
		assertArrayEquals(singleElementArray, resultArray);
	}

	/**
	 * Check that method return the same array.
	 */
	@Test
	public void testSortForReturnValueIsTheSameElement() {
		Integer[] resultArray = selectionSortProcessor
				.sort(simpleArrayForSorting);
		assertSame(simpleArrayForSorting, resultArray);
	}

	/**
	 * Check the simple case of sorting.
	 */
	@Test
	public void testSortSimpleCase() {
		Integer[] resultArray = selectionSortProcessor
				.sort(simpleArrayForSorting);
		assertArrayEquals(sortedSimpleArray, resultArray);
	}

	/**
	 * Check that method throws the {@link NullPointerException} if source array
	 * is {@code null}.
	 */
	@Test(expected = NullPointerException.class)
	public void testSortNullThrows() {
		selectionSortProcessor.sort(null);
	}

	/**
	 * Check that result of sorting an empty array is empty array too.
	 */
	@Test
	public void testSortComparatorWithEmptyArray() {
		Integer[] emptyArray = new Integer[] {};
		Integer[] result = selectionSortProcessor.sort(emptyArray, comparator);
		assertTrue(ArrayUtils.isEmpty(result));
	}

	/**
	 * Check that result of sorting an array with single element it's equals
	 * array.
	 */
	@Test
	public void testSortComparatorWithOneElementArray() {
		Integer[] singleElementArray = new Integer[] { 3 };
		Integer[] sourceArray = ArrayUtils.clone(singleElementArray);
		Integer[] resultArray = selectionSortProcessor.sort(sourceArray,
				comparator);
		assertArrayEquals(singleElementArray, resultArray);
	}

	/**
	 * Check that method return the same array.
	 */
	@Test
	public void testSortComparatorForReturnValueIsTheSameElement() {
		Integer[] resultArray = selectionSortProcessor.sort(
				simpleArrayForSorting, comparator);
		assertSame(simpleArrayForSorting, resultArray);
	}

	/**
	 * Check the simple case of sorting.
	 */
	@Test
	public void testSortComparatorSimpleCase() {
		Integer[] resultArray = selectionSortProcessor.sort(
				simpleArrayForSorting, comparator);
		assertArrayEquals(sortedSimpleArray, resultArray);
	}

	/**
	 * Check that method throws the {@link NullPointerException} if source array
	 * is {@code null}.
	 */
	@Test(expected = NullPointerException.class)
	public void testSortComparatorNullThrows() {
		selectionSortProcessor.sort(null, comparator);
	}

	/**
	 * Check comparator in reverse order.
	 */
	@Test
	public void testSortComparatorReverse() {
		Integer[] expectedResult = ArrayUtils.clone(sortedSimpleArray);
		ArrayUtils.reverse(expectedResult);
		Integer[] actualResult = selectionSortProcessor.sort(
				simpleArrayForSorting, (x, y) -> y.compareTo(x));
		assertArrayEquals(expectedResult, actualResult);
	}
}
