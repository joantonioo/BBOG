package net.bancodebogota.siebeluat.steps;

import net.bancodebogota.siebeluat.pageObject.HomePageSiebel;
import net.bancodebogota.siebeluat.utils.Variables;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeLoginSiebel {

    @Page
    HomePageSiebel homePageSiebel;
    @Step("Open browser Siebel")
    public void openBrowserSiebel(){
        homePageSiebel.openUrl(Variables.getUrlsiebel());
    }
    @Step("login on siebel")
    public void loginSiebel(){

        WebElement UserId = homePageSiebel.USERID_SIEBEL();
        WebElement BtnLogin = homePageSiebel.USERID_SIEBEL();
        WebDriverWait time = new WebDriverWait(homePageSiebel.getDriver(), Duration.ofSeconds(Variables.getTiempoEspera()));
        try {
            time.until(ExpectedConditions.visibilityOf(UserId));
            UserId.sendKeys(Variables.getUserIdSiebel());

        }catch(Exception e){
            System.out.println("EL ELEMENTO 'ID de usuario' NO ESTA VISIBLE");
        }

        homePageSiebel.getDriver().findElement(homePageSiebel.getCHK_PASSWORD_SIEBEL()).sendKeys(Variables.getPasswordSiebel());
        try {

            time.until(ExpectedConditions.visibilityOf(BtnLogin));
            BtnLogin.click();
        }catch(Exception e){
            System.out.println("EL ELEMENTO 'Contraseña' NO ESTA VISIBLE");
        }
    }

}
