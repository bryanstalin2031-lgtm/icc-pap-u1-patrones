package icc.pap.u1.patrones.estructurales.decorator;

/**
 * 
 * Derator: agrega leche a una bebida envolviendo otra bebida
 */
public class AppDerator {

    public static void main(String[] args) {
        Bebida bebida = new CafeSimple();// BEBIDA -> CAFE SIMPLE

        Bebida bebida2 = new Leche(new CafeSimple());// BEBIDA -> CAFE SIMPLE CON LECHE

        System.out.println(bebida.descripcion() + " $" + bebida.precio());
        System.out.println();
        System.out.println(bebida2.descripcion() + " $" + bebida2.precio());
        System.out.println();


        Bebida bebida3 = new Chocolate(new CafeSimple());
        Bebida bebida4 = new Chocolate(new Leche(new CafeSimple()));
        Bebida bebida5 = new Leche(new Chocolate(new CafeSimple()));
        Bebida bebida6 = new Leche(new Chocolate(new Chocolate(new CafeSimple())));

        System.out.println(bebida3.descripcion() + " $" + bebida3.precio());
        System.out.println();
        System.out.println(bebida4.descripcion() + " $" + bebida4.precio());
        System.out.println();
        System.out.println(bebida5.descripcion() + " $" + bebida5.precio());
        System.out.println();
        System.out.println(bebida6.descripcion() + " $" + bebida6.precio());
  

        

    }

}
