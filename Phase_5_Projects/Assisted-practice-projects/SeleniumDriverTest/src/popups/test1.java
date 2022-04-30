package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	static {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Eclips-phase-5\\\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@name='B2']")).click();
		driver.findElement(By.name("B2")).click();
		
		Alert a = driver.switchTo().alert();//switching to pop-up tab
		System.out.println(a.getText());// to get text
		a.accept();// accept is used to click on ok button
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
