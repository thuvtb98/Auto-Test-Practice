package Authen;

import org.testng.annotations.Test;

public class SSOLogin {
  @Test(groups = {"smoke"})
  public void LoginWithCorrectCredentialsSSOLogin(){
    System.out.println("LoginWithCorrectCredentials | Smoke Test");
  }

  @Test(groups = {"function"})
  public void LoginWithIncorrectCredentialsSSOLogin(){
    System.out.println("LoginWithIncorrectCredentialsSSOLogin | Function Test");
  }
}
