package com.flipkart.tests;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LaunchFlipkart {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void openFlipkart() {
		driver.get("https://saviantwebforms-saviantwebforms-stg.azurewebsites.net/");
		System.out.println("Page title "+ driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Online Shopping"));
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null)
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.quit();
	}
}