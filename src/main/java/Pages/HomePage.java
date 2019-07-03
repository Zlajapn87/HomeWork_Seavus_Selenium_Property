package Pages;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseClass {

    public @FindBy(xpath = "(//a/img)[1]")
    WebElement img_Gmail;

    public HomePage(WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "Gmail";
    }

    public boolean credentialsCheck() {

        wait.until(ExpectedConditions.visibilityOf(img_Gmail));

        if (img_Gmail.isDisplayed()) {
            return true;
        }
        return false;
    }
}


