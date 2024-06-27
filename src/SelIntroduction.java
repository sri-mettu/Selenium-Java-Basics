import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver -->Methods
		//WebDriver methods + class methods
		
		//Chrome
		//System.setProperty("webDriver.chrome.driver", "C:\\Users\\smettu\\Downloads\\SMR\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox
		//System.setProperty("webDriver.gecko.driver", "C:\\Users\\smettu\\Downloads\\SMR\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge
		//System.setProperty("webDriver.edge.driver", "C:\\Users\\smettu\\Downloads\\SMR\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		driver.get("http://10.1.110.51");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); //closes current window
		//driver.quit(); //closes all the opened windows

	}

}
