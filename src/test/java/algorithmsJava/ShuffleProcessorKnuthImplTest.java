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
@ContextConfiguration(classes={SpringConfig.class})
public class ShuffleProcessorKnuthImplTest {
	
	@Autowired
	@Knuth
	ShuffleProcessor processor;
	
	@Test
	public void testShuffleComparableOfArrayInject(){
		assertTrue(processor instanceof ShuffleProcessorKnuthImpl);
	}
	
	@Test
	public void testShuffleComparableOfTArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testShuffleTArrayComparatorOfT() {
		fail("Not yet implemented");
	}

}
