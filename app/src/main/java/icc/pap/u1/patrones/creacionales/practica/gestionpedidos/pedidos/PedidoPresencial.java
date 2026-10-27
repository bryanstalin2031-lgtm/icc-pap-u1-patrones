package icc.pap.u1.patrones.creacionales.practica.gestionpedidos.pedidos;

public final class PedidoPresencial extends Pedido {

    public PedidoPresencial(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Comprobante generado en tienda");
    }

}
