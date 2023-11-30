package net.bancodebogota.siebeluat.utils;


import net.bancodebogota.siebeluat.pageObject.PeopleSoftHomePage;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class SwitchFrame extends PageObject {

    public SwitchFrame(WebDriver driver) {
        super(driver);
    }

    public void setFrame(String nameFrame){

        getDriver().switchTo().frame(nameFrame);

   }

}
