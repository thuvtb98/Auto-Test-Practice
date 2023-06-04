package TestRun;

import Model.pages.LoginPage;
import initialization.URL;
import initialization.Webdriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLoginPageWithTestNG {
  @Test
  public void LoginWithCorrectCredentials(){
    WebDriver driver = Webdriver.getChromeDriver();
    driver.get(URL.currentTestUrl("LOGIN_PAGE"));
    LoginPage loginPage = new LoginPage(driver);
    loginPage
        .inputUsername("tomsmith")
        .inputPassword("SuperSecretPassword!")
        .clickOnLoginBtn();
    driver.quit();
  }
}
