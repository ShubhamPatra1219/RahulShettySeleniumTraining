package practictice.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Chrome Drivers\\91.0.4472.101\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.get("www.google.co.in");
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/drivers/msedgedriver.exe");
	}

}
