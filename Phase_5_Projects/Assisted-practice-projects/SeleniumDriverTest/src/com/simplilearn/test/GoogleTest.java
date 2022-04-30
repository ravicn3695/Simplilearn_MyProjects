package com.simplilearn.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips-phase-5\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		System.out.println("Google Title: "+ driver.getTitle());
				String expected="Google";
				String actual=driver.getTitle();
				
				if(expected.equals(actual))
					System.out.println("Test Passed");
				else
					System.out.println("Test Failed");

	}

}
