package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test01 {

  @Test
  public static void main(String[] args) throws Exception {

    System.setProperty("Webdriver.chrome.driver", "D:\\File_Setup\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize(); //Maximize browser
    driver.navigate().to("https://fsshcmtest.fss.com.vn/HDBS/OnlineTrading/Account/LoginF?ReturnUrl=%2fHDBS%2fOnlineTrading%2f");
    Thread.sleep(2000); //doi 2s de on dinh trang web

    //doi tuong cua webElement
    //click button login

    WebElement username = driver.findElement(By.id("UserName"));
    username.sendKeys("046C000009");

    WebElement password = driver.findElement(By.id("Password"));
    password.sendKeys("123");

    WebElement button_login = driver.findElement(By.className("btn btn-lg btn-primary btn-block text-uppercase btn-submit-reset"));
    button_login.click();

    driver.quit();
    }

}

