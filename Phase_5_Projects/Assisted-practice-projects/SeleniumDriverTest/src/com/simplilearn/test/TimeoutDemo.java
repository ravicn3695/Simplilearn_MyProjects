package com.simplilearn.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1: set driver property
				System.setProperty("webdriver.chrome.driver", "E:\\\\Eclips-phase-5\\\\chromedriver.exe");
				
				//Step 2: create Instance of Chrome Driver
				WebDriver driver= new ChromeDriver();
				
				//Step 3: load the base URL which you want to test
				driver.get("https://www.facebook.com/");
				
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
				driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
				
				driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);


	}

}
