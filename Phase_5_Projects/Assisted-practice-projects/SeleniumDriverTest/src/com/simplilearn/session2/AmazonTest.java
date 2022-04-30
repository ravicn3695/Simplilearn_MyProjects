package com.simplilearn.session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Eclips-phase-5\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		WebElement mail = driver.findElement(By.id("ap_email"));
		mail.sendKeys("9964942996");
		mail.submit();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("8971*ravi");
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("samsung");
		searchbox.submit();
		driver.findElement(By.linkText("Apple iPhone 13 (512GB) - Starlight")).click();
		driver.findElement(By.id("nav-cart-count-container")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='submit.add-to-cart']")).click();
		driver.findElement(By.id("nav-cart-count-container")).click();

	}


}
