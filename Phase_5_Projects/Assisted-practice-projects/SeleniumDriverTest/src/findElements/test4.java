package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("seleni");
		Thread.sleep(2000);
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@role='presentation']"));
		int count = ele1.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			String ele2 = ele1.get(i).getText();
			System.out.println(ele2);
		}
		
		
		driver.close();
		
		
	}

}
