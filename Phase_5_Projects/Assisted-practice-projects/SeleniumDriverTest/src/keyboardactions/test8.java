package keyboardactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_T);
		a.keyRelease(KeyEvent.VK_CONTROL);
		a.keyRelease(KeyEvent.VK_T);
		
		//Thread.sleep(2000);
		
		a.keyPress(KeyEvent.VK_ALT);
		a.keyPress(KeyEvent.VK_SPACE);
		a.keyPress(KeyEvent.VK_F4);
		
		a.keyRelease(KeyEvent.VK_ALT);
		a.keyRelease(KeyEvent.VK_SPACE);
		a.keyRelease(KeyEvent.VK_F4);
		
		Thread.sleep(2000);

	}

}
