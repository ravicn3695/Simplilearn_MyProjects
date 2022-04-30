package com.simplilearn.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1: set driver property
				System.setProperty("webdriver.chrome.driver", "E:\\Eclips-phase-5\\chromedriver.exe");
				
				//Step 2: create Instance of Chrome Driver
				WebDriver driver= new ChromeDriver();
				
				//Step 3: load the base URL which you want to test
				driver.get("https://www.facebook.com/");
				
				//WebElement email= driver.findElement(By.id("email"));
				WebElement email= driver.findElement(By.cssSelector("#email"));
				email.sendKeys("ravichandra@gmail.com");
				WebElement password= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
				//WebElement password= driver.findElement(By.id("pass"));
				password.sendKeys("123456");
				
				WebElement login= driver.findElement(By.name("login"));
				login.submit();
				
				//driver.close();

	}

}
