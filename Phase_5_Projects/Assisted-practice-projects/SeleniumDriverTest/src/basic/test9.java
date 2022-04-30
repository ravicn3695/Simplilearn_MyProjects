package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/OneDrive/Desktop/html/aaa.html");
		
		//driver.findElement(By.linkText("Google")).click();
		driver.findElement(By.partialLinkText("Goog")).click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
