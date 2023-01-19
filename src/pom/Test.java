package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK Photography\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/user/submit_tt.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Loginpage l=new Loginpage(driver);
	l.username();
	l.password();
	l.loginBtn();
	
Homepage h=new Homepage(driver);
	h.verifytext();
	
	
	
	
	
	
	
}
}
