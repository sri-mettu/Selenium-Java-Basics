package ekoms;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testTest {
	
  @Parameters({"URL","UNAME","PWD"})
  @Test
  public void login(String ekoms,String username,String password) throws InterruptedException {
    
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(ekoms);
	driver.findElement(By.name("username")).sendKeys("s3");
	driver.findElement(By.name("password")).sendKeys("s3");
	//driver.findElement(By.cssSelector("span.mat-checkbox-label")).click();
	driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-label')]")).click();//Regular expression Xpath
	driver.findElement(By.className("btn-primary")).click();
	System.out.println("Logged In");
	Thread.sleep(2000);
	driver.findElement(By.id("appSidebarTogglerv")).click();	
	driver.findElement(By.linkText("Logout")).click();
	//System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']")).getText());
	System.out.println("Logged Out");
	Thread.sleep(2000);
	Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Login']")).getText(), "Login");
	driver.quit();
  }
  
  @Parameters({"URL","UNAME","PWD"})
  @Test
  public void login1(String ekoms,String username,String password) throws InterruptedException {
    
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(ekoms);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	//driver.findElement(By.cssSelector("span.mat-checkbox-label")).click();
	driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-label')]")).click();//Regular expression Xpath
	driver.findElement(By.className("btn-primary")).click();
	System.out.println("Logged In");
	Thread.sleep(2000);
	driver.findElement(By.id("appSidebarTogglerv")).click();	
	driver.findElement(By.linkText("Logout")).click();
	//System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']")).getText());
	System.out.println("Logged Out");
	Thread.sleep(2000);
	Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Login']")).getText(), "Login");
	driver.quit();
  }
  
  
  
}
