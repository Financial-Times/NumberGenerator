package com.yusuf;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AppTest extends TestCase {

	
	public void testLengthOfTheUniqueKey() {
		App obj = new App();
		Assert.assertEquals(36,obj.generateUniqueKey().length());
	}
}
