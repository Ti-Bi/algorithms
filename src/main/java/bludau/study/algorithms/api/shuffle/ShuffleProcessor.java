package bludau.study.algorithms.api.shuffle;

/**
 * The class represents a processor for shuffling an array.
 * 
 * @author Anatol Bludau
 *
 */
public interface ShuffleProcessor {

	/**
	 * Shuffle an array of objects.
	 * <p>
	 * The original array is changed.
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
	<T> T[] shuffle(T[] inputArray);

	/**
	 * Creates copy of input array and shuffle that copy.
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
	<T> T[] cloneAndShuffle(T[] inputArray);
}
