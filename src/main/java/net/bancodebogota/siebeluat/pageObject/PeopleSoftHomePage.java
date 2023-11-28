package net.bancodebogota.siebeluat.pageObject;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeopleSoftHomePage extends PageObject {

    private WebDriver driver;

    public PeopleSoftHomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    private final By CHK_USERID = By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]/table[2]/tbody/tr[2]/td[3]/input");
    private final By CHK_PASSWORD = By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]/table[2]/tbody/tr[3]/td[3]/input");
    private final By BTN_SUBMIT = By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]/table[2]/tbody/tr[4]/td[3]/input");

    public By getCHK_USERID() {
        return CHK_USERID;
    }

    public By getCHK_PASSWORD() {
        return CHK_PASSWORD;
    }

    public By getBTN_SUBMIT() {
        return BTN_SUBMIT;
    }

    public WebElement CHK_USERID(){
        return driver.findElement(getCHK_USERID());
    }
}
