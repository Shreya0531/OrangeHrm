package pageObjects.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIM {

    WebDriver driver;

    public PIM(WebDriver driver) {
        this.driver = driver;
    }

    By pimBtn = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']");
    By addEmpBtn = By.linkText("Add Employee");
    By firstNameTxt = By.xpath("//input[@placeholder='First Name']");
    By middleNameTxt = By.xpath("//input[@placeholder='Middle Name']");
    By lastNameBtn = By.xpath("//input[@placeholder='Last Name']");
    By saveBtn = By.xpath("//button[normalize-space()='Save']");
    By cancelBtn = By.xpath("//button[normalize-space()='Cancel']");
    By EmployeeIdTxt = By.xpath("//input[@class='oxd-input oxd-input--active oxd-input--error']");
    By CreateLoginCheckbox = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
    By enabledCheck = By.xpath("//label[normalize-space()='Enabled']");
    By disableCheck = By.xpath("//label[normalize-space()='Disabled']");
    By passwordTxt = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']" +
            "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By confirmPasswordTxt = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']" +
            "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By imageUploadbtn = By.xpath("//button[@class='oxd-icon-button oxd-icon-button" +
            "--solid-main employee-image-action']");


    public void navigateToPimDashboard() {
        driver.findElement(pimBtn).click();
    }

    public void clickAddEmployeeBtn() {
        driver.findElement(addEmpBtn).click();
    }

    public void setFirstNameTxt(String firstName) {
        driver.findElement(firstNameTxt).sendKeys(firstName);
    }

    public void setMiddleNameTxt(String middleName) {
        driver.findElement(middleNameTxt).sendKeys(middleName);
    }

    public void setLastNameBtn(String lastName) {
        driver.findElement(lastNameBtn).sendKeys(lastName);
    }

    public void toSaveEmployee() {
        driver.findElement(saveBtn).click();
    }

    public void clickCancelBtn() {
        driver.findElement(cancelBtn).click();
    }

    public void clickCreateLoginCheckbox() {
        driver.findElement(CreateLoginCheckbox).click();
    }

    public void clickEnabledCheck() {
        driver.findElement(enabledCheck).click();
    }

    public void clickDisableCheck() {
        driver.findElement(disableCheck).click();
    }

    public String setPasswordTxt(String password) {
        driver.findElement(passwordTxt).sendKeys(password);
        return password;
    }

    public String setConfirmPasswordTxt(String confirmPassword) {
        driver.findElement(confirmPasswordTxt).sendKeys(confirmPassword);
        return confirmPassword;
    }

    public void addEmployeeWithoutLoginDetails(String firstname, String lastname, String middlename){
        navigateToPimDashboard();
        clickAddEmployeeBtn();
        setFirstNameTxt(firstname);
        setMiddleNameTxt(lastname);
        setLastNameBtn(middlename);
        toSaveEmployee();
        System.out.println(driver.getCurrentUrl());
    }


}
