package selenium.week2d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAssignmentCase2T1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("car");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("key");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("car");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("key");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Mech");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("NA");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("carkey@gmail.com");
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select State =new Select(dd1);
		State.selectByVisibleText("New York");		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
        driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Impor");
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
       //
        System.out.println(driver.getTitle());
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
