package definitions;

import io.cucumber.java.es.*;
import pageobjects.*;

import java.io.IOException;

import static support.util.evidencia;

public class carritoDefinition {
    menuPage menu;
    tarjetaPage tarjeta;
    carritoPage carritoPage;
    pagarPage pago;
    successPage succes;

    public carritoDefinition() {
        menu = new menuPage();
        tarjeta = new tarjetaPage();
        carritoPage = new carritoPage();
        pago = new pagarPage();
        succes = new successPage();
    }


    @Dado("que la web esta Operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");
    }

    @Cuando("Se genera el numero de Tarjeta")
    public void seGeneraElNumeroDeTarjeta() throws IOException {
        menu.clickGenerarTarjeta();
        menu.ventanaActiva();
        tarjeta.obtenerNumTarjeta();
        tarjeta.obtenerCvv();
        tarjeta.obtenerlblFechaExp();
        evidencia();
        menu.ventanaInicial();
    }

    @Y("selecciona la cantidad {string}")
    public void seleccionaLaCantidad(String cantidad) throws IOException {
        carritoPage.seleccionarCantidad(cantidad);
        evidencia();
    }

    @Y("realiza la compra")
    public void realizaLaCompra() {
        carritoPage.clicComprar();
    }

    @E("ingresa los Datos de la Tarjeta")
    public void ingresaLosDatosDeLaTarjeta() throws IOException {
        pago.setearNumeroTarjeta(tarjetaPage.numeroTarjeta);
        pago.setearAnioTarjeta(tarjetaPage.anio);
        pago.setearMesTarjeta(tarjetaPage.mes);
        pago.setearCvvTarjeta(tarjetaPage.cvv);
        evidencia();
    }
    @Y("realizamos el Pago")
    public void realizamosElPago() {
        pago.scrollVertical();
        pago.clicPagar();

    }

    @Entonces("validamos el mensaje {string}")
    public void validamosElMensaje(String data) throws IOException {
        succes.validarMensaje(data);
        succes.imprimirIdOrder();
        evidencia();
    }
}
