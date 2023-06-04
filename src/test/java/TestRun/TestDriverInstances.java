package TestRun;

import Driver.DriverBase;
import Model.pages.LoginPage;
import Model.pages.UserDashboardPage;
import initialization.URL;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDriverInstances extends DriverBase{
  @Test
  public static void TestLoginPass(){
    WebDriver driver = getDriver();
      SoftAssert softAssert = new SoftAssert(); //keep running even though error
      driver.get(URL.currentTestUrl("LOGIN_PAGE"));
      LoginPage loginPage = new LoginPage(driver);

      loginPage
          .inputUsername("tomsmith")
          .inputPassword("SuperSecretPassword!")
          .clickOnLoginBtn();

      UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
      softAssert.assertEquals(userDashboardPage.getLogoutBtnElem().isDisplayed(), true);
    }

  @Test
  public static void TestLoginFail(){
    WebDriver driver = getDriver();
    SoftAssert softAssert = new SoftAssert(); //keep running even though error
    driver.get(URL.currentTestUrl("LOGIN_PAGE"));
//    LoginPage loginPage = new LoginPage(driver);
//
//    loginPage
//        .inputUsername("tomsmith")
//        .inputPassword("SecretPassword!")
//        .clickOnLoginBtn();
//
//    UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
//    softAssert.assertEquals(userDashboardPage.getLogoutBtnElem().isDisplayed(), true);
  }
}
