package bludau.study.algorithms.impl.math;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bludau.study.algorithms.api.math.GreatestCommonDivisor;
import bludau.study.algorithms.api.math.qualifier.EuclidGreatestCommonDivisorQualifier;
import bludau.study.algorithms.config.SpringConfig;

/**
 * A test class for the {@link EuclidGreatestCommonDivisorImpl}.
 * 
 * @author Anatol Bludau
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class EuclidGreatestCommonDivisorImplTest {

	/**
	 * The Euclid's greatest common divisor algorithm implementation for
	 * testing.
	 */
	@Autowired
	@EuclidGreatestCommonDivisorQualifier
	private GreatestCommonDivisor gcdFinder;
}
