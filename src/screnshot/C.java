package screnshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class C {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	// to take screenshot
	TakesScreenshot ts=(TakesScreenshot) driver;
	File sre = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\VK Photography\\Desktop\\17sept\\google.jpg");
	Files.copy(sre, dest);
	
	
	
	
	
	
	
	
}
}
