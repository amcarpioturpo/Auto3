package com.ui.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
