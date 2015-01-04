package bludau.study.algorithms.impl.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.api.util.ArrayElementUtils;
import bludau.study.algorithms.config.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class ArrayElementUtilsImplTest {

	@Autowired
	ArrayElementUtils utils;

	Integer[] inputArray;

	@Before
	public void before() {
		inputArray = new Integer[] { 1, 2, 3, 4, 5 };
	}

	@Test
	public void testSwap() {
		Integer[] expectedResult = new Integer[] { 1, 2, 4, 3, 5 };

		utils.swap(inputArray, 2, 3);
		assertArrayEquals(expectedResult, inputArray);
	}

	@Test(expected = NullPointerException.class)
	public void testSwapForNull() {
		utils.swap(null, 3, 2);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testSwapForIndexOutOfBound() {
		utils.swap(inputArray, 1000, 20);
	}

	@Test
	public void testSwapReturnValue() {
		Integer[] resultArray = utils.swap(inputArray, 2, 3);
		assertSame(resultArray, inputArray);
	}
	
	@Test
	public void testIsArraysHasSameElements(){
		Integer[] secondArray = new Integer[]{3, 2, 1, 5, 4};
		
		assertTrue(utils.isArraysHasSameElements(inputArray, secondArray));
	}
	
	@Test
	public void testIsArraysHasSameElementsFalse(){
		Integer[] firstArray = new Integer[]{1, 2, 3, 5, 6};

		assertFalse(utils.isArraysHasSameElements(firstArray, inputArray));
	}
	
	@Test(expected=NullPointerException.class)
	public void testIsArraysHasSameElementsFirstNullElement(){
		utils.isArraysHasSameElements(null, inputArray);
	}

	@Test(expected=NullPointerException.class)
	public void testIsArraysHasSameElementsSecondNullElement(){
		utils.isArraysHasSameElements(inputArray, null);
	}
}
