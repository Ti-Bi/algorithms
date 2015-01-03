package bludau.study.algorithms.impl.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.util.ArrayElementUtils;

/**
 * The implementation of the {@link ArrayElementUtils} interface.
 * 
 * @author Anatol Bludau
 *
 */
@Component
public class ArrayElementUtilsImpl implements ArrayElementUtils {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T> T[] swap(T[] array, int firstElementIndex, int secondElementIndex) {
		T temp = array[firstElementIndex];
		array[firstElementIndex] = array[secondElementIndex];
		array[secondElementIndex] = temp;

		return array;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T> boolean isArraysHasSameElements(T[] firstArray, T[] secondArray) {
		if (firstArray.length != secondArray.length) {
			return false;
		}

		List<T> secondList = new ArrayList<>(Arrays.asList(secondArray));
		for (T currentElement : firstArray) {
			if (!secondList.remove(currentElement)) {
				return false;
			}
		}

		return secondList.isEmpty();
	}
}
