package Day1;

import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class first {
	WebDriver driver;
	Actions builder; 
  @Test 
  public void SignIn() throws InterruptedException {
	 // driver.findElement(By.name("q")).sendKeys("Selenium");
//	  builder.moveToElement(target)
	  Thread.sleep(2000);
	  
	  driver.findElement(By.linkText("SignIn")).click();
	  System.out.println("aa");
	  Thread.sleep(2000);
	  driver.findElement(By.name("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  Thread.sleep(2000);
  driver.findElement(By.name("Login")).click();
  Thread.sleep(2000);
  //driver.findElement(By.name("OrderDetails")).click();
  //Thread.sleep(2000);
	  //Assert.assertEquals(ExpectedResult, driver.getTitle());
	  
	//  WebElement contactdetails = driver.findElement(By.xpath("*.//[@id='AboutUs']"));
	  
	  builder = new Actions(driver);
	  //builder.click(contactdetails);
	  builder.build().perform();
	  
	  
	 // driver.findElement(By.name("q")).submit();
  }
  @BeforeClass
  public void beforeMethod() throws InterruptedException {
	  System.out.println("gfhjh");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.12\\Desktop\\Selium 3.0\\chromedriver.exe");
	  driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
//driver.wait(3000);
  }

  @AfterClass
  public void afterMethod() throws InterruptedException {
	  JavascriptExecutor js1 = (JavascriptExecutor)driver;
	  js1.executeScript("alert('welcome to Testme app');", driver.findElement(By.linkText("SignOut")));
	  
	  Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		
  }

}
