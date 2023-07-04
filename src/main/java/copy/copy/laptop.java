package copy.copy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class laptop {

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
	
		
	}