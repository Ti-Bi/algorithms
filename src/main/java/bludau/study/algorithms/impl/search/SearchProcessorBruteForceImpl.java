package bludau.study.algorithms.impl.search;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.search.SearchProcessor;
import bludau.study.algorithms.api.search.qualifier.BruteForceSearchQualifier;

/**
 * The implementation of brut force search algorithm.
 * 
 * @author Anatol Bludau
 *
 */
@Component
@BruteForceSearchQualifier
public class SearchProcessorBruteForceImpl implements SearchProcessor {

	@Value("${config.sorting.notfound.index}")
	private int indexNotFoundCode;
	
	/**
	 * {@inheritDoc}
	 * <p>
	 * The brute force implementation of the search.
	 * </p>
	 * 
	 * @throws NullPointerException
	 *             if the input array or element is {@code null}
	 */
	@Override
	public <T> int find(T[] array, T element) {
		Objects.requireNonNull(array);
		Objects.requireNonNull(element);

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(element)){
				return i;
			}
		}
		
		return indexNotFoundCode;
	}
}
