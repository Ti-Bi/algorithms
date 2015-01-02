package bludau.study.algorithms.impl;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import bludau.study.algorithms.api.ShuffleProcessor;
import bludau.study.algorithms.api.qualifier.Knuth;

@Component
@Knuth
public class ShuffleProcessorKnuthImpl implements ShuffleProcessor {

	public <T> void shuffle(Comparable<T>[] inputArray) {

	}

	public <T> void shuffle(T[] inputArray, Comparator<T> comparator) {
		// TODO Auto-generated method stub

	}

}
