package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;

public Homepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void verifytext() {
	String ecpT =  "Enter Time-Track";
	String actT = text.getText();
	if(actT.equals(ecpT)) {
		System.out.println("TEST CASE IS PASS");
	}
	else {
		System.out.println("TEST CASE IS FAIL");
	}
}













}
