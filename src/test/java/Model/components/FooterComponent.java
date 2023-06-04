package Model.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterComponent {
   private WebDriver driver;
   private By PageFooterSelector = By.id("page-footer");
   private By FooterLinkTextSelector = By.cssSelector("#page-footer a");

   public FooterComponent(WebDriver driver){
      this.driver = driver;
   }

   public WebElement PageFooter() {
      return driver.findElement(PageFooterSelector);
   }

   public WebElement FooterLinkText(){
      return driver.findElement(FooterLinkTextSelector);
   }
}
