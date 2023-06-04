package initialization;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageControler {

  public static void scollToBottom(WebDriver driver)
  {
    // chuyển kiểu của đối tượng driver thành JavascriptExecutor
    JavascriptExecutor JSExecutor = (JavascriptExecutor) driver;
    JSExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  }

  public static boolean isElementInViewPort (WebDriver driver, WebElement Element)
  {
    JavascriptExecutor JSExecutor = (JavascriptExecutor) driver;
    //kiem tra phan trang da cuon + chieu cao trang view phai > phan trang da cuon toi phan tu can check
    Boolean isVertical = (Boolean) JSExecutor
        .executeScript("return ((window.pageYOffset + window.innerHeight) > $(arguments[0]).offset().top)", Element);
    //kiem tra phan trang da cuon phai < phan trang da cuon toi phan tu can check + chieu cao phan tu can check
    Boolean isVerticalTop = (Boolean) JSExecutor
        .executeScript("return (window.pageYOffset < ($(arguments[0]).offset().top + $(arguments[0]).height()))", Element);
    //kiem tra chieu rong cua view phai > phan da cuon ben trai toi phan tu can check
    Boolean isHorizontal = (Boolean) JSExecutor
        .executeScript("return (window.innerWidth > $(arguments[0]).offset().left)", Element);
    //kiem tra chieu rong cua view phai > phan da cuon ben trai toi phan tu can check
    Boolean isHorizontalLeft = (Boolean) JSExecutor
        .executeScript("return (window.innerWidth > ($(arguments[0]).offset().left) + $(arguments[0]).width())", Element);

    return isVertical && isVerticalTop && isHorizontal && isHorizontalLeft;
  }

}
