package com.example.stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleStepDefs {

    WebDriver driver = ProjectHooks.driver;

    @Given("User launch google page")
    public void user_launch_google_page() {
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getTitle().equals("Google"));

    }

    @Given("User launch facebook page")
    public void userLaunchFacebookPage() {
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
//        System.out.println("facebook page title:"+driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Facebook - Log In or Sign Up"));
    }

}