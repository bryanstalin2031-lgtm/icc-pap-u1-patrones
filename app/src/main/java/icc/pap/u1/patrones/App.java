package icc.pap.u1.patrones;

import icc.pap.u1.patrones.creacionales.BuilderDemo;
import icc.pap.u1.patrones.creacionales.PrototypeDemo;

public class App {

    public static void main(String[] args) {
        runPrototype();
        runBuilder();

    }

    private static void runPrototype() {
        System.out.println();
        System.out.println("Funcionamiento de Patron Prototype");
        System.out.println();
        // Instanciamos el objeto original
        PrototypeDemo alumno1 = new PrototypeDemo("Bryam", 23);
        // Clonamos el objeto
        PrototypeDemo alumno2 = alumno1.clone();
        alumno2.setNombre("Andrea");
        alumno2.setEdad(19);
        // Imprimimos el original
        System.out.println("Nombre: " + alumno1.getNombre() + " | "
                + "Edad: " + alumno1.getEdad());
        // Imprimimos la copia
        System.out.println("Nombre: " + alumno2.getNombre() + " | "
                + "Edad: " + alumno2.getEdad());

    }

    private static void runBuilder() {
        System.out.println();
        System.out.println("Funcionamiento de patron Builder");
        System.out.println();
        // Creamos el objeto
        BuilderDemo x = new BuilderDemo()
                .setAsignatura("Progamación Aplicada")
                .setJornada("Diurna");
        // Imprimimos
        x.mostrarDatos();
        System.out.println(5
            
        );

    }
}
