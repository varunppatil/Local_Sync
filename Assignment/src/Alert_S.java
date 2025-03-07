import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Alert_S  {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String url="https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.cssSelector("input[onclick='alertbox();']"));
		boolean verifyElement = element.isDisplayed();
		System.out.println(verifyElement);
		element.click();
		
		//Give a name to alert
		Alert m= driver.switchTo().alert(); 
		
		System.out.println("Alert text is __:" +m.getText());
		Thread.sleep(5000);
		
		//Accept the alert
		m.accept(); 
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@onclick='confirmbox();']"));
		ele2.click();
		boolean alertSwitch = true;
		if(alertSwitch) {
		Alert m2= driver.switchTo().alert();
		//Thread.sleep(5000);
		
		m2.dismiss();
		System.out.println("Dismiss done");		
		}
		
		WebElement promptEle = driver.findElement(By.xpath("//input[@name='prompt']"));
		promptEle.click();
		Thread.sleep(5000);
		Alert prompt=driver.switchTo().alert();
		Thread.sleep(5000);
		prompt.sendKeys("Check");
		prompt.accept();
		
		driver.get("https://demoqa.com/alerts");
		WebElement	ele=driver.findElement(By.xpath("//div[@class='mt-4 row']/div[2]//button[@id='promtButton']"));
		boolean b=ele.isDisplayed();
		System.out.println(b);
		//JavascriptExecutor js = new JavascriptExecutor();
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",ele);
		Alert alr = driver.switchTo().alert();
		
		alr.sendKeys("rose");
		Thread.sleep(5000);
		
		//driver.

	}
	
}
