package net.bancodebogota.siebeluat.steps;
import net.bancodebogota.siebeluat.pageObject.PeopleSoftHomePage;
import net.bancodebogota.siebeluat.utils.Variables;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class HomeStepLogin {


    @Page
    PeopleSoftHomePage homePage;

   static int tiempo = 10;


    @Step("Open Browser")
    public void openBrower(){
        homePage.openUrl(Variables.getUrlPeopleSoft());
    }

    @Step("login on PeopleSoft")
    public void loginPeopleSoft(){


        WebElement element =  homePage.CHK_USERID();
        WebDriverWait time = new WebDriverWait(homePage.getDriver(),Duration.ofSeconds(Variables.getTiempoEspera()));
        try {
            time.until(ExpectedConditions.visibilityOf(element));
            element.sendKeys(Variables.getUserId());
        }catch(Exception e){
            System.out.println("EL ELEMEMENTO"+homePage.CHK_USERID()+"NO ESTA VISIBLE");
        }
        homePage.getDriver().findElement(homePage.getCHK_PASSWORD()).sendKeys(Variables.getPassword());
        homePage.getDriver().findElement(homePage.getBTN_SUBMIT()).click();
    }

}
