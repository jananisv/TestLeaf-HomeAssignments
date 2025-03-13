package week2.basiclocatorshomeassgn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignmentCreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subramani");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software tester");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle(); 
		 
		System.out.println("Page Title is:"+title);
		
		driver.close();	

	}
}
