package bludau.study.algorithms.api.math.qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * The qualifier for the Euclid's find the greatest common divisor algorithm.
 * 
 * @author Anatol Bludau
 *
 */
@Qualifier("bludau.study.algorithms.api.math.EuclidGreatestCommonDivisorQualifier")
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD })
public @interface EuclidGreatestCommonDivisorQualifier {

}
