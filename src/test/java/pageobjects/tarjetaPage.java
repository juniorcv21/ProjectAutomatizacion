package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class tarjetaPage extends util {
    @FindBy(xpath = "//*[contains(text(),'Card Number:')]") protected WebElement lblNumTarjeta;
    @FindBy(xpath = "//*[contains(text(),'CVV:')]") protected WebElement lblNumCvv;
    @FindBy(xpath = "//*[contains(text(),'Exp:')]") protected WebElement lblFechaExp;

    public tarjetaPage(){ PageFactory.initElements(driver, this); }

    public void obtenerNumTarjeta(){
        wait.until(ExpectedConditions.visibilityOf(lblNumTarjeta));
        String text = lblNumTarjeta.getText();
        System.out.println(text);
    }
    public void obtenerCvv(){
        String text = lblNumCvv.getText();
        System.out.println(text);
    }
    public void obtenerlblFechaExp(){
        String text = lblFechaExp.getText();
        System.out.println(text);
    }

}
