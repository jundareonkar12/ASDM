package selinium.test;

import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dac\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.google.com";
		String exptitile="Google";
		String actualtile="";
		driver.get(url);

		driver.findElement(ByName.name("q")).sendKeys("Cdac acts");
		driver.findElement(ByName.name("btnK")).submit();
		
	}

}
