package com.example.stepDefinitions;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectHooks {

    public static WebDriver driver;

    @Before
    public void setUp() throws Exception
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();

        if (driver != null) {
            driver.quit();
        }
    }
}
