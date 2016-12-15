package com.github.vitalliuss.helloci;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 * @author vitali_shulha
 */
public class AppTest {

	@Test
	public void testShoudBePassed() {
		Assert.assertTrue(true);
	}

	@Test
	public void testShoudBePassed_2() {
		Assert.assertTrue(true);
	}

	@Ignore("Not implemented yet")
	@Test
	public void testShouldBeSKipped() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void testAnotherMethod() {
		App.doNothing();
	}
	
	@Test
	public void testAnotherClass() {
		EmptyClass.emptyMethod();
	}
}
