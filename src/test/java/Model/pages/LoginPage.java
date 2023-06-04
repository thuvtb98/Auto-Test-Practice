package Model.pages;

import Model.components.FooterComponent;
import initialization.Webdriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
  private WebDriver driver;
  private By usernameSelector = By.id("username");
  private By passwordSelector = By.id("password");
  private By loginBtnSelector = By.cssSelector("[type = 'submit']");

  public LoginPage (WebDriver driver)
  {
    this.driver = driver;
  }

  public WebElement username(){
    return driver.findElement(usernameSelector);
  }

  public WebElement password(){
    return driver.findElement(passwordSelector);
  }

  public WebElement loginBtn(){
    return driver.findElement(loginBtnSelector);
  }

  @Step("Input username as {username}")
  public LoginPage inputUsername(String username){
    WebElement usernameElem = driver.findElement(usernameSelector);
    usernameElem.sendKeys(username);
    return this;
  }

  @Step("Input password as {password}")
  public LoginPage inputPassword(String password){
    WebElement usernameElem = driver.findElement(passwordSelector);
    usernameElem.sendKeys(password);
    return this;
  }

  @Step("Click on Submit button")
  public LoginPage clickOnLoginBtn(){
    WebElement LoginBtnElem = driver.findElement(loginBtnSelector);
    LoginBtnElem.click();
    return this;
  }

  public FooterComponent footerComponent(){
    return new FooterComponent(driver);
  }
}
