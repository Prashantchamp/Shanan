package screnshot;

import java.io.File;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class B {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/VK%20Photography/Downloads/table.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// to take screenshot
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File srs=new File("C:\\Users\\VK Photography\\Desktop\\17sept\\New folder\\html.jpg");
	Files.copy(src, srs);
	
	
	
	
	
	
	
	
	
	
}
}
