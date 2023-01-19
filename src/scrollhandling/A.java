package scrollhandling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	// to scroll down 
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-3000);");
	
	
	
	
	
	
	
}
}
