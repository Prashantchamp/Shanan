package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
@Test
public void m1() {
	Reporter.log("hi",true);
	Assert.fail();
	
}
@Test
public void m2() {
	Reporter.log("HEELO");
	
}
@Test
public void m3() {
	Reporter.log("hi prashant");
}
}
