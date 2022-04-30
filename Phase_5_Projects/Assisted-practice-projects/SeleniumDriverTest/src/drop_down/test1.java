package drop_down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("gh-cat"));
		Select s= new Select(ele);
		
		s.selectByValue("14339");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Art");
		Thread.sleep(2000);
		
		s.selectByIndex(4);
		Thread.sleep(2000);
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for (WebElement ele1:options)
		{
			System.out.println(ele1.getText());
			System.out.println(ele1.getLocation());
			//System.out.println(ele1.getAttribute(null));
		}
		driver.close();
		
		

	}

}
