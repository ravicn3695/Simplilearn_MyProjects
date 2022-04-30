package drop_down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/OneDrive/Desktop/html/section-2/sel.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("kabab manner"));
		Select s= new Select(ele);
		
		//select by index
		s.selectByIndex(0);
		//s.deselectByIndex(0);
		Thread.sleep(2000);
		
		//select by value
		s.selectByValue("333");
		//s.deselectByValue("333");
		Thread.sleep(2000);
		
		s.selectByIndex(1);
		
		
		//select by visible text
		s.selectByVisibleText("chicken 65");
		Thread.sleep(2000);
		s.deselectByVisibleText("chicken 65");
		Thread.sleep(2000);
		s.deselectAll();

	}

}
