package fileuploadpopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		//FirefoxDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.selenium.dev/downloads/");
		driver1.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver1.findElement(By.xpath("//a[text()='4.1.0']")).click();;
		Robot a = new Robot();
		//a.keyPress(KeyEvent.VK_RIGHT);
		a.keyPress(KeyEvent.VK_ENTER);
		
		//a.keyRelease(KeyEvent.VK_RIGHT);
		a.keyRelease(KeyEvent.VK_ENTER);
		//a.sendKeys("E:\\my doc\\Resume\\Ravi resume-2.pdf");
		Thread.sleep(2000);
		//driver1.close();

	}

}
