package icc.pap.u1.patrones.estructurales.adapter;

/**
 * 
 * AppAdapter permite usar un termometro Fahrenheit con una aplicacion que
 * espera
 * Celsius
 */
public final class AppAdapter {

    public static void main(String[] args) {
        // Cargar mi celular con un cargador
        // Pero como ahora tengo un ca debo crear un adaptador
        // CargadorAntiguo cAntiguo = new CargadorAntiguo();
        // Cargador cargador1 = new AdaptadorCargador(cAntiguo);

        // CargadorInalambrico cInalambrico = new CargadorInalambrico();
        // Cargador cargador2 = new AdaptadorCargadorIna(cInalambrico);
        // Cargar el celular
        // cargador1.cargarCelular();
        // cargador2.cargarCelular();

        // Cargar celular - sin el patron
        // si el cargador es antiguo
        System.out.println("---- Pruebas con Decorador ----");
        System.out.println();
        System.out.println("Caso 1. Cargador antiguo con registro");
        System.out.println();
        CargadorAntiguo cA1 = new CargadorAntiguo();
        Cargador c1 = new DecoradorRegistro(new AdaptadorCargador(cA1));
        c1.cargarCelular();
        System.out.println();
        System.out.println("Caso 2. Cargador inálambrico con seguridad permitida");
        System.out.println();
        CargadorInalambrico cI1 =new CargadorInalambrico();
        Cargador c2 = new DecoradorSeguridad(new AdaptadorCargadorIna(cI1), true);
        c2.cargarCelular();
        System.out.println();
        System.out.println("Caso 3. Cargador antiguo con seguridad bloqueada");
        System.out.println();
        CargadorAntiguo cA3 = new CargadorAntiguo();
        Cargador c3 = new DecoradorSeguridad(new AdaptadorCargador(cA3), false);
        c3.cargarCelular();
        System.out.println();
        System.out.println("Caso 4. Cargador inálambrico con dos decoradores");
        System.out.println();
        CargadorInalambrico cI4 = new CargadorInalambrico();
        Cargador c4 = new DecoradorSeguridad(new DecoradorRegistro(new AdaptadorCargadorIna(cI4)), true);
        c4.cargarCelular();
        System.out.println();


    }

}
