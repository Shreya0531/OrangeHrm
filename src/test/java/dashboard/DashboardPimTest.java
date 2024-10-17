package dashboard;

import loginPageHrm.LoginPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.dashboard.PIM;

public class DashboardPimTest extends LoginPageTest {

    PIM addEmp;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        addEmp = new PIM(driver);
    }

    @Test(priority = 2)
    public void addEmployeeWithoutLoginDetails() throws InterruptedException {

        addEmp.addEmployeeWithoutLoginDetails("Shreya","G","Kris");
        Thread.sleep(10000);
        WebElement employeeListLink = driver.findElement(By.linkText("Employee List"));
        String actualText = employeeListLink.getText();
        Assert.assertEquals(actualText, "Employee List");

    }
}
