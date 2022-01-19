package selenium.week2d2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement title=driver.findElement(By.xpath("//a[text()='Go to Home Page']"));
		title.click();
		driver.navigate().back();
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href"));
        WebElement title1=driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
        title1.click();
        System.out.println(driver.getTitle());
        
        if(driver.getTitle().contains("404")) {
        	System.out.println("Its broken");
        }
        else {
        	System.out.println("Its not broken");
        }
        driver.navigate().back();
        
        title.click();
      
        
        
        
        
        
        
        
        
	}
        
		
		
		
	}

