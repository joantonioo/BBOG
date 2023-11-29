package net.bancodebogota.siebeluat.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageSiebel extends PageObject {

    private WebDriver driverSiebel;

    public HomePageSiebel(WebDriver driver){
         super(driver);
         this.driverSiebel = driver;

    }

    private final By CHK_USERID_SIEBEL = By.xpath("/html/body/form/div/div[2]/div[1]/span/input");
    private final By CHK_PASSWORD_SIEBEL = By.xpath("/html/body/form/div/div[2]/div[2]/span/input");
    private final By BTN_SUBMIT_SIEBEL = By.xpath("//*[@id=\"s_swepi_22\"]");

    public By getCHK_USERID_SIEBEL() {
        return CHK_USERID_SIEBEL;
    }

    public By getCHK_PASSWORD_SIEBEL() {
        return CHK_PASSWORD_SIEBEL;
    }

    public By getBTN_SUBMIT_SIEBEL() {
        return BTN_SUBMIT_SIEBEL;
    }

    public WebElement USERID_SIEBEL(){
        return driverSiebel.findElement(getCHK_USERID_SIEBEL());
    }
}
