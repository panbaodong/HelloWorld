package org.pan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWordTest {
	@Test
	public void testHello(){
		HelloWord hw = new HelloWord();
		String result = hw.sayHello("pan");
		assertEquals("hello pan",result);
	}

}
