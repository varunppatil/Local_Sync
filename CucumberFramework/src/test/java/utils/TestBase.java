package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	public WebDriver driver;
	public WebDriver WebDriverManager()
	 {
		Properties prop = new Properties();
	//	File file = new File(System.getProperty("user.dir")+ "src//test//resources//global.properties");
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\global.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String url = prop.getProperty("QAUrl");
		
		String maven_browser= System.getProperty("browser");
		String prop_browser= prop.getProperty("browser");
		
		String browser = maven_browser!=null ? maven_browser : prop_browser;
		
		if(driver==null) {
			if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
			}
			if(browser.equalsIgnoreCase("edge")){
				//edge code
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "\\src\\test\\resources\\msedgedriver.exe");		
				driver = new EdgeDriver();
				
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		}
		return driver;
		}
}
