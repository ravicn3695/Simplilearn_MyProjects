package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			WebElement ele = driver.findElement(By.id("username"));
			System.out.println(ele.isDisplayed());
			
			System.out.println(ele.isEnabled());
			
			WebElement ele1 = driver.findElement(By.id("keepLoggedInCheckBox"));
			//ele1.click();
			System.out.println(ele1.isSelected());
			
			
			

	}

}
