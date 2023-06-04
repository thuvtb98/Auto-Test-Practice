package TestRun;

import Model.pages.LoginPage;
import initialization.Webdriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestFooterComponent {
  @Test
  public void FooterComponent()
  {
    WebDriver driver = Webdriver.getChromeDriver();
    driver.get("https://the-internet.herokuapp.com/login");

    LoginPage loginPage = new LoginPage(driver);

    System.out.println(loginPage.footerComponent().PageFooter().getText());
    System.out.println(loginPage.footerComponent().FooterLinkText().getAttribute("href"));

    driver.quit();
  }
}
