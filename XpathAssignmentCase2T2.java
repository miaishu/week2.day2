package selenium.week2d2;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAssignmentCase2T2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("777-8765");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//TO capture first lead , insert sleep option before getting the text
		
		Thread.sleep(5000);
		
		//To capture first lead
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		
		System.out.println(leadID);
		
		
		//TO click first resulting ID
		
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String output = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		if(output!=leadID)
		{
			System.out.println("This message confirms the successful deletion");
		}
		else {
			System.out.println("The info is not yet deleted");
		}
		driver.close();
			
		
	}

}
