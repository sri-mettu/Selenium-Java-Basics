import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String uname = "s3";
		String pwd = "s3";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://10.1.110.49/");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		//driver.findElement(By.cssSelector("span.mat-checkbox-label")).click();
		driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-label')]")).click();//Regular expression Xpath
		driver.findElement(By.className("btn-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#appSidebarTogglerv")).click();
		driver.findElement(By.cssSelector("a[href='#/deviceManagement']")).click();
		driver.findElement(By.cssSelector("#appSidebarTogglerv")).click();
		driver.findElement(By.xpath("//div[text()=' MABLE DEVICES ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-pencil'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='dropdown-multiselect__caret'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@aria-label='multiselect-search'])[1]")).sendKeys("Desk");
		Thread.sleep(2000);
		
		// ****Suggestive Dropdown process
		
		List<WebElement> areas =driver.findElements(By.xpath("//li[@class='multiselect-item-checkbox ng-star-inserted'] //div[@class='ng-star-inserted']"));
		//System.out.println(areas.get(1));
		for (WebElement area :areas)
		{
			if(area.getText().equalsIgnoreCase("Andy-Desk"))
			{
			area.click();
			break;
			}
		}
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("appSidebarTogglerv")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']")).getText());
		System.out.println("Logged Out");
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Login']")).getText(), "Login");
		driver.quit();
		
	}

}
