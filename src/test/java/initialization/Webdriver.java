package initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver {

  public static WebDriver getChromeDriver(){
    WebDriver driver;

//    for chrome
    String path = System.getProperty("user.dir");
    String ChromeDriverPath = path + "/src/chromedriver/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
    return new ChromeDriver();

    //for FireFox | can't run in parallel
//    String path = System.getProperty("user.dir");
//    String EdgeDriverPath = path + "/src/driverFile/msedgedriver.exe";
//    System.setProperty("webdriver.edge.driver", EdgeDriverPath);
//    return new EdgeDriver();
  }

}
