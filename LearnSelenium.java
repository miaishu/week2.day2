package selenium.week2d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {
	
	public static void main(String[] args) {
		//TO setup the browser
		WebDriverManager.chromedriver().setup();
		
		//To launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//To maximise the browser
		driver.manage().window().maximize();
		
		//To get title
		driver.get("http://leaftaps.com/opentaps/");
		
		//To enter username
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		
		userName.sendKeys("DemoSalesManager");
		
		//To enter password
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//TO click on login button
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//To click on CRMSFA link
		driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
		
		//To close the browser
		
		//driver.close();
		
		//to click on Leads
		driver.findElement(By.xpath("//a[contains (text(),'Leads')]")).click();
		
		//to click on create lead
		driver.findElement(By.xpath("//a[contains (text(),'Create Lead')]")).click();
		
		//to ENter Company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Emerson");
		
		//To Enter First name
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ish");
		
		//To Enter Last NAme
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Prasi");
		
		//To click create lead
		
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
	}

}
