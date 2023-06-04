package Driver;

import initialization.Webdriver;
import org.openqa.selenium.WebDriver;

public class DriverFactory {
  private WebDriver webDriver;

  WebDriver getDriver(){
    if(webDriver == null){
      webDriver = Webdriver.getChromeDriver();
    }
    return webDriver;
  }

  void quitDriver(){
    if(webDriver != null){
      webDriver.quit();
      webDriver = null;
    }
  }

}
