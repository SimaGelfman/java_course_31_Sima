package com.gelfman.sima.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation ( ContactData contactData ) {

        initContactCreation ();
        feelConatctForm ( contactData.getFirstName (), contactData.getMiddleName (), contactData.getLastName (), contactData.getCompanyName (), contactData.getAddress (), contactData.getHomePhone (), contactData.getMobilePhone (), contactData.getWorkPhoen (), contactData.getEmail () );
        submitContactCreation ();
        goToHomePage ();
    }

}
