package bludau.study.algorithms.api.search;

/**
 * The processor for finding some object in the array.
 * 
 * @author Anatol Bludau
 *
 */
public interface SearchProcessor {

	/**
	 * Find the specified element in the array.
	 * 
	 * @param array
	 *            the array for finding element
	 * @param element
	 *            target element
	 * @return index of target element in array or {@code -1} if it is not found
	 */
	<T> int find(T[] array, T element);
}
