package com.simplilearn.session2;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips-phase-5\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        JavascriptExecutor executor = (JavascriptExecutor) driver; //switch to one window to another window
        
        executor.executeScript("window.open('https://www.google.co.in','_blank')");
        
       ArrayList<String> list = new ArrayList<String>( driver.getWindowHandles());
       
       driver.switchTo().window(list.get(1));
       Thread.sleep(5000);
       driver.switchTo().window(list.get(0));
    }

	

}
