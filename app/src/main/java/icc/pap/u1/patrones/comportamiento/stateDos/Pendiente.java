package icc.pap.u1.patrones.comportamiento.stateDos;

public class Pendiente implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pago Realizado");
        pedido.changeState(new Pagado());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido pendiente por enviar");
        pedido.changeState(new Pagado());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("El pedido no ha sido ni ENVIADO");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pago Canceladoo");
        pedido.changeState(new Cancelado());
    }

    @Override
    public String nombre() {
        return "PENDIENTE";
        
    }
    
}
