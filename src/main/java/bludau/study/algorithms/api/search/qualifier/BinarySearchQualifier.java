package bludau.study.algorithms.api.search.qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * The qualifier for a binary search algorithm implementation.
 * 
 * @author Anatol Bludau
 *
 */
@Qualifier("bludau.study.algorithms.api.search.qualifier.BinarySearchQualifier")
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD })
public @interface BinarySearchQualifier {

}
