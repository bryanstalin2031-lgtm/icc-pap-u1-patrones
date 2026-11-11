package icc.pap.u1.patrones.comportamiento.observer;

/**
 * A todos que estan suscritos se avisa sobre los cambios
 * AppObserver
 */
public class AppObserver {
    public static void main(String[] args) {
        Producto p = new Producto("001", 20.50, "Pizza");
        // p.suscribir(cP -> System.out.println("Correo: " + cP));
        // p.suscribir(cP -> System.out.println("Registro: " + cP));
        // String codigoAntiguo = p.getCodigo();
        // p.suscribir(producto -> {
        //     // Imprimir el nuevo codigo(solo el codigo)
        //     // Siempre cuando cambio solo el codigo
        //     if (codigoAntiguo != producto.getCodigo()) {
        //         System.out
        //                 .println("el codigo viejo es: " + codigoAntiguo + "; " + "el nuevo es: " + producto.getCodigo());

        //     }
        // });
        p.suscribir(cp -> {
            System.out.println("Se modifico el " + cp.atributo());
            System.out.println("Old= " + cp.anterior() + "| New= " + cp.nuevo());
            
        });


        // p.notifyAll();
        // NOTIFICAR A TODOS LOS CONSUMER
        System.out.println("Cambiar Nombre");
        p.setPrecio(15.50);
        System.out.println("Cambiar precio");
        p.setNombre("PIZZA");
        System.out.println("Cambio en el Codigo");
        p.setCodigo("010");

    }
}
