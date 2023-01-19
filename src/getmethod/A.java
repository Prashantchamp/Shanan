package getmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	// to maximize webpage
	driver.manage().window().maximize();
	  String s = driver.getCurrentUrl();
	System.out.println(s);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}
