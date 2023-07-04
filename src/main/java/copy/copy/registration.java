package copy.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class registration {
	
public  WebDriver driver; // Initialize the Webdriver which can be accessible throughout the class
	
	
	@Test(priority=1)
	
public void setup() { // Method 1
		
		System.setProperty("webdriver.chrome.silentOutput", "true");  // remove chrome driver error
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS); // Implicit Wait

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart");

		System.out.println("My Websie Launched Successfuly");
	
	}
	
		
	 @Test(priority=2, invocationCount=1, dependsOnMethods="setup")
	    public void registration() {
		
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	
	driver.findElement(By.linkText("Register")).click();
	
	  JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("window.scrollBy(0,400)");   // scroll down
		
	    driver.findElement(By.id("input-firstname")).sendKeys("amit");
	    driver.findElement(By.id("input-lastname")).sendKeys("jadhav");
	    driver.findElement(By.id("input-email")).sendKeys("amitjadhav1234@gmail.com");
	    driver.findElement(By.id("input-telephone")).sendKeys("7778467642");
	    driver.findElement(By.id("input-password")).sendKeys("india1947");
	    driver.findElement(By.id("input-confirm")).sendKeys("india1947");
	    driver.findElement(By.name("newsletter")).click();  
	
	

   }
}

