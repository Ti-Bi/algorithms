package bludau.study.algorithms.api.util;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.config.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class ArrayElementUtilsImplTest {
	
	@Autowired
	ArrayElementUtils utils;
	
	@Test
	public void testSwap(){
		Integer[] inputArray = new Integer[]{1, 2, 3, 4, 5};
		Integer[] expectedResult = new Integer[]{1, 2, 4, 3, 5};
		
		utils.swap(inputArray, 2, 3);
		assertArrayEquals(expectedResult, inputArray);
	}
}
