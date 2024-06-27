import java.time.Duration;
import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutosuggestDropdown2 {

	
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
			Assert.assertFalse(driver.findElement(By.cssSelector("span[class*='checkbox']")).isSelected());
			//System.out.println(driver.findElement(By.cssSelector("span[class*='checkbox']")).isSelected());
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("span[class*='checkbox']")).click();
			Thread.sleep(2000);
			Assert.assertFalse(driver.findElement(By.cssSelector("span[class*='checkbox']")).isSelected());
			//System.out.println(driver.findElement(By.cssSelector("span[class*='checkbox']")).isSelected());
			
			System.out.println(driver.findElements(By.cssSelector("input[class*='checkbox']")).size());
			//System.out.println(driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-label')]")).isSelected());
			Thread.sleep(2000);
			driver.findElement(By.className("btn-primary")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#appSidebarTogglerv")).click();
			driver.findElement(By.cssSelector("a[href='#/residentManagement']")).click();
			driver.findElement(By.cssSelector("#appSidebarTogglerv")).click();
			driver.findElement(By.xpath("(//i[@class='icon-pencil icon'])[1]")).click();
			driver.findElement(By.cssSelector("span[class='dropdown-multiselect__caret']")).click();
			driver.findElement(By.cssSelector("input[placeholder='Choose country']")).sendKeys("un");
			List<WebElement> countries = driver.findElements(By.xpath("//li[contains(@class,'multiselect-item')]"));

			for (WebElement country : countries) {
				if (country.getText().equalsIgnoreCase("United States")) {
					country.click();
					break;
				}
			}
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			driver.findElement(By.id("appSidebarTogglerv")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Logout")).click();
			driver.quit();
			
			
			

	}

}
