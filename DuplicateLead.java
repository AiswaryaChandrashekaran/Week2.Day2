package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();	
		 driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 Thread.sleep(2000); 
		 
		 WebElement CName =driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		 String CapturedName= CName.getText();
		 System.out.println("Captured Name is " + CapturedName);
		 
		 CName.click();
		 Thread.sleep(2000); 
		 
		 driver.findElement(By.linkText("Duplicate Lead"));
		 Thread.sleep(2000);
		 String Tit= driver.getTitle();
		 
		 if (Tit.equals("Duplicate Lead"))
			 System.out.println("Title is Dupliacte Lead");
		 
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 
		 WebElement DName =driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		 String DuplicateName= DName.getText();
		 System.out.println("Dupliacted Name is " + DuplicateName	);
		 
		 if (DuplicateName.equals(CapturedName))
			 System.out.println("Name is matching");
		 
		 else
			 System.out.println("Name is not matching");
		 
		 driver.close();
			 
			 
			 
		 

	}

}
