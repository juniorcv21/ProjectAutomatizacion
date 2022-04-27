package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class tarjetaPage extends util {
    public static String numeroTarjeta;
    public static String cvv;
    public static String mes;
    public static String anio;
    @FindBy(xpath = "//*[contains(text(),'Card Number:')]") protected WebElement lblNumTarjeta;
    @FindBy(xpath = "//*[contains(text(),'CVV:')]") protected WebElement lblNumCvv;
    @FindBy(xpath = "//*[contains(text(),'Exp:')]") protected WebElement lblFechaExp;



    public tarjetaPage(){ PageFactory.initElements(driver, this); }

    public void obtenerNumTarjeta(){
        wait.until(ExpectedConditions.visibilityOf(lblNumTarjeta));
        String text = lblNumTarjeta.getText();
        numeroTarjeta = text.replace("Card Number:- ","");
        System.out.println(numeroTarjeta);
    }
    public void obtenerCvv(){
        String text = lblNumCvv.getText();
        cvv = text.replace("CVV:- ","");
        System.out.println(cvv);
    }
    public void obtenerlblFechaExp(){
        String text = lblFechaExp.getText();
        String[] list = text.replace("Exp:- ","").split("/");
        mes = list[0];
        anio = list[1];
        System.out.println(mes);
        System.out.println(anio);
    }

}
