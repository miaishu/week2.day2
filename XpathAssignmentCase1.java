package selenium.week2d2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAssignmentCase1 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ish");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pras");
		
		//Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("2314143434");
		
		//Enterthe password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("xxxxx");
		
		//Handle all the three drop downs
		WebElement dd1= driver.findElement(By.xpath("//select[@id='day']"));
		Select dropdown1= new Select(dd1);
		dropdown1.selectByValue("29");
		WebElement dd2= driver.findElement(By.xpath("//select[@id='month']"));
		Select dropdown2= new Select(dd2);
		dropdown2.selectByValue("6");
		WebElement dd3= driver.findElement(By.xpath("//select[@id='year']"));
		Select dropdown3= new Select(dd3);
		dropdown3.selectByValue("1990");
		
		//Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
