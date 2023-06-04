package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Init {

  public static WebDriver driver;

  public static void Setup()
  {
    System.setProperty("webdriver.chrome.driver", "D:\\File_Setup\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // set wait time 20s for every step
    driver.manage().window().maximize(); // Maximize browser
  }

  public static void TearDown() throws Exception
  {
    Thread.sleep(2000);
    driver.quit();
  }
}
