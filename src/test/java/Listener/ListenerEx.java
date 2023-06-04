package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerEx implements ITestListener {

//  @Override
  public void onTestFailure(ITestResult result){
    System.out.println("Catch the failure!");
  }
}
