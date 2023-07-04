package copy.copy;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class club {
	
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


@Test(priority=3, invocationCount=1, dependsOnMethods="setup")

public void Laptop() {
		
		driver.findElement(By.linkText("Laptops & Notebooks")).click();

		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a ")).click();
		
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("window.scrollBy(0,1000)");   // scroll down

		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[1]/h4/a")).click();
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse22.executeScript("window.scrollBy(0,400)");   // scroll down

		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		
		//driver.close();	
	}
	
@Test(priority=4, invocationCount=1, dependsOnMethods="setup")
public void compent() {
	
	driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/a")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[1]/h4/a")).click();
	driver.findElement(By.id("button-cart")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
	
	
}
@Test(priority=5,invocationCount=1,  dependsOnMethods="setup")

public void phones() {
	
	driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a ")).click();	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a ")).click();
	driver.findElement(By.id("button-cart")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
	
}
		
}
