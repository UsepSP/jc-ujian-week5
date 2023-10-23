package com.juaracoding;


import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.page.AddProduct;
import com.juaracoding.page.LoginPage;
import com.juaracoding.utils.Constant;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAddProduct {

    private static WebDriver driver;
    private static LoginPage loginPage;
    private static AddProduct addProduct;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance(Constant.Edge);
        driver  =DriverSingleton.getDriver();
        loginPage = new LoginPage();
        addProduct = new AddProduct();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(2);
        DriverSingleton.closeObjectInstance();
    }

    @Given("User login")
    public void user_login(){
        loginPage.loginForm("usep","juaracoding");
    }
    @When("User click demo site")
    public void user_click_demo_site(){
        addProduct.clickDemoSite();
    }
    @And("User select product")
    public void user_select_product(){
        addProduct.clickProduct();
    }
    @And("User select color product")
    public void user_select_color_product(){
        addProduct.selectColor();
    }
    @And("User select size product")
    public void user_select_size_product(){
        addProduct.selectSize();
    }
    @And("User click button add to cart")
    public void user_click_button_add_to_cart(){
        addProduct.addToCart();
    }
    @Then("User get text tittle add to cart")
    public void user_get_text_tittle_add_to_cart(){
//        addProduct.getTxtAddSuccess();
//        Assert.assertEquals(addProduct.getTxtAddSuccess(),"have been added to your cart");
        System.out.println(addProduct.getTxtAddSuccess());
    }
    @Given("User click product")
    public void user_click_product(){
        addProduct.clickTabProduct();
    }

    @When("User select product 2")
    public void user_select_product_2() {
        addProduct.clickProduct2();
    }

    @Given("User click cart")
    public void user_click_cart(){
        addProduct.clickCartView();
    }
    @When("User click proceed to checkout")
    public void user_click_proceed_to_checkout(){
        addProduct.clickProceedCheckout();
    }
    @And("User click alert")
    public void user_click_alert(){
        DriverSingleton.delay(4);
        addProduct.clickTermsConditions();
    }
    @And("User click button place order")
    public void user_click_button_place_order(){
        addProduct.clickBtnPlaceOrder();
    }
    @Then("User get text tittle checkout")
    public void user_get_text_tittle_checkout(){
//        addProduct.getTxtCheckoutSuccess();
        System.out.println(addProduct.getTxtCheckoutSuccess());
    }






}
