# language: es
  @primeraFuncionalidad
  Característica: Funcionalidad del Carrito Compra version 2
    @smoke
    Escenario: Compra de un Producto version 2
      Dado que la web esta Operativa
      Cuando Se genera el numero de Tarjeta
      Y selecciona la cantidad "1"
      Y realiza la compra
      E ingresa los Datos de la Tarjeta
      Y realizamos el Pago
      Entonces validamos el mensaje "Payment successfull!"
    @regresion
    Esquema del escenario: Compra de un Producto Con Variables version 2
      Dado que la web esta Operativa
      Cuando Se genera el numero de Tarjeta
      Y selecciona la cantidad "<cantidad>"
      Y realiza la compra
      E ingresa los Datos de la Tarjeta
      Y realizamos el Pago
      Entonces validamos el mensaje "<mensaje>"
      Ejemplos:
      |cantidad|mensaje             |
      |3       |Payment successfull!|
      |2       |Payment successfull!|
      |7       |Payment fail!       |