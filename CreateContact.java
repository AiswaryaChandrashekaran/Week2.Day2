package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create Contact")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("firstNameField")).sendKeys("Siva");
		driver.findElement(By.id("lastNameField")).sendKeys("Devaraj");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Siv");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Dev");
		
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT Dept");
		driver.findElement(By.id("createContactForm_description")).sendKeys("He is an IT professional");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sivadeva@gmail.com");
		
		WebElement state= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select se= new Select(state);
		se.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important data of Siva");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title= driver.getTitle();
		System.out.println("Current Page title is " + title);		
		
	}

	
}
