package icc.pap.u1.patrones.comportamiento.stateDos;

public class AppStateDos {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println(pedido.nombre());
        pedido.entregar();
        pedido.pagar();
        System.out.println(pedido.nombre());
        pedido.enviar();
        System.out.println(pedido.nombre());
        pedido.cancelar();
        System.out.println(pedido.nombre());
        pedido.entregar();
        System.out.println(pedido.nombre());


    }
    
}
