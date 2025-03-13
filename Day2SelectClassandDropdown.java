package week2.basiclocatorshomeassgn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2SelectClassandDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("JananiSubramani-3");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		 WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		 Select owner=new Select(Ownership);
		 owner.selectByVisibleText("S-Corporation");
		 
		 WebElement Source = driver.findElement(By.id("dataSourceId"));
		 Select sourceid=new Select(Source);
		 sourceid.selectByValue("LEAD_EMPLOYEE");
		 
		 WebElement MarketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		 //instantiate my select class
		 Select market=new Select(MarketingCampaign);
		 market.selectByIndex(6);
		 
		 WebElement StateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
		 Select state=new Select(StateProvince);
		 state.selectByValue("TX");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 String title = driver.getTitle(); 
		 
			System.out.println("Page Title is:"+title);
			
		driver.quit();
	}

}
