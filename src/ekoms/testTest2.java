package ekoms;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testTest2 {
	
 
  @Test(dataProvider="dataSet")
  public void login2(String ekoms, String username,String password) throws InterruptedException {
    
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
  @DataProvider
  public Object[][] dataSet()
  {
	   //1st Combination username password
	  //2nd username password
	  //3rd username password
	  //Multi-Dimensional Array***
	  Object[][] data= new Object[3][3]; //3rows and 2 columns
	  
	  
	  //1set data
	  data[0][0]="http://10.1.110.49";
	  data[0][1]="s1";//username
	  data[0][2]="s1";//password
	  //2nd set
	  data[1][0]="http://10.1.110.49";
	  data[1][1]="s2";//username
	  data[1][2]="s2";//password
	  //3rd set
	  data[2][0]="http://10.1.110.49";
	  data[2][1]="s3";//username
	  data[2][2]="s2";//password
	  return data;
	 
	  
	  
  }
  
}
