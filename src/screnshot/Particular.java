package screnshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	// to take particular screenshot
	WebElement gl = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	File src = gl.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\VK Photography\\Desktop\\17sept\\New folder\\google.jpg");
	Files.copy(src, dest);
	
	
	
	
	
	
	
	
	
}
}
