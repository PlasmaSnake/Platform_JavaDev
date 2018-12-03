package com.adj_junit_02.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		itemDAOItest.class,
		itemTest.class
})
public class testRunner {
	
	public static void main(String[] args) {
		
	}
}
