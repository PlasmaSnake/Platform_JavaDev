package com.adj_junit_02.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ itemDAOItest.class, itemTest.class, testRunner.class })
public class AllTests {

}
