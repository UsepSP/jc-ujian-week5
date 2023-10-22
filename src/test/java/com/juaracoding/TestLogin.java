package com.juaracoding;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.page.LoginPage;
import com.juaracoding.utils.Constant;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance(Constant.CHROME);
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage();
    }

    @AfterAll
    public static void finish(){
    DriverSingleton.delay(3);
    DriverSingleton.closeObjectInstance();
    }

    @Given("User enter url web shop demo")
    public void user_enter_url_web_shop_demo(){
    driver.get(Constant.URL);
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,1000)","");
    }


    @When("User click my account")
    public void user_click_my_account(){
        loginPage.clickMyAccount();
    }

    @And("User input valid username")
    public void user_input_valid_username(){
        loginPage.inputUsername("usep");
    }

    @And("User input valid password")
    public void user_input_valid_password(){
        loginPage.inputPassword("juaracoding");
    }
    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickBtnLogin();
    }

    @And("User get text tittle page dashboard")
    public void user_get_text_tittle_page_dashboard(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"MY ACCOUNT");
    }





}
