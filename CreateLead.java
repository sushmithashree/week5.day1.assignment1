package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends Baseclass{
	@Test
	
	public void createLead() {
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sushmitha");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("3/01/1998");
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0422");
	driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("24");
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9457861236");
	driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Jun");
	
	driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sanha");
	driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Theju");
	
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("123,TVK road");
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Ram nagar");
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Bremen");
	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("640037");
	driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("05");
	driver.findElement(By.name("submitButton")).click();

}
}
