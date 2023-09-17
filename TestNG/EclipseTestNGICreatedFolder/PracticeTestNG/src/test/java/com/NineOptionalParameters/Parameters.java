package com.NineOptionalParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

@Test
public class Parameters {
	
	WebDriver driver;
	
  @BeforeTest
  public void BeforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://thedemosite.co.uk/login.php");
	  
	  driver.manage().window().maximize();
  }
  
  @Parameters({"username", "password"})
  public void Test(String username, String password) {
	  
	  driver.findElement(By.xpath("//input[@name = 'username']"));
	  
	  driver.findElement(By.xpath("//input[@name = 'password'"));
	  
	  driver.findElement(By.xpath("input[@name = 'FormsButton2'")).click();
	  
  }
  
  /*
  @AfterTest
  public void AfterTest() throws InterruptedException {
	  Thread.sleep(3000);
	  //driver.close();
  }
  */
}
