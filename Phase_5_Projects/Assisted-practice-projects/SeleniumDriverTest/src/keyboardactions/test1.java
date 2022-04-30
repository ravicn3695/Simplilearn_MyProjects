package keyboardactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ALT);
		a.keyPress(KeyEvent.VK_SPACE);
		a.keyPress(KeyEvent.VK_X);
		a.keyRelease(KeyEvent.VK_ALT);
		a.keyRelease(KeyEvent.VK_SPACE);
		a.keyRelease(KeyEvent.VK_X);
	}
}