package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;


public class menuPage extends util {
    @FindBy(linkText = "Generate Card Number") protected WebElement lnkGenerateTarj;

    public menuPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickGenerarTarjeta(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkGenerateTarj)); // Esperar a que este disponible
        lnkGenerateTarj.click();
    }
}
