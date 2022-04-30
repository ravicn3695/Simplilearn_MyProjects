package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin_test10 {
	static {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips-phase-5\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		/*driver.findElement(By.cssSelector("input[type='text']")).sendKeys("9110857538");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("venki@28");
		driver.findElement(By.cssSelector("button[value='1']")).click();*/
		//driver.findElement(By.cssSelector("//*[@id=\"mount_0_0_00\"]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[5]/span/div/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9110857538");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("venki@28");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")).submit();
		//driver.findElement(By.cssSelector("#loginbutton")).submit();
		//driver.findElement(By.name("login")).submit();
		
		
	}

}