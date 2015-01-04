package bludau.study.algorithms.impl.math;

import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.math.GreatestCommonDivisor;
import bludau.study.algorithms.api.math.qualifier.EuclidGreatestCommonDivisorQualifier;

/**
 * The Euclid's implementation of {@link GreatestCommonDivisor} interface.
 * 
 * @author Anatol Bludau
 *
 */
@Component
@EuclidGreatestCommonDivisorQualifier
public class EuclidGreatestCommonDivisorImpl implements GreatestCommonDivisor {

	/**
	 * {@inheritDoc}
	 * <p>The Euclid's algorithm implementation.</p>
	 */
	@Override
	public int findGCD(int p, int q) {
		if (q == 0){
			return p;
		}
		
		return findGCD(q, p % q);
	}

}
