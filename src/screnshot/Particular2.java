package screnshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular2 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	// to take particular screenshot
	WebElement se = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']"));
	File src = se.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\VK Photography\\Desktop\\17sept\\New folder\\seleniumparticular.jpg");
	Files.copy(src, dest);
	
	
	
	
}
}
