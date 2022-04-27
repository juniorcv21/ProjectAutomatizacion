package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class carritoPage extends util {

    @FindBy(xpath = "//input[@type='submit']") protected WebElement btnComprar;
    @FindBy(name = "quantity") protected WebElement cantidad;

    public carritoPage() {
        PageFactory.initElements(driver, this);
    }

    public void seleccionarCantidad(String cant){
        wait.until(ExpectedConditions.visibilityOf(cantidad));
        new Select(cantidad).selectByVisibleText(cant);

    }

    public void clicComprar(){
        wait.until(ExpectedConditions.elementToBeClickable(btnComprar));
        btnComprar.click();
    }

}
