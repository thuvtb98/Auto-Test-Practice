package Authen;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class NormalLogin {
  @Test(groups = {"smoke"})
  public void anExistingTestMethod(){
//    throw new SkipException("skip this test method because this feature is disabled temporary!");
    System.out.println("anExistingTestMethod | Smoke Test");
  }

  @Test(groups = {"smoke"})
  public void LoginWithCorrectCredentials(){
    Assert.fail("Mark this method fail!");
    System.out.println("LoginWithCorrectCredentials | Smoke Test");
  }

  @Test(groups = {"function"})
  public void LoginWithIncorrectCredentials(){
    System.out.println("LoginWithIncorrectCredentials | Function Test");
  }
}
