package bludau.study.algorithms.api.sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import bludau.study.algorithms.api.sorting.qualifier.SelectionSortQualifier;
import bludau.study.algorithms.config.SpringConfig;
import bludau.study.algorithms.impl.sorting.SortingProcessorSelectionImpl;

/**
 * The test class for the {@link SortingProcessorSelectionImpl} class.
 * @author Anatol Bludau
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class SortingProcessorSelectionImplTest {

	@Autowired
	@SelectionSortQualifier
	private SortingProcessor selectionSortProcessor;
	
	private Integer[] simpleArrayForSorting;
	private Integer[] sortedSimpleArray;
	
	@Before
	public void before(){
		simpleArrayForSorting = new Integer[]{3, 2, 5, 4, 1};
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
	 * Check that result of sorting an array with single element it's equals array.
	 */
	@Test
	public void testSortWithOneElementArray(){
		Integer[] singleElementArray = new Integer[]{3};
		Integer[] sourceArray = ArrayUtils.clone(singleElementArray);
		Integer[] resultArray = selectionSortProcessor.sort(sourceArray);
		assertArrayEquals(singleElementArray, resultArray);
	}
	
	/**
	 * Check that method return the same array.
	 */
	@Test
	public void testSortForReturnValueIsTheSameElement(){
		Integer[] resultArray = selectionSortProcessor.sort(simpleArrayForSorting);
		assertSame(simpleArrayForSorting, resultArray);
	}
	
	/**
	 * Check the simple case of sorting.
	 */
	@Test
	public void testSortSimpleCase(){
		Integer[] resultArray = selectionSortProcessor.sort(simpleArrayForSorting);
		assertArrayEquals(sortedSimpleArray, resultArray);
	}
}
