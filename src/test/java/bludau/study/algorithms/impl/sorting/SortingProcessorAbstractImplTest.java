package bludau.study.algorithms.impl.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.Test;

import bludau.study.algorithms.api.sorting.SortingProcessor;

/**
 * The abstract test class for the {@link SortingProcessor} class.
 * 
 * @author Anatol Bludau
 *
 */
public abstract class SortingProcessorAbstractImplTest {

	/**
	 * The field for sorting processor.
	 */
	protected SortingProcessor sortingProcessor;

	/**
	 * Simple instance of array for testing.
	 */
	private Integer[] simpleArrayForSorting;

	/**
	 * Sorted version of simple instance of array for testing.
	 */
	private Integer[] sortedSimpleArray;

	/**
	 * Comparator function for the comparable types.
	 */
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
		Integer[] result = sortingProcessor.sort(emptyArray);
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
		Integer[] resultArray = sortingProcessor.sort(sourceArray);
		assertArrayEquals(singleElementArray, resultArray);
	}

	/**
	 * Check that method return the same array.
	 */
	@Test
	public void testSortForReturnValueIsTheSameElement() {
		Integer[] resultArray = sortingProcessor.sort(simpleArrayForSorting);
		assertSame(simpleArrayForSorting, resultArray);
	}

	/**
	 * Check the simple case of sorting.
	 */
	@Test
	public void testSortSimpleCase() {
		Integer[] resultArray = sortingProcessor.sort(simpleArrayForSorting);
		assertArrayEquals(sortedSimpleArray, resultArray);
	}

	/**
	 * Check that method throws the {@link NullPointerException} if source array
	 * is {@code null}.
	 */
	@Test(expected = NullPointerException.class)
	public void testSortNullThrows() {
		sortingProcessor.sort(null);
	}

	/**
	 * Check that result of sorting an empty array is empty array too.
	 */
	@Test
	public void testSortComparatorWithEmptyArray() {
		Integer[] emptyArray = new Integer[] {};
		Integer[] result = sortingProcessor.sort(emptyArray, comparator);
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
		Integer[] resultArray = sortingProcessor.sort(sourceArray, comparator);
		assertArrayEquals(singleElementArray, resultArray);
	}

	/**
	 * Check that method return the same array.
	 */
	@Test
	public void testSortComparatorForReturnValueIsTheSameElement() {
		Integer[] resultArray = sortingProcessor.sort(simpleArrayForSorting,
				comparator);
		assertSame(simpleArrayForSorting, resultArray);
	}

	/**
	 * Check the simple case of sorting.
	 */
	@Test
	public void testSortComparatorSimpleCase() {
		Integer[] resultArray = sortingProcessor.sort(simpleArrayForSorting,
				comparator);
		assertArrayEquals(sortedSimpleArray, resultArray);
	}

	/**
	 * Check that method throws the {@link NullPointerException} if source array
	 * is {@code null}.
	 */
	@Test(expected = NullPointerException.class)
	public void testSortComparatorNullThrows() {
		sortingProcessor.sort(null, comparator);
	}

	/**
	 * Check comparator in reverse order.
	 */
	@Test
	public void testSortComparatorReverse() {
		Integer[] expectedResult = ArrayUtils.clone(sortedSimpleArray);
		ArrayUtils.reverse(expectedResult);
		Integer[] actualResult = sortingProcessor.sort(simpleArrayForSorting, (
				x, y) -> y.compareTo(x));
		assertArrayEquals(expectedResult, actualResult);
	}
}
