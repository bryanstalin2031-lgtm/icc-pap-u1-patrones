package icc.pap.u1.patrones.creacionales.practica.gestionpedidos.pedidos;

public final class PedidoEnLinea extends Pedido {
    public PedidoEnLinea(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Confimación digital generada");

    }
}