package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/OneDrive/Desktop/html/aa.html");
		
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.id("a2")).click();
		driver.findElement(By.name("email")).sendKeys("9110857538");
		driver.findElement(By.name("pass")).sendKeys("venki@28");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.className("qvi66sw1b")).click();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		//driver.close();

	}

}
