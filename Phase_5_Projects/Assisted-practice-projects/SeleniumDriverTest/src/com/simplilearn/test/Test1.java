package com.simplilearn.test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1: set driver property
				System.setProperty("webdriver.chrome.driver", "E:\\\\Eclips-phase-5\\\\chromedriver.exe");
				
				//Step 2: create Instance of Chrome Driver
				WebDriver driver= new ChromeDriver();
				
				//Step 3: load the base URL which you want to test
				driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
				
				WebElement start= driver.findElement(By.xpath("//*[@id=\"start\"]/button"));
				start.click();
				
				Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
						.withTimeout(30,TimeUnit.SECONDS)
						.pollingEvery(5, TimeUnit.SECONDS)
						.ignoring(NoSuchElementException.class);
				
				WebElement ele=wait.until(new Function<WebDriver, WebElement>() {

					@Override
					public WebElement apply(WebDriver t) {
						WebElement finish= driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
						if(finish.getText().equals("Hello World!")) {
							System.out.println("Test Passed");
							return finish;
						}
						else {
							System.out.println("Test Failed");
							return null;
						}
							
					}
				});


	}

}
