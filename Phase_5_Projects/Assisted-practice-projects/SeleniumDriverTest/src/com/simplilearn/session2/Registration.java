package com.simplilearn.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips-phase-5\\chromedriver.exe");
		
		//Step 2: create Instance of Chrome Driver
		WebDriver driver= new ChromeDriver();
		
		//Step 3: load the base URL which you want to test
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx?pid=OUDM&nexturl=https://education.oracle.com/registration");
		
		WebElement ele = driver.findElement(By.name("sView1:r1:0:email"));
		ele.sendKeys("Ravi@gmail.com");

		driver.findElement(By.name("sView1:r1:0:password")).sendKeys("123456");
		driver.findElement(By.name("sView1:r1:0:retypePassword")).sendKeys("Bangalore");
		driver.findElement(By.name("sView1:r1:0:retypePassword")).sendKeys("Bangalore");
		Select s= new Select(ele);
		

	}

}
