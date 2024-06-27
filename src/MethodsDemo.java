import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void login()
    {
    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://10.1.110.49/");
		driver.findElement(By.name("username")).sendKeys("s4");
		driver.findElement(By.name("password")).sendKeys("s4");
		driver.findElement(By.cssSelector("span.mat-checkbox-label")).click();
		driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-label')]")).click();// Regular expression
																								// Xpath
		driver.findElement(By.className("btn-primary")).click();
		System.out.println("Logged In");
		driver.quit();
    }
    public void logout()
    {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://10.1.110.49/");
		driver.findElement(By.name("username")).sendKeys("s4");
		driver.findElement(By.name("password")).sendKeys("s4");
		driver.findElement(By.cssSelector("span.mat-checkbox-label")).click();
		driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-label')]")).click();// Regular expression
																								// Xpath
		driver.findElement(By.className("btn-primary")).click();
    	driver.findElement(By.id("appSidebarTogglerv")).click();
		driver.findElement(By.linkText("Logout")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']")).getText());
		System.out.println("Logged Out");
		driver.quit();
    }
    }

