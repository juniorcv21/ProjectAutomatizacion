package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class pagarPage extends util {

    @FindBy(id = "card_nmuber") protected WebElement numeroTarjeta;
    @FindBy(id = "month") protected  WebElement mes;
    @FindBy(id = "year") protected WebElement anio;
    @FindBy(id = "cvv_code") protected WebElement cvv;
    @FindBy(xpath = "//input[@type='submit']") protected WebElement btnPagar;

    public pagarPage() {
        PageFactory.initElements(driver, this);
    }
    public void setearNumeroTarjeta(String data){
        wait.until(ExpectedConditions.visibilityOf(numeroTarjeta));
        numeroTarjeta.sendKeys(data);
    }
    public void setearMesTarjeta(String data){
        new Select(mes).selectByVisibleText(data);
    }
    public void setearAnioTarjeta(String data){
        new Select(anio).selectByVisibleText(data);
    }
    public void setearCvvTarjeta(String data){
        cvv.sendKeys(data);
    }
    public void clicPagar(){
        btnPagar.click();
    }

}
