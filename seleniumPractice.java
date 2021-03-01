import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/jafry.rahman/Desktop/Drivers");
		
/*
	    WebDriver driver= new ChromeDriver();
	    
	    String url= "https://www.yahoo.com";
	    driver.get(url);
	    */
	    

		
		int X = 7;

		if (X < 0) {
			System.out.println("Number is negative");
		} else if (X < 5) {
			System.out.println("Number is less than 5");
		} else if (5 < X && X < 10) {
			System.out.println("Number is between 5 and 10");
		} else {
			System.out.println("Number is greater than 10");
		}

		//
		
		for (int Y = 1; Y < 11; Y++) {
			System.out.println(Y);
		}
		
		//

		String animal = "Tiger";
		switch (animal) {

		case "Lion":
			System.out.println("The animal is a Lion.");
			break;
		case "Tiger":
			System.out.println("The animal is a Tiger");
			break;
		case "Zebra":
			System.out.println("The animal is a Zebra");
			break;

		}

		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
