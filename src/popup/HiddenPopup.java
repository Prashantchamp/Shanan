package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	
	
	
	
	
	
	
}
}
