import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String uname = "s3";
		String pwd = "s3";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://10.1.110.49/");
		
		//Static dropdown with Select Tag
		
		WebElement Languagedropdown = driver.findElement(By.id("sel1"));
		Select dropdown =new Select(Languagedropdown);
		dropdown.selectByIndex(0);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		//driver.findElement(By.cssSelector("span.mat-checkbox-label")).click();
		driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-label')]")).click();//Regular expression Xpath
		driver.findElement(By.className("btn-primary")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.className("pageName")).getText(), "DASHBOARD");
		System.out.println("Logged In");
		driver.findElement(By.id("appSidebarTogglerv")).click();
		driver.findElement(By.xpath("//a[@href='#/staffManagement']")).click();
		driver.findElement(By.id("appSidebarTogglerv")).click();
		driver.findElement(By.xpath("(//i[contains(@class,'icon-wrench icon ng-tns')])[4]")).click();
		
		//Dynamic Dropdown
		
		driver.findElement(By.xpath("//div[text()=' Select Option ']")).click();
		driver.findElement(By.xpath("(//div[@class='dropdown-list'])[1]//li[2]")).click();
		driver.findElement(By.xpath("//div[text()=' Select Device ']")).click();
		driver.findElement(By.xpath("(//div[@class='dropdown-list'])[2]//li[2]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//td/a/i)[2]")).click();
		driver.findElement(By.cssSelector("#reasonAssign-input")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		
		driver.findElement(By.id("appSidebarTogglerv")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']")).getText());
		System.out.println("Logged Out");
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Login']")).getText(), "Login");
		driver.quit();
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
