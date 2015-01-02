package algorithmsJava;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.api.ShuffleProcessor;
import bludau.study.algorithms.api.qualifier.Knuth;
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
		processor.shuffle(null);
	}
	
	@Test
	public void testShuffleOfEmpty(){
		
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
