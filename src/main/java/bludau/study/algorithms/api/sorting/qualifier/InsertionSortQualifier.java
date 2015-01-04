package bludau.study.algorithms.api.sorting.qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Qualifier annotation for insertion sort.
 * 
 * @author Anatol Bludau
 *
 */
@Qualifier("bludau.study.algorithms.api.sorting.qualifier.InsertionSortQualifier")
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD })
public @interface InsertionSortQualifier {

}
