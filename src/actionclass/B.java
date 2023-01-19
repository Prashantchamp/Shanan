package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement target = driver.findElement(By.xpath("(//a[@class='gb_m'])[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(target).perform();
	act.contextClick(target).perform();
	act.click(target).perform();
	
	
	
	
	
	
	
	
	
	
	
}
}
