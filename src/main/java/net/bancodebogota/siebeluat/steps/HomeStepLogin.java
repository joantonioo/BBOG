package net.bancodebogota.siebeluat.steps;

import net.bancodebogota.siebeluat.pageObject.HomePage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeStepLogin {
    @Page
    HomePage homePage;

    @Step("Open Browser")
    public void openBrower(){
        homePage.openUrl("http://crmprue:8020/psp/ps/?cmd=login&languageCd=ESP");
    }


    @Step("login on PeopleSoft")
    public void loginPeopleSoft(){

        homePage.getDriver().findElement(homePage.getCHK_USERID()).sendKeys("42430312");
        homePage.getDriver().findElement(homePage.getCHK_PASSWORD()).sendKeys("NOVIEMBRE2023+");
        homePage.getDriver().findElement(homePage.getBTN_SUBMIT()).click();
    }

}
