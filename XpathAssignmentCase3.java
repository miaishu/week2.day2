package selenium.week2d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAssignmentCase3 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.manage().window().maximize();
	
	//Enter email 
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	
	//Enter Password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
	
	//CLick Login
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	//Get the title of the page and print
	
	driver.findElement(By.xpath("/html/body/div/div[2]/h1"));
	
	System.out.println(driver.getTitle());
	
	//click logout
	driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	//close the browser
	driver.close();
	
	
	
	
}
}
