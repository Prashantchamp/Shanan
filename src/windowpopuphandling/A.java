package windowpopuphandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F13 (Waterfall Blue, 128 GB)']")).click();
	Set<String> allwindows = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(allwindows);
	String main = al.get(0);
	System.out.println(main);
	Thread.sleep(2000);
	 driver.switchTo().window(al.get(1));
	String child = al.get(1);
	System.out.println(child);
	String win = driver.getTitle();
	System.out.println(win);
}
	
	
	
	
}
