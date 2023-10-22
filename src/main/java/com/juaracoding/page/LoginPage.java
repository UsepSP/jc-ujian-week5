package com.juaracoding.page;

import com.juaracoding.driver.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Page Factory
    @FindBy(xpath = "//a[normalize-space()='My Account']")
    private WebElement myAccount;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement btnLogin;

    //add product
    @FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    private WebElement menu;
    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    private WebElement pilih;
    @FindBy(xpath = "//select[@id='pa_color']")
    private WebElement color;
    @FindBy(xpath = "//select[@id='pa_size']")
    private WebElement size;

    //txtDashboardLogin
    @FindBy(xpath = "//h1[@class='page-title']")
    private WebElement txtDashboard;

    @FindBy (xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']//a[contains(text(),'Log out')]")
    private WebElement logout;

    @FindBy (xpath = "//strong[normalize-space()='Error:']")
    private WebElement passNull;

    public void login() {
        username.sendKeys("usep");
        password.sendKeys("juaracoding");
        btnLogin.click();
    }


    // ubah menjadi method parameter
    public void loginForm(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void addProduct() {
        menu.click();
        pilih.click();
        color.click();
        size.click();

    }

     public void clickMyAccount(){
        this.myAccount.click();

     }
    public void inputUsername(String username) {
        this.username.sendKeys(username);
    }

    public void inputPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() {
        this.btnLogin.click();
    }

    public String getTxtDashboard() {
        return txtDashboard.getText();
    }

    public void btnLogout(){
        this.logout.click();
    }

    public String txtPassNull(){
        return passNull.getText();
    }

    public void clearUsername(){
        username.sendKeys(Keys.CONTROL+"a");
        username.sendKeys(Keys.DELETE);
    }

    public void clearPassword(){
        password.sendKeys(Keys.CONTROL+"a");
        password.sendKeys(Keys.DELETE);
    }




}
