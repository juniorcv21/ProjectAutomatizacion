package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pageobjects.menuPage;
import pageobjects.tarjetaPage;

public class carritoDefinition {
    menuPage menu;
    tarjetaPage tarjeta;

    public carritoDefinition() {
        menu = new menuPage();
        tarjeta = new tarjetaPage();
    }


    @Dado("que la web esta Operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");
    }

    @Cuando("Se genera el numero de Tarjeta")
    public void seGeneraElNumeroDeTarjeta() {
        menu.clickGenerarTarjeta();
        menu.ventanaActiva();
        tarjeta.obtenerNumTarjeta();
        tarjeta.obtenerCvv();
        tarjeta.obtenerlblFechaExp();
        menu.ventanaInicial();
    }
}
