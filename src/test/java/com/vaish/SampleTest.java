package com.vaish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	public WebDriver driver;
	@Test
public void s5Test() {
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.com/");
				System.out.println("==========");
				System.out.println("===========");
	
	}
}