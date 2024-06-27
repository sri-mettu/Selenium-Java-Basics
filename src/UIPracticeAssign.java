import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIPracticeAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("testemail@t.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement genderdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(genderdropdown);
		gender.selectByIndex(1);
//System.out.println(gender.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("21/1/1980");
		driver.findElement(By.className("btn-success")).click();
//System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
		System.out.println(
				driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		Thread.sleep(2000);
		driver.quit();

	}

}
