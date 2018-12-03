package com.adj_junit_02.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.adj_junit_02.model.Item;
import com.adj_junit_02.dao.*;

public class itemDAOItest {
	private ItemDAO itemDAOActual = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		itemDAOActual = new ItemDAO();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert() {
		Item item = new Item();
		itemDAOActual.insert(item.getItemId());
		assertTrue(true);
	}

	@Test
	public void testDelete() {
		
		assertTrue(true);
	}

	@Test
	public void testUpdate() {
		assertTrue(true);
	}
	


}
