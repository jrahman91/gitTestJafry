import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class realEstatePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
	    
	    String url = "https://www.jafryrahmanrealty.com/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    Thread.sleep(1500);
	    
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jafry Rahman");
	    
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("JafryR@Yahoo.com");
	    
	    driver.findElement(By.xpath("//input[@name= 'phone']")).sendKeys("845-489-6634");
	    
	    driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("TESTING TESTING");
	    
	    driver.findElement(By.xpath("//textarea[@id='textarea_comp-klb6lfn5']")).sendKeys("Hello, this is a test by Jafry Rahman");
	    
	    driver.findElement(By.xpath("//button[@data-testid='buttonElement']")).click();

	}

}
