package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='firstName'][3]")).sendKeys("Siva");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 Thread.sleep(2000); 
		 
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		 Thread.sleep(2000);
		 String tit= driver.getTitle();
		 System.out.println("Title of page is " + tit);
		 
		 driver.findElement(By.linkText("Edit")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		 driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		 Thread.sleep(2000);
		 
		 WebElement cName= driver.findElement(By.id("viewLead_companyName_sp"));
		 String CompanyName= cName.getText();
		 
		 if (CompanyName.equals("TCS"))
			 System.out.println("Comapany name is updated");
		 else
			 System.out.println("Comapany name is not updated");
		 driver.close();
			 
		 
		  
	
	}

}
