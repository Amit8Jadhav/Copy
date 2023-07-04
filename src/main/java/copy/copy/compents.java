package copy.copy;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class compents {
	
	public  WebDriver driver; // Initialize the Webdriver which can be accessible throughout the class
	
	@Test(priority=1)
public void setup() { // Method 1
		 
		System.setProperty("webdriver.chrome.silentOutput", "true");  // remove chrome driver error
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit Wait

		   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart");

		System.out.println("My Websie Launched Successfuly");
	
	}
	 
	@Test(priority=2, invocationCount=1, dependsOnMethods="setup")
    public void compent() {
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[1]/h4/a")).click();
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		
		
	}
	
	}
	
	