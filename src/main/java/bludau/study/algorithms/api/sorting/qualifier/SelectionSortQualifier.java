package bludau.study.algorithms.api.sorting.qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Qualifier annotation for the selection sort.
 * 
 * @author Anatol Bludau
 *
 */
@Qualifier("bludau.study.algorithms.api.sorting.qualifier.SelectionSortQualifier")
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface SelectionSortQualifier {

}
