package bludau.study.algorithms.impl.utils;

import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.util.ArrayElementUtils;

@Component
public class ArrayElementUtilsImpl implements ArrayElementUtils {

	@Override
	public <T> T[] swap(T[] array, int firstElementIndex, int secondElementIndex) {
		T temp = array[firstElementIndex];
		array[firstElementIndex] = array[secondElementIndex];
		array[secondElementIndex] = temp;
		
		return array;
	}

}
