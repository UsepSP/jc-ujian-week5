package com.juaracoding.page;

import com.juaracoding.driver.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class AddProduct {

    private WebDriver driver;
    public AddProduct() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    private WebElement demoSite;
    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    private WebElement pilih;
    @FindBy(xpath = "//select[@id='pa_color']")
    private WebElement color;
    @FindBy(xpath = "//select[@id='pa_size']")
    private WebElement size;
    @FindBy (xpath = "//button[normalize-space()='Add to cart']")
    private WebElement btnAddToCart;
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement tabProduct;
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement txtAddSuccess;
    @FindBy(xpath = "//i[@class='icon_bag_alt']")
    private WebElement cartView;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    private WebElement proceedCheckout;
    @FindBy(id= "terms")
    private WebElement termsCondition;
    @FindBy(xpath = "//button[@id='place_order']")
    private WebElement btnPlaceOrder;
    @FindBy(xpath = "//p[@class='woocommerce-thankyou-order-received']")
    private WebElement txtCheckoutSuccess;
    @FindBy (xpath = "//div[@class='noo-product-item one noo-product-sm-4 not_featured post-1201 product type-product status-publish has-post-thumbnail product_cat-dress product_cat-midi-dresses product_tag-dress product_tag-midi product_tag-women has-featured first instock shipping-taxable purchasable product-type-variable']//div[@class='owl-item active']//img[@class='product-one-thumb']")
    private WebElement product2;
    @FindBy(id = "pa_size")
    private WebElement sizeNull;
    @FindBy(id = "pa_color")
    private WebElement colorNull;
    @FindBy(xpath = "//a[@class='reset_variations']")
    private WebElement btnClearVarian;
    public void addProduct() {
        demoSite.click();
        pilih.click();
        color.click();
        size.click();

    }

    public void clickDemoSite(){
        demoSite.click();
    }
    public void clickProduct(){
        pilih.click();

    }
    public void selectColor(){
        color.click();
        color.sendKeys(Keys.ARROW_DOWN);
        color.sendKeys(Keys.ENTER);
    }
    public void selectSize(){
        size.click();
        size.sendKeys(Keys.ARROW_DOWN);
        size.sendKeys(Keys.ENTER);
    }
    public void addToCart(){
        btnAddToCart.click();
    }
    public String getTxtAddSuccess(){
        return txtAddSuccess.getText();
    }
    public void clickTabProduct(){
        this.tabProduct.click();
    }
    public void clickCartView(){
        this.cartView.click();
    }
    public void clickProceedCheckout(){
        this.proceedCheckout.click();
    }
    public void clickTermsConditions(){
        this.termsCondition.click();
    }
    public void clickBtnPlaceOrder(){
        this.btnPlaceOrder.click();
    }
    public String getTxtCheckoutSuccess(){
        return txtCheckoutSuccess.getText();
    }
    public void clickProduct2(){
    this.product2.click();
    }

    public void notice() {
        driver.switchTo().alert().accept();
    }

    public String getTxtColorNull(){
        return colorNull.getText();
    }
    public String getTxtSizeNull(){
        return sizeNull.getText();
    }
    public void clickBtnClearVarian(){
        this.btnClearVarian.click();
    }















}
