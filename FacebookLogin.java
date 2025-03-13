package week2.basiclocatorshomeassgn;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//loadurl
		
		driver.get("https://www.facebook.com/");
		
		//maximize page
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//btnLogin
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		String title = driver.getTitle(); 
		 System.out.println("Page Title is:"+title);
		

	
	}

}
