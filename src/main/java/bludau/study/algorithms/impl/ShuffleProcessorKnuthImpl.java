package bludau.study.algorithms.impl;

import java.util.Comparator;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.shuffle.ShuffleProcessor;
import bludau.study.algorithms.api.shuffle.qualifier.Knuth;

@Component
@Knuth
public class ShuffleProcessorKnuthImpl implements ShuffleProcessor {

	public <T> Comparable<T>[] shuffle(Comparable<T>[] inputArray) {
		if (ArrayUtils.isEmpty(inputArray)){
			return inputArray;
		}
		
		// Cloning array to provide mutation of input one.
		Comparable<T>[] resultArray = ArrayUtils.clone(inputArray);
		
		Random rand = new Random();
		for (int i = 0; i <= resultArray.length; i++){
			int insertIndex = rand.nextInt(i+1);
			
		}
		
		return null;
	}

	public <T> Comparable<T>[] shuffle(T[] inputArray, Comparator<T> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

}
