package com.gelfman.sima.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by sima.gelfman on 8/3/2016.
 */
public class TestBase {

	FirefoxDriver wd;

	public static boolean isAlertPresent( FirefoxDriver wd) {
	    try {
	        wd.switchTo().alert();
	        return true;
	    } catch (NoAlertPresentException e) {
	        return false;
	    }
	}

	@BeforeMethod
	public void setUp() throws Exception {
	    wd = new FirefoxDriver ();
	    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    wd.get("http://localhost/addressbook/");
	    login ( "admin", "secret" );
	}

	private void login ( String userName, String userPassword ) {
	    wd.findElement( By.name("user")).click();
	    wd.findElement(By.name("user")).clear();
	    wd.findElement(By.name("user")).sendKeys( userName );
	    wd.findElement(By.name("pass")).click();
	    wd.findElement(By.name("pass")).clear();
	    wd.findElement(By.name("pass")).sendKeys( userPassword );
	    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
	}

	protected void returnToGroupPage () {
	    wd.findElement( By.linkText("group page")).click();
	}

	protected void subitGroupCreation () {
	    wd.findElement( By.name("submit")).click();
	}

	protected void fellGroupForm ( GroupData groupData ) {
	    wd.findElement( By.name("group_name")).click();
	    wd.findElement(By.name("group_name")).clear();
	    wd.findElement(By.name("group_name")).sendKeys( groupData.getName () );
	    wd.findElement(By.name("group_header")).click();
	    wd.findElement(By.name("group_header")).clear();
	    wd.findElement(By.name("group_header")).sendKeys( groupData.getHeader () );
	    wd.findElement(By.name("group_footer")).click();
	    wd.findElement(By.name("group_footer")).clear();
	    wd.findElement(By.name("group_footer")).sendKeys( groupData.getFooter () );
	}

	protected void initGroupCreation () {
	    wd.findElement( By.name("new")).click();
	}

	protected void goToGrooupPage () {
	    wd.findElement( By.linkText("groups")).click();
	}

	@AfterMethod
	public void tearDown() {
	    wd.quit();
	}

	protected void deleteSelectedGroups () {
	    wd.findElement( By.xpath("//div[@id='content']/form/input[5]")).click();
	}

	protected void selectGroup () {
	    wd.findElement( By.name("selected[]")).click();
	}

	protected void goToHomePage () {
	    wd.findElement( By.linkText("home")).click();
	}

	protected void submitContactCreation () {
	    wd.findElement( By.xpath("//div[@id='content']/form/input[21]")).click();
	}

	protected void feelConatctForm ( String firstName, String middleName, String lastName, String companyName, String address, String homePhone, String mobilePhone, String workPhoen, String email ) {
	    wd.findElement( By.name("firstname")).click();
	    wd.findElement(By.name("firstname")).clear();
	    wd.findElement(By.name("firstname")).sendKeys( firstName );
	    wd.findElement(By.name("middlename")).click();
	    wd.findElement(By.name("middlename")).clear();
	    wd.findElement(By.name("middlename")).sendKeys( middleName );
	    wd.findElement(By.name("lastname")).click();
	    wd.findElement(By.name("lastname")).clear();
	    wd.findElement(By.name("lastname")).sendKeys( lastName );
	    wd.findElement(By.name("company")).click();
	    wd.findElement(By.name("company")).clear();
	    wd.findElement(By.name("company")).sendKeys( companyName );
	    wd.findElement(By.name("address")).click();
	    wd.findElement(By.name("address")).clear();
	    wd.findElement(By.name("address")).sendKeys( address );
	    wd.findElement(By.name("home")).click();
	    wd.findElement(By.name("home")).clear();
	    wd.findElement(By.name("home")).sendKeys( homePhone );
	    wd.findElement(By.name("mobile")).click();
	    wd.findElement(By.name("mobile")).clear();
	    wd.findElement(By.name("mobile")).sendKeys( mobilePhone );
	    wd.findElement(By.name("work")).click();
	    wd.findElement(By.name("work")).clear();
	    wd.findElement(By.name("work")).sendKeys( workPhoen );
	    wd.findElement(By.name("email")).click();
	    wd.findElement(By.name("email")).clear();
	    wd.findElement(By.name("email")).sendKeys( email );
	}

	protected void initContactCreation () {
	    wd.findElement( By.linkText("add new")).click();
	}
}
