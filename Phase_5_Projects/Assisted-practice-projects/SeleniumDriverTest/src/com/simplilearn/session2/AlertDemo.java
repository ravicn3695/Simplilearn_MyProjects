package com.simplilearn.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "E:\\Eclips-phase-5\\chromedriver.exe");
		
		//Step 2: create Instance of Chrome Driver
		WebDriver driver= new ChromeDriver();
		
		 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	        
//       WebElement name = driver.findElement(By.name("alertbox"));
//       name.click();
//       
//       System.out.println("Message: "+driver.switchTo().alert().getText());
//       driver.switchTo().alert().accept();
       
//       WebElement name = driver.findElement(By.name("confirmalertbox"));
//       name.click();
//       
//       System.out.println("Message: "+driver.switchTo().alert().getText());
//       driver.switchTo().alert().accept();
       
//       name.click();
//       driver.switchTo().alert().dismiss();
       
       WebElement prompt= driver.findElement(By.name("promptalertbox1234"));
       prompt.click();
       driver.switchTo().alert().sendKeys("No");
       System.out.println("Message: "+driver.switchTo().alert().getText());
       
      driver.switchTo().alert().accept();
       
   }

	

}
