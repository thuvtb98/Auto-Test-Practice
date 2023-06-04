package DataProvider;

import Model.pages.LoginPage;
import Model.pages.UserDashboardPage;
import initialization.URL;
import java.io.File;
import java.sql.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Driver.DriverBase;
import org.testng.asserts.SoftAssert;

public class TestDateProvider extends DriverBase{

  @Test(dataProvider = "LoginData", description = "Login with data set")
  public void Login(String username, String password){
    WebDriver driver = getDriver();
    driver.get(URL.currentTestUrl("LOGIN_PAGE"));
//    System.out.println(username + " " + password);
//    SoftAssert softAssert = new SoftAssert();
    LoginPage loginPage = new LoginPage(driver);

    loginPage
        .inputUsername(username)
        .inputPassword(password)
        .clickOnLoginBtn();
    UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
//    Assert.assertEquals(userDashboardPage.getFlashMsgAreaElem().getText(), "You logged into a secure area!");
  }

  @DataProvider
  public Object[][] LoginData() {
    /*
    Array with 2 rows and 2 columns
    tomsmith SuperSecretPassword!
    tomsmith 123!
    **/
//    Object[][] loginData = new Object[2][2];
//    loginData[0][0] = "tomsmith";
//    loginData[0][1] = "SuperSecretPassword!";
//    loginData[1][0] = "tomsmith";
//    loginData[1][1] = "123!";

    File excelFileLocation = new File(System.getProperty("user.dir") + "/src/test/Data/" + "LoginDataFile.xlsx");
    String sheetName = "Login";
    int startRowIndex = 1;
    int startColIndex = 0;
    ExcelReaderUtil excelReader = new ExcelReaderUtil(excelFileLocation, sheetName);
    int totalRow = excelReader.getTotalRow();
    int totalCol = excelReader.getTotalColumn();

    Object[][] loginData = new Object[totalRow - startRowIndex][totalCol - startColIndex];
    for(int startRow = startRowIndex; startRow < totalRow; startRow++)
    {
      for(int startCol = startColIndex; startCol < totalCol; startCol++){
        loginData[startRow - startRowIndex][startCol] = excelReader.getCellValue(startRow, startCol);
      }
    }
    return loginData;
  }

}
