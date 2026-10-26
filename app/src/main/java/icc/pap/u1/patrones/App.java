package icc.pap.u1.patrones;

import java.util.List;

import icc.pap.u1.patrones.creacionales.PrototypeDemo;
import icc.pap.u1.patrones.creacionales.builder.Pizza;
import icc.pap.u1.patrones.creacionales.builder.PizzaBuilder;
import icc.pap.u1.patrones.creacionales.prototype.PlantillaEmail;
import icc.pap.u1.patrones.factoryMethod.Importador;
import icc.pap.u1.patrones.factoryMethod.ImportadorPuntoComa;
import icc.pap.u1.patrones.factoryMethod.ImportadorTabulacion;

public class App {

    public static void main(String[] args) {
        // runPrototype();
       //runFactoryMethod();
        runPrototype();
        runBuider();

    }

    private static void runBuider() {
        Pizza pizza = new PizzaBuilder()
        .addIngrediente("Salchicha")
        .setSize("Large")
        .addIngrediente("Queso")
        .addIngrediente("Salami").build();
        System.out.println(pizza.descripcion());
    }

    private static void runPrototype() {
        PlantillaEmail pEmail = new PlantillaEmail("Aviso", "Pedido Listo");
        PlantillaEmail pEmailSolicitud = pEmail.clone();
        pEmailSolicitud.cambiarAsunto("Solicitud");
        System.out.println(pEmail);
        System.out.println(pEmailSolicitud.contenido());

    }

    // private static void runFactoryMethod() {
    //     Importador impPC = new ImportadorPuntoComa();
    //     Importador impT = new ImportadorTabulacion();
    //     // implemeto el crearLector()
    //     // para devolver LecturaPuntoComa
    //     System.out.println(impPC.importacion(List.of("S01;22.5;C", "S02;18;C")));
    //     System.out.println(impT.importacion(List.of("S01\t22\tC", "S02\t18\tC")));
    // }

    // private static void runPrototype() {
    // System.out.println();
    // System.out.println("Funcionamiento de Patron Prototype");
    // System.out.println();
    // // Instanciamos el objeto original
    // PrototypeDemo alumno1 = new PrototypeDemo("Bryam", 23);
    // // Clonamos el objeto
    // PrototypeDemo alumno2 = alumno1.clone();
    // alumno2.setNombre("Andrea");
    // alumno2.setEdad(19);
    // // Imprimimos el original
    // System.out.println("Nombre: " + alumno1.getNombre() + " | "
    // + "Edad: " + alumno1.getEdad());
    // // Imprimimos la copia
    // System.out.println("Nombre: " + alumno2.getNombre() + " | "
    // + "Edad: " + alumno2.getEdad());

    // }

}
