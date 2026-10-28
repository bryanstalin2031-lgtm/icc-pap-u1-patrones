package icc.pap.u1.patrones.estructurales.adapter;
/**
 * 
 * AppAdapter permite  usar  un termometro Fahrenheit con una aplicacion que espera
 * Celsius
 */
public final class AppAdapter {

    public  static void main (String[] args) {
        //Cargar mi celular con un cargador
        //Pero como ahora tengo un ca debo crear un adaptador
       CargadorAntiguo cAntiguo = new CargadorAntiguo();
       Cargador cargador1 = new AdaptadorCargador(cAntiguo);
       
       CargadorInalambrico cInalambrico = new CargadorInalambrico();
       Cargador cargador2 = new AdaptadorCargadorIna(cInalambrico);
       //Cargar el celular
       cargador1.cargarCelular();
       cargador2.cargarCelular();

       //Cargar celular - sin el patron
       //si el cargador es antiguo
       
    }
    
}
