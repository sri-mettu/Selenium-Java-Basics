import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String uname = "s3";
		String pwd = "s3";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://10.1.110.49/");

		// Static dropdown with Select Tag

		WebElement Languagedropdown = driver.findElement(By.id("sel1"));
		Select dropdown = new Select(Languagedropdown);
		dropdown.selectByIndex(0);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		// driver.findElement(By.cssSelector("span.mat-checkbox-label")).click();
		driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-label')]")).click();// Regular expression
																								// Xpath
		driver.findElement(By.className("btn-primary")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.className("pageName")).getText(), "DASHBOARD");
		System.out.println("Logged In");
		driver.findElement(By.id("appSidebarTogglerv")).click();
		driver.findElement(By.xpath("//a[@href='#/escortManagement']")).click();
		driver.findElement(By.id("appSidebarTogglerv")).click();
		driver.findElement(By.xpath("//button[text()=' CREATE NEW ESCORT ']")).click();
		driver.findElement(By.xpath("(//span[@class='dropdown-btn'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class=\"dropdown-list\"])[1]/ul[2]/li[3]")).click();
		driver.findElement(By.xpath("//span[text()='Select escortee']")).click();
		driver.findElement(By.xpath("//div[text()='u 5966']")).click();
		driver.findElement(By.xpath("(//span[@class='dropdown-multiselect__caret'])[2]")).click();
		driver.findElement(By.xpath("//div[text()=' Choose or search area ']")).click();
		driver.findElement(By.xpath("//div[text()='Pragati-Desk']")).click();
		/*
		 * driver.findElement(By.xpath("(//input[@placeholder='Time:'])[1]")).click();
		 * 
		 * //for loop for (int i=0;i<2;i++) {
		 * driver.findElement(By.xpath("//button[@aria-label='Add a hour']")).click(); }
		 * 
		 * //while loop int i=0; while(i<2) {
		 * driver.findElement(By.xpath("//button[@aria-label='Add a minute']")).click();
		 * i++; }
		 * 
		 * driver.findElement(By.
		 * xpath("(//span[contains(@class,'owl-dt-control-content owl-dt-control-button-content')])[1]"
		 * )).click();
		 * //driver.findElement(By.xpath("(//i[@class='icon-calendar'])[1]")).click();
		 * 
		 * 
		 * //System.out.println(driver.findElement(By.xpath(
		 * "(//input[@placeholder='Time:'])[1]")).getText());
		 * 
		 * driver.findElement(By.xpath("(//input[@placeholder='Time:'])[2]")).click();
		 * for (int i1=0;i1<3;i1++) {
		 * driver.findElement(By.xpath("//button[@aria-label='Add a hour']")).click(); }
		 * int i1=0; while (i1<3) {
		 * driver.findElement(By.xpath("//button[@aria-label='Add a hour']")).click();
		 * i1++; } driver.findElement(By.xpath("//span[text()=' Apply ']")).click();
		 * driver.findElement(By.xpath("(//i[@class='icon-calendar'])[2]")).click();
		 * //Thread.sleep(2000); System.out.println(driver.findElement(By.xpath(
		 * "(//input[@placeholder='Time:'])[2]")).getText());
		 */
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Escort Event Created");
		driver.findElement(By.xpath("//button[@class='btn btn-secondary backbutton']")).click();
		driver.findElement(By.xpath("//i[@class='icon-ban icon']")).click();
		driver.findElement(By.id("reason-input")).sendKeys("Test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Escort Event Deleted");

		driver.findElement(By.id("appSidebarTogglerv")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		// System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']")).getText());
		System.out.println("Logged Out");
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Login']")).getText(), "Login");
		driver.quit();

	}

}
