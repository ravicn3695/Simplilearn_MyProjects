package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		WebElement ele1 = driver.findElement(By.id("add"));
		a.doubleClick(ele1).perform();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Alert b = driver.switchTo().alert();
		b.accept();
		//driver.findElement(By.xpath("//span[text()='1']")).click();
		//driver.findElement(By.xpath("//a[text()='Go to Cart']")).click();
		//driver.findElement(By.xpath("//i[@class='fa fa-remove']")).click();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
