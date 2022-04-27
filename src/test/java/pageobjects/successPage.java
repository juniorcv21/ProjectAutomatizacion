package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class successPage extends util {
    public static String numeroId;
    @FindBy(xpath = "//*[text()='Order ID']//preceding::h2") protected WebElement success; //Antes del Elemento referenciado
    @FindBy(xpath = "//*[text()='Order ID']//following::strong[1]") protected WebElement idOrder;

    public successPage() {
        PageFactory.initElements(driver,this);
    }
    public void validarMensaje(String data){
        wait.until(ExpectedConditions.visibilityOf(success));
        Assert.assertEquals(data, success.getText());
        //numeroId = idOrder.getText();

    }
    public void imprimirIdOrder(){
        System.out.println("El numero es: "+ idOrder.getText());
    }
}
