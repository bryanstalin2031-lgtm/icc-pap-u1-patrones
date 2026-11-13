package icc.pap.u1.patrones.comportamiento.stateDos;

public abstract class EstadoFinal implements EstadoPedido{

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Operacion no permitida");
        
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Operacion no permitida");
        
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Operacion no permitida");
        
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Operacion no permitida");
        
    }
    
}
