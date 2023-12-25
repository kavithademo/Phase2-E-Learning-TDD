package com.simplylearn.testng.Tdd;

import org.testng.annotations.Test;

import com.simplylearn.testng.Tdd_Services.TrainingService;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TrainigTest {

	TrainingService training;
   @BeforeTest
	public void setup() {
		training=new TrainingService();
	}
	@AfterTest
	public void cleanUP() {
		if(training!=null)
			training=null;
	}
	@Test
	public void test1() {
		assertNotNull(training);
	}
	@Test
	public void test2() {
		assertTrue(((TrainingService) training).getTrainings().size()==5);
	}
	@Test
	public void test3() {
		assertEquals(((TrainingService) training).getTrainings().size(),5);
	}
}