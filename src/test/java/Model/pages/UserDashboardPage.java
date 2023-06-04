package Model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDashboardPage {
  private WebDriver driver;
  private By flashMsgAreaSelector = By.id("flash");
  private By PageHeaderSelector = By.tagName("h2");
  private By subHeaderSelector = By.className("subheader");
  private By logoutBtnSelector = By.cssSelector("#content a");

  public UserDashboardPage(WebDriver driver) {
    this.driver = driver;
  }

  public WebElement getFlashMsgAreaElem() {
    WebElement flashMsgAreaElem = driver.findElement(flashMsgAreaSelector);
    return flashMsgAreaElem;
  }

  public WebElement getPageHeaderElem() {
    WebElement PageHeaderElem = driver.findElement(PageHeaderSelector);
    return PageHeaderElem;
  }

  public WebElement getSubHeaderElem() {
    WebElement subHeaderElem = driver.findElement(subHeaderSelector);
    return subHeaderElem;
  }

  public WebElement getLogoutBtnElem(){
    WebElement logoutBtnElem = driver.findElement(logoutBtnSelector);
    return logoutBtnElem;
  }
}
