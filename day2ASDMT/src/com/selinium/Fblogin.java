package com.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dac\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.facebook.com";
			String exptitile = "facebook";
			String actualtile = "";
			driver.get(url);
			driver.findElement(ById.id("u_0_m")).sendKeys("Yogesh");
			driver.findElement(ById.id("u_0_o")).sendKeys("Bagendra");
			driver.findElement(ById.id("u_0_r")).sendKeys("bakedac961@mail1.top");
			driver.findElement(ById.id("u_0_w")).sendKeys("Password@12345");
			driver.findElement(ById.id("day")).sendKeys("25");
			driver.findElement(ById.id("month")).sendKeys("May");
			driver.findElement(ById.id("year")).sendKeys("1995");
			driver.findElement(ById.id("u_0_a")).click();
			driver.findElement(ById.id("u_0_13")).click();
			driver.findElement(ById.id("u_0_u")).sendKeys("bakedac961@mail1.top");
			driver.findElement(ById.id("u_0_13")).click();
			driver.findElement(ById.id("checkpointSubmitButton")).click();
			
	}
}
