package org.definitylabs.flue2ent.demo;

import org.definitylabs.flue2ent.Website;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractWebsiteTest {

    private static WebDriver driver;
    protected static Website website;

    @BeforeClass
    public static void beforeAll() {
        driver = new ChromeDriver();
        website = Website.with(driver).visit("http://definitylabs.org");
    }

    @AfterClass
    public static void afterAll() {
//        driver.close();
    }

}
