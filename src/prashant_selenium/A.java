package prashant_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver prashant=new ChromeDriver();
	prashant.get("https://www.google.co.in/");
	
}
}
