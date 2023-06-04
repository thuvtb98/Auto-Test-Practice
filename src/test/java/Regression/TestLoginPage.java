package Regression;

import static org.testng.Assert.assertEquals;

import Model.pages.LoginPage;
import Model.pages.UserDashboardPage;
import initialization.URL;
import initialization.Webdriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestLoginPage {

  @Test
  public void LoginWithCorrectCredentials(){
    WebDriver driver = Webdriver.getChromeDriver();
    SoftAssert softAssert = new SoftAssert(); //keep running even though error
    driver.get(URL.currentTestUrl("LOGIN_PAGE"));
    LoginPage loginPage = new LoginPage(driver);

    loginPage
        .inputUsername("tomsmith")
        .inputPassword("SuperSecretPassword!")
        .clickOnLoginBtn();

    UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
    String ExpectedPageHeader = "Secure Area";
    String ActualPageHeader = userDashboardPage.getPageHeaderElem().getText();
    softAssert.assertEquals(ActualPageHeader, ExpectedPageHeader, "ERR | Page header is wrong!"); //if actual not equal expected then print message err...
    softAssert.assertTrue(userDashboardPage.getLogoutBtnElem().isDisplayed(), "ERR | Logout button is not displayed!"); // if logout button is not displayed then print message err...

    //close browser after assert all verification point
    driver.quit();
    softAssert.assertAll(); //  throw all the exceptions caught during the process
  }

  @Test(dependsOnMethods = "LoginWithCorrectCredentials")
  public void LoginWithIncorrectCredentials(){
    WebDriver driver = Webdriver.getChromeDriver();
    driver.get(URL.currentTestUrl("LOGIN_PAGE"));
    LoginPage loginPage = new LoginPage(driver);

    loginPage
        .inputUsername("tomsmith")
        .inputPassword("SecretPassword!")
        .clickOnLoginBtn();

    UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
    String ExpectedPageHeader = "Login Page";
    String ActualPageHeader = userDashboardPage.getPageHeaderElem().getText();
    assertEquals(ActualPageHeader, ExpectedPageHeader);
    driver.quit();
  }
}