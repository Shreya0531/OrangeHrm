package loginPageHrm;

import base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    private LoginPage login;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        login = new LoginPage(driver);
    }

    @AfterClass
    @Override
    public void tearDown() {
        super.tearDown();
    }

    @Test(priority = 1)
    void testLogin() {
        login.performLogin("Admin", "admin123");
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web" +
                "/index.php/dashboard/index");
    }

}

