package com.simplilearn.session2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips-phase-5\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
	     driver.get("https://www.google.co.in/");
	        
	        WebElement element= driver.findElement(By.name("q"));
	        Actions builder= new Actions(driver);
	        
	        Action myAction= builder.moveToElement(element)
	                .click()
	                .keyDown(element,Keys.SHIFT)
	                .sendKeys(element,"R")
	                .keyUp(element,Keys.SHIFT)
	                .doubleClick()
	                .contextClick()
	                .build();
	        myAction.perform();
	        
	        //driver.close();
	        
	        
	        
	    }

	

}
