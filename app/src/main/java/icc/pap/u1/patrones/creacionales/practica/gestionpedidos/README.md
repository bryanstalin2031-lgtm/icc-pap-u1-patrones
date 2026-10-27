# Patrones 
## **Singleton** : Creamos con este patron la clase `ConfiguracionSistema` donde configuramos la instancia global y tambien definimos el impuesto comun que tendran los productos finales.

## **Factory Method** : En base a este patron  tenemos la clase `CreadorPedido` en donde definimos el metodo abstracto `crearPedido` en donde las subclases `CreadorPresencial` y `CreadorEnLiena` determinan de que tipo sera el producto final. En la clase `Pedido` tenemos el metodo `procesar` en donde consultamos `ConfiguracionSistema` para saber el impuesto, tambien calculamos el subtotal y tambien definimos la impresion y llamamos al metodo abtracto `generarComprobante`.

