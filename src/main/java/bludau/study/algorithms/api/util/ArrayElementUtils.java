package bludau.study.algorithms.api.util;

/**
 * Helper for work with array elements.
 * 
 * @author Anatol Bludau
 *
 */
public interface ArrayElementUtils {

	/**
	 * Swap the specified elements in array. This method updates the input
	 * array.
	 * 
	 * @param array
	 *            input array
	 * @param firstElementIndex
	 *            index of the first element to swap
	 * @param secondElementIndex
	 *            index of the last element to swap
	 * @return the input array with swapped elements.
	 * 
	 * @throws <dl>
	 *         <dt>{@link NullPointerException}</dt>
	 *         <dd>if the input array is <code>null</code></dd>
	 *         <dt>{@link IndexOutOfBoundsException}</dt>
	 *         <dd>if the given indexes out of array bounds</dd>
	 *         </dl>
	 */
	<T> T[] swap(T[] array, int firstElementIndex, int secondElementIndex);

	/**
	 * Checks is two arrays has the same document. The method doesn't care about
	 * elements order.
	 * 
	 * @param firstArray
	 *            first array
	 * @param secondArray
	 *            second array
	 * @return <dl>
	 *         <dt><code>true</code></dt>
	 *         <dd>if the arrays has same elements</dd>
	 *         <dt><code>false</code></dt>
	 *         <dd>if the arrays has different elements</dd>
	 *         </dl>
	 *         
	 * @throws <dl>
	 *         <dt>{@link NullPointerException}</dt>
	 *         <dd>if the input array is <code>null</code></dd>
	 *         </dl>
	 */
	<T> boolean isArraysHasSameElements(T[] firstArray, T[] secondArray);
}
