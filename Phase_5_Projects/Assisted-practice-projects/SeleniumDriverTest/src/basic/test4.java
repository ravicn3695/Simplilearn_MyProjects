package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
		String ra = driver.getTitle();
		System.out.println(ra);
		
		String vi = driver.getCurrentUrl();
		System.out.println(vi);
		
		Thread.sleep(2000);
		driver.close();
	}

}
