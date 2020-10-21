package com.org.SeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.Config;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public void sampleScript()
    {
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://www.practiceselenium.com/practice-form.html");
       driver.findElementByName("firstname").sendKeys("padeep");
       driver.findElementByName("lastname").sendKeys("padeep");
       driver.findElementById("submit").click();
       driver.close();
       
       
    }
}
