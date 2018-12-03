package com.adj_junit_02.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.adj_junit_02.model.Item;

public class itemTest extends Item {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetItemID() {
		assertTrue(true);
	}
	
	@Test
	public void testGetItemDescription() {
		assertTrue(true);
	}

	@Test
	public void testGetItemQuantity() {
		assertTrue(true);
	}
}
