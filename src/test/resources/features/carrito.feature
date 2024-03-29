# language: es
  @primeraFuncionalidad
  Característica: Funcionalidad del Carrito Compra
    @smoke
    Escenario: Compra de un Producto
      Dado que la web esta Operativa
      Cuando Se genera el numero de Tarjeta
      Y selecciona la cantidad "5"
      Y realiza la compra
      E ingresa los Datos de la Tarjeta
      Y realizamos el Pago
      Entonces validamos el mensaje "Payment successfull!"
    @regresion
    Esquema del escenario: Compra de un Producto Con Variables
      Dado que la web esta Operativa
      Cuando Se genera el numero de Tarjeta
      Y selecciona la cantidad "<cantidad>"
      Y realiza la compra
      E ingresa los Datos de la Tarjeta
      Y realizamos el Pago
      Entonces validamos el mensaje "<mensaje>"
      Ejemplos:
      |cantidad|mensaje             |
      |4       |Payment successfull!|
      |6       |Payment successfull!|
      |8       |Payment fail!       |