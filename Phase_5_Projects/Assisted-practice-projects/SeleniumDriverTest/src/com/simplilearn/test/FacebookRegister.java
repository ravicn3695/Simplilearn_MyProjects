package com.simplilearn.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1: set driver property
		System.setProperty("webdriver.chrome.driver", "E:\\\\Eclips-phase-5\\\\chromedriver.exe");
		
		//Step 2: create Instance of Chrome Driver
		WebDriver driver= new ChromeDriver();
		
		//Step 3: load the base URL which you want to test
		driver.get("https://www.facebook.com/register/");
		//driver.findElement(By.cssSelector("#u_0_j_JB"))
		//driver.findElement(By.cssSelector("//*[@id=\"u_0_j_JB\"]")).sendKeys("Ravi");
		//driver.findElement(By.id("#u_0_j_JB")).sendKeys("Ravi");
		//driver.findElement(By.xpath("//*[@id=\"u_0_i_Dw\"]/div[1]/div")).sendKeys("Ravi");
		driver.findElement(By.name("firstname")).sendKeys("Ravichandra"); 
		driver.findElement(By.name("lastname")).sendKeys("N");
		driver.findElement(By.name("reg_email__")).sendKeys("Bangalore");
		driver.findElement(By.id("password_step_input")).sendKeys("ravi@123");
		
		   List<WebElement> list	=driver.findElements(By.tagName("input"));
		   for(WebElement element:list){
			   
			   System.out.println(element.getAttribute("name"));
		   }

	}

}
