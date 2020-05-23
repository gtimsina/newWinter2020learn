package tfCRMTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	public static void main(String[] args) {
		LaunchBrowser();
		//LoginTest1();
		//teardown();
		
	}

	public static void LaunchBrowser() {
	// seeting the properties for chrome driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\timsi\\Winter2020\\MavenProject\\Drivers\\chromedriver.exe");
	// Creating web driver object
	WebDriver driver=new ChromeDriver();
	// maximizing window
	driver.manage().window().maximize();
	// go to link
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	// Identifying the username box and passing user name and password
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	// Identifying the login bottom and click
	driver.findElement(By.name("login")).click();

	// to stop for second
	// to close the browser
	driver.close();
	
	

}
}




