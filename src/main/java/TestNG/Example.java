package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath;
    public WebDriver driver ;

    @Test
    public void verifyHomepageTitle() {

        System.out.println("launching firefox browser");
        //System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        //  Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
    }
}

