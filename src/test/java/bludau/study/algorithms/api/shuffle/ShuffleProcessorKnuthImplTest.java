package bludau.study.algorithms.api.shuffle;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.api.shuffle.qualifier.Knuth;
import bludau.study.algorithms.config.SpringConfig;
import bludau.study.algorithms.impl.ShuffleProcessorKnuthImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class ShuffleProcessorKnuthImplTest {

	@Autowired
	@Knuth
	ShuffleProcessor processor;

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
		@SuppressWarnings("unchecked")
		Comparable<Integer>[] emptyArray = new Comparable[0];
		assertTrue(processor.shuffle(emptyArray).length == 0);
	}

	@Test
	public void testShuffleComparableOfTArray() {
		// TODO;
	}

	@Test
	public void testShuffleTArrayComparatorOfT() {
		// TODO
	}

}
