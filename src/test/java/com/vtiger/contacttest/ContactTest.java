package com.vtiger.contacttest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.crm.generic.baseutility.BaseClass;

public class ContactTest extends BaseClass  {

	@Test(groups="smokeTesting")
	public void createContactWithMandatoryFieldsTest() throws InterruptedException, IOException, ParseException {

//		String browser=System.getProperty("browser",);
//		String url=System.getProperty("url","Vtiger");
		
//		System.out.println(browser);
//		System.out.println(url);
		System.out.println("Testing1");
//		int ran = js.getRandomeNumber();
//		System.out.println("testig");
//
//		String lastName = ex.getDataFromExcel("Sheet1", 1, 2) + ran;
//
//		HomePage hp = new HomePage(driver);
//		ContactPage cp = new ContactPage(driver);
//		ContactDetails cd = new ContactDetails(driver);
//		ContactConfirmationPage pg = new ContactConfirmationPage(driver);
//
//		hp.getContactLink().click();
//
//		cp.getContactIcon().click();
//
//		cd.createContactWithLN(lastName);
//
//		pg.testConfirmation(lastName);

	}

	@Test(groups="regressionTesting")
	public void createContactWithOrgTest() throws IOException, ParseException, InterruptedException {

		System.out.println("testing2");
//		int ran = js.getRandomeNumber();
//
//		String lastName = ex.getDataFromExcel("Sheet1", 1, 2) + ran;
//		String orgName = ex.getDataFromExcel("Sheet1", 1, 3) + ran;
//
//		HomePage hp = new HomePage(driver);
//		ContactPage cp = new ContactPage(driver);
//		ContactDetails cd = new ContactDetails(driver);
//		ContactConfirmationPage pg = new ContactConfirmationPage(driver);
//
//		hp.getContactLink().click();
//
//		cp.getContactIcon().click();
//
//		cd.createContactWithOrganization(lastName, orgName);
//
//		pg.testConfirmation(lastName);

	}
	
	@Test(groups="regressionTesting")
	public void createContactWithDate() throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.out.println("testing3");
//        int ran=js.getRandomeNumber();
//		
//		WebDriverUtility wb=new WebDriverUtility();
//		
//		ExcelUtility ex=new ExcelUtility();
//		String lastName=ex.getDataFromExcel("Sheet1", 1, 2)+ran;
//		String orgName=ex.getDataFromExcel("Sheet1", 1, 3)+ran;
//		String currentDate=js.getCurrentDate();
//		String endDate=js.getSpecifiedDate(35);
//		
//		LoginPage lp=new LoginPage(driver);
//		HomePage hp=new HomePage(driver);
//		ContactPage cp=new ContactPage(driver);
//		ContactDetails cd= new ContactDetails(driver);
//		ContactConfirmationPage pg=new ContactConfirmationPage(driver);
//
//		
//		hp.getContactLink().click();
//		
//		cp.getContactIcon().click();
//		
//		cd.enterDate(lastName, currentDate, endDate);
//		
//		pg.testConfirmation(lastName);
	}

}
