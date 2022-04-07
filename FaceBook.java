package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.linkText("Create New Account")).click();
		 
         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aisha");
         
         driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sultan");          
         
         driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Aisha123");
         
         WebElement web1=driver.findElement(By.xpath("//select[@id='day']"));
         Select se=new Select(web1);
         se.selectByVisibleText("30");
         
         WebElement web2=driver.findElement(By.xpath("//select[@id='month']"));
         Select se1=new Select(web2);
         se1.selectByVisibleText("Oct");
         
         WebElement web3=driver.findElement(By.xpath("//select[@id='year']"));
         Select se2=new Select(web3);
         se2.selectByValue("1992");
         
         driver.findElement(By.xpath("//label[contains(text(),'Fema')]")).click();

	}

}
