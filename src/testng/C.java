package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class C {
@Test
public void m4() {
	Reporter.log("hi",true);
	Assert.fail();
}
@Test
public void cay() {
	Reporter.log("hi",true);
	
}
@Test
public void bat() {
	Reporter.log("hello",true);
}
@Test
public void man() {
	Reporter.log("hi i am prashant",true);
	Assert.fail();
}
}
