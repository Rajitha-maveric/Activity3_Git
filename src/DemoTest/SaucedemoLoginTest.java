package DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DemoPage.SaucedemoLoginPage;



public class SaucedemoLoginTest {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajithav\\Documents\\CITI APAC Training\\Cucumber\\CucumberJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SaucedemoLoginPage login=new SaucedemoLoginPage(driver);
		login.Saucedemologin();
		driver.quit();
	}

}

