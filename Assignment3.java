package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://acme-test.uipath.com/login");
		 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		 Thread.sleep(2000); 
		 
		String tit= driver.getTitle();
		System.out.println("Title of the page" + tit);
		Thread.sleep(2000); 
		
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
		
		
		 

	}

}
