/*
 *   Tutorial one, two, three 
 */

package com.ThirdFirstTestNGTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestICreated {

	@Test
	public void TestGoogle() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String actualTitle = driver.getTitle();
		String expectedTitle = "HYR Tutorials - Google Searchh";
		assertEquals(actualTitle, expectedTitle, "Title is Mismatched");
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void TestApple() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reddit.com/login/?dest=https%3A%2F%2Fwww.reddit.com%2Fsettings");
		driver.findElement(By.id("loginUsername")).sendKeys("HYR Tutorials", Keys.ENTER);
		Thread.sleep(5000);
		
		//Title Assertion
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Reddit";
		assertEquals(actualTitle, expectedTitle, "Title is Mismatched");
		
		//URL Assertion
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.reddit.com/login/?dest=https%3A%2F%2Fwww.reddit.com%2Fsettings";
		assertEquals(actualURL, expectedURL, "URL is mismatched");
		
		/*
		//Text Assertion
		
		String actualText = driver.findElement(By.id("loginUsername")).getAttribute("value");
		String expectedText = "";
		assertEquals(actualText, expectedText, "Text is mismatched");
		
		*/
		
		//Error Message Assertion
		
		String actualErrorMessage = driver.findElement(By.xpath("")]).
	}
	
	
}
