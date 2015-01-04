package bludau.study.algorithms.impl.shuffle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.api.shuffle.ShuffleProcessor;
import bludau.study.algorithms.api.shuffle.qualifier.Knuth;
import bludau.study.algorithms.api.util.ArrayElementUtils;
import bludau.study.algorithms.config.SpringConfig;
import bludau.study.algorithms.impl.shuffle.ShuffleProcessorKnuthImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class ShuffleProcessorKnuthImplTest {

	@Autowired
	@Knuth
	private ShuffleProcessor processor;
	
	@Autowired
	private ArrayElementUtils arrayUtils;

	@Test
	public void testShuffleComparableOfArrayInject() {
		assertTrue(processor instanceof ShuffleProcessorKnuthImpl);
	}

	@Test
	public void testShuffleOfNull() {
		// Just check that no error threw
		assertNull(processor.shuffle(null));
	}
	
	@Test
	public void testShuffleOfEmpty(){
		Integer[] emptyArray = new Integer[0];
		assertTrue(processor.shuffle(emptyArray).length == 0);
	}
	
	@Test
	public void testShuffleOfOneElement(){
		Integer[] oneElementArray = new Integer[]{1};
		
		Integer[] result = processor.shuffle(oneElementArray);
		assertArrayEquals(oneElementArray, result);
	}
	
	@Test
	public void testShuffleArrayLength(){
		Integer[] sourceArray = new Integer[]{1, 2, 3, 4, 5};
		Integer[] resultArray = processor.shuffle(sourceArray);
		assertEquals(sourceArray.length, resultArray.length);
	}
	
	@Test
	public void testArrayConsistevity(){
		Integer[] sourceArray = new Integer[]{1, 2, 3, 4, 5};
		Integer[] resultArray = processor.shuffle(sourceArray);
		
		assertTrue(arrayUtils.isArraysHasSameElements(sourceArray, resultArray));
	}
}
