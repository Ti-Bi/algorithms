package bludau.study.algorithms.api;

import java.util.Comparator;

/**
 * The class represents a processor for shuffling an array.
 * 
 * @author Anatol Bludau
 *
 */
public interface ShuffleProcessor {

	/**
	 * Shuffle an array of objects which implements the {@link Comparable}
	 * interface.
	 * <p>
	 * The original array isn't changed.
	 * </p>
	 * 
	 * @param inputArray
	 *            array for sorting
	 * @return <dl>
	 *         <dt>sorted array</dt>
	 *         <dd></dd>
	 *         <dt>empty array</td>
	 *         <dd>if source array is empty</dd>
	 *         <dt><code>null</code></dt>
	 *         <dd>if source array is null</dd>
	 *         </dl>
	 */
	<T> T[] shuffle(Comparable<T>[] inputArray);

	/**
	 * Shuffle an array of objects with provided comporator.
	 * <p>
	 * The original array isn't changed.
	 * </p>
	 * 
	 * @param inputArray
	 *            array for sorting
	 * @return <dl>
	 *         <dt>sorted array</dt>
	 *         <dd></dd>
	 *         <dt>empty array</td>
	 *         <dd>if source array is empty</dd>
	 *         <dt><code>null</code></dt>
	 *         <dd>if source array is null</dd>
	 *         </dl>
	 */
	<T> T[] shuffle(T[] inputArray, Comparator<T> comparator);
}
