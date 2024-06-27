import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webDriver.chrome.driver",
		// "C:\\Users\\smettu\\Downloads\\SMR\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login(driver);
		driver.findElement(By.xpath("//p[text()='Maintenance Alarms']")).click();
		String maintenancealarmcount = driver.findElement(By.xpath("(//p[@class='count']/b)[6]")).getText();

		System.out.println("No.of Maintenance Alarms=" + maintenancealarmcount);
		if (maintenancealarmcount.contains("0"))
		// if
		// (driver.findElement(By.xpath("(//p[@class='count']/b)[6]")).getText().contains("0"))
		{
			System.out.println("No.of Maintenance Alarms=" + maintenancealarmcount);
			Assert.assertEquals(maintenancealarmcount, "0");

		} else {
			int mt = Integer.parseInt(maintenancealarmcount);
			for (int i = 0; i < mt; i++) {

				driver.findElement(By.xpath("(//textarea[@type='text'])[1]")).sendKeys("test");
				driver.findElement(By.xpath("(//button[text()=' Clear '])[1]")).click();

				// System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']")).getText());
				System.out.println("Maintenance Alarm Cleared");
				Thread.sleep(2000);
				System.out.println("No.of Maintenance Alarms=" + maintenancealarmcount);
			}
		}

		driver.findElement(By.xpath("//p[text()='Beacon Alert']")).click();
		String beaconalerts = driver.findElement(By.xpath("(//p[@class='count']/b)[9]")).getText();

		if (beaconalerts.contains("0")) {
			System.out.println("No.of Mable Alerts=" + beaconalerts);
			Assert.assertEquals(beaconalerts, "0");

		}

		else {
			int ba = Integer.parseInt(beaconalerts);
			for (int i = 0; i < ba; i++) {
				System.out.println("No.of Mable Alerts=" + beaconalerts);
				driver.findElement(By.xpath("(//button[@class='clearbutton'])[1]")).click();
				driver.findElement(By.id("reason-input")).sendKeys("test");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("button[class*='btn-primary']")).click();
				driver.findElement(By.xpath("//button[@class='close']")).click();

				// System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']")).getText());
				System.out.println("Mable Alert Cleared");
			}
		}

		/*
		 * driver.findElement(By.cssSelector("#appSidebarTogglerv")).click();
		 * driver.findElement(By.xpath("//a[@href='#/alarmBoard']")).click();
		 * driver.findElement(By.cssSelector("#appSidebarTogglerv")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//div[@class='mat-tooltip-trigger pageHelp']")).
		 * click(); Thread.sleep(1000);
		 * driver.findElement(By.cssSelector("i[class*='closeIcon']")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//tbody[@role='rowgroup']/mat-row[2]")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.cssSelector("#modal-input")).sendKeys("test");
		 * driver.findElement(By.cssSelector("button[class*='btn-primary'")).click();
		 * System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']"
		 * )).getText()); System.out.println("LABD Alert Cleared");
		 */
		Logout(driver);

	}

	public static void Logout(WebDriver driver) {

		driver.findElement(By.id("appSidebarTogglerv")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println(driver.findElement(By.xpath("//div[@aria-label='Success']")).getText());
		System.out.println("Logged Out");
		driver.quit();
	}

	public static void login(WebDriver driver) {
		driver.get("http://10.1.110.49/");
		driver.findElement(By.name("username")).sendKeys("s4");
		driver.findElement(By.name("password")).sendKeys("s4");
		// driver.findElement(By.cssSelector("span.mat-checkbox-label")).click();
		driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-label')]")).click();// Regular expression
																								// Xpath
		driver.findElement(By.className("btn-primary")).click();

	}
}
