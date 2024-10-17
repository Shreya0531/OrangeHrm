package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    By userNameTxt = By.xpath("//input[@placeholder='Username']");
    By passwordTxt = By.xpath("//input[@placeholder='Password']");
    By loginBtn = By.xpath("//button[normalize-space()='Login']");

    //Action methods
    public void setUserName(String user) {
        driver.findElement(userNameTxt).sendKeys(user);
    }
    public void setPassword(String pass) {
        driver.findElement(passwordTxt).sendKeys(pass);
    }
    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }
    public void performLogin(String username, String password) {
        setUserName(username);
        setPassword(password);
        clickLoginBtn();

    }
}
