package icc.pap.u1.patrones.creacionales.practica.gestionpedidos.creadores;

import icc.pap.u1.patrones.creacionales.practica.gestionpedidos.pedidos.Pedido;
import icc.pap.u1.patrones.creacionales.practica.gestionpedidos.pedidos.PedidoEnLinea;

public class CreadorEnLinea extends CreadorPedido {

    @Override
    public Pedido crearPedido(String codigo, String cliente, double subtotal) {
        return new PedidoEnLinea(codigo, cliente, subtotal);
    }

}
