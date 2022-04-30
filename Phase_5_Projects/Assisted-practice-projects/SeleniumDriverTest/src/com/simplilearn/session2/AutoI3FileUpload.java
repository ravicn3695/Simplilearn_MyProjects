package com.simplilearn.session2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoI3FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips-phase-5\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
driver.get("https://www.shine.com/registration/");
        
        WebElement name = driver.findElement(By.id("id_name"));
        name.sendKeys("Ravi");
        
        WebElement upload = driver.findElement(By.id("id_file"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", upload);
        
        Thread.sleep(5000);
        
        Runtime.getRuntime().exec("E:\\Eclips-phase-5\\file.exe");
        // here you need to add your exe file location
	}


}
