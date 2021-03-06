package QA.week2.homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestAutoQALogin {

    WebDriver driver;
    AutoQALogin objLogin;
    AutoQAHomePage objHomePage;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://autoqa.pp.ua/wp-login.php");
    }

    /**
     * This test case will login in http://autoqa.pp.ua/wp-login.php
     * Login to application
     * Verify the home page using Dashboard message
     */
    @Test(priority=0)
    public void test_Home_Page_Appear_Correct(){
        //Create Login Page object
        objLogin = new AutoQALogin(driver);
        //login to application
        objLogin.loginToAutoQA("subscriber", "subscriberpass");
        // go the next page
        objHomePage = new AutoQAHomePage(driver);
        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageDashboardName().toLowerCase().contains("profile"));
    }

}