package Smoke;

import Model.pages.LoginPage;
import initialization.URL;
import java.util.logging.LoggingPermission;
import org.openqa.selenium.WebDriver;
import initialization.Webdriver;
import org.testng.annotations.Test;

public class TestLoginPageWithPOM {

  @Test
  public void LoginPageWithPOM()
  {
    WebDriver driver = Webdriver.getChromeDriver();
    driver.get(URL.currentTestUrl("LOGIN_PAGE"));
    LoginPage loginPage = new LoginPage(driver);

//    loginPage.username().sendKeys("tomsmith");
//    loginPage.password().sendKeys("SupperSecretPasword!");
//    loginPage.loginBtn().click();

//    loginPage.inputUsername("smith");
//    loginPage.inputPassword("passwordsuperpower");
//    loginPage.clickOnLoginBtn();

//    String loginBtnColor = loginPage.loginBtn().getCssValue("background-color");
//    System.out.println("Login button color: " + loginBtnColor);

    loginPage
        .inputUsername("smith")
        .inputPassword("superpassword")
        .clickOnLoginBtn();

    driver.quit();
  }

}
