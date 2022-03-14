package Junit;

import org.junit.Test;

import org.junit.Assert;

public class TestMessage{

	
		@Test 
		public void testSayHello() {
			System.out.println("Hiiiiiii");
			Message m1 = new Message();
			String act=m1.sayHello();
			Assert.assertEquals("Hello", act);
			
	}


//dhjfhfhhjfnfnvfnjfgnj
