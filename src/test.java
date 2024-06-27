import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Request;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Optional;
public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//WebDriver driver = new ChromeDriver();
		String userDataDir = "C://Users//smettu//AppData//Local//Google//Chrome//User Data";
		 ChromeOptions options = new ChromeOptions();
		// options.addArguments("user-data-dir=" + userDataDir);
		 WebDriver driver =new ChromeDriver(options);

	        //FirefoxDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        
	       
driver.get("https://app.multitone-development.com/#/welcome");
System.out.println(driver.getTitle());
driver.manage().deleteAllCookies();
driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
//driver.findElement(By.id("input")).sendKeys("tharani.venkatesh@multitone.com");
//((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", driver.findElement(By.id("input")), "tharani.venkatesh@multitone.com");
((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", driver.findElement(By.id("input")));

// Simulate human-like typing
String email = "tharani.venkatesh@multitone.com";
for (char c : email.toCharArray()) {
	driver.findElement(By.id("input")).sendKeys(String.valueOf(c));
    Thread.sleep(100); // Adjust sleep time as needed to simulate typing speed
}

String enteredEmail = driver.findElement(By.id("input")).getAttribute("value");
if (!enteredEmail.equals("tharani.venkatesh@multitone.com")) {
    throw new RuntimeException("Email was not entered correctly.");
}
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
Thread.sleep(2000);
//String error= driver.findElement(By.cssSelector("p[class*='MuiTypography-root MuiTypography-p1 css-nt6tld']")).getText();
//System.out.println("Error: "+error);
driver.findElement(By.cssSelector("button[class*='MuiTypography-root ']")).click();
Thread.sleep(2000);
driver.quit();
	}

}
