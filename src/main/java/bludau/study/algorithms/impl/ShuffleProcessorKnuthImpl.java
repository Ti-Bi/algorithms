package bludau.study.algorithms.impl;

import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.shuffle.ShuffleProcessor;
import bludau.study.algorithms.api.shuffle.qualifier.Knuth;
import bludau.study.algorithms.api.util.ArrayElementUtils;

@Component
@Knuth
public class ShuffleProcessorKnuthImpl implements ShuffleProcessor {

	@Autowired
	private ArrayElementUtils arrayUtils;

	public <T> T[] shuffle(T[] inputArray) {
		if (isReturnWithoutShuffling(inputArray)) {
			return inputArray;
		}

		// Cloning array to provide mutation of input one.
		return shuffleArray(inputArray);
	}

	@Override
	public <T> T[] cloneAndShuffle(T[] inputArray) {
		if (isReturnWithoutShuffling(inputArray)){
			return inputArray;
		}

		// Cloning array to provide mutation of input one.
		T[] resultArray = ArrayUtils.clone(inputArray);
		return shuffleArray(resultArray);
	}
	
	/**
	 * Check if it's possible return same array without processing.
	 * The possible cases when it's possible to return the same array are following:
	 * <ul>
	 * <header>test</header>
	 * <li>the array is <code>null</code></li>
	 * <li>the array is empty</li>
	 * <li> the array length is one</li>
	 * </ul>
	 * @param inputArray
	 * @return
	 */
	private <T> boolean isReturnWithoutShuffling(T[] inputArray){
		return ArrayUtils.isEmpty(inputArray) || inputArray.length == 1;
	}

	private <T> T[] shuffleArray(T[] inputArray) {
		Random rand = new Random();
		for (int i = 0; i < inputArray.length; i++) {
			int insertIndex = rand.nextInt(i + 1);
			arrayUtils.swap(inputArray, i, insertIndex);
		}

		return inputArray;
	}

}
