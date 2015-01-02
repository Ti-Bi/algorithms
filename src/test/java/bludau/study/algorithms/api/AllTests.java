package bludau.study.algorithms.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import bludau.study.algorithms.api.shuffle.ShuffleProcessorKnuthImplTest;
import bludau.study.algorithms.api.util.ArrayElementUtilsImplTest;

@RunWith(Suite.class)
@SuiteClasses({ShuffleProcessorKnuthImplTest.class, ArrayElementUtilsImplTest.class })
public class AllTests {

}
