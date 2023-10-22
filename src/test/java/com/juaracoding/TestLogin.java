package com.juaracoding;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.page.LoginPage;
import com.juaracoding.utils.Constant;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    DriverSingleton.closeObjectInstance();
    }

    @Given("User enter url web shop demo")
    public void user_enter_url_web_shop_demo(){
    driver.get(Constant.URL);
    }


    @When("User click my account")
    public void user_click_my_account(){
//        DriverSingleton.notice();
        DriverSingleton.scroll();
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


    //Invalid login (password null)
    @Given("User logout")
    public void user_logout(){
        loginPage.btnLogout();
    }
    @Then("User get text tittle error")
    public void user_get_text_tittle_error(){
        Assert.assertEquals(loginPage.txtPassNull(),"Error:");
    }

    @Given("User delete username")
    public void user_delete_username(){
        loginPage.clearUsername();
    }

    @And("User delete password")
    public void user_delete_password(){
        loginPage.clearUsername();
    }








}
