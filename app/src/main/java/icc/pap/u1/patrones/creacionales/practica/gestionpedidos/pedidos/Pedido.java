package icc.pap.u1.patrones.creacionales.practica.gestionpedidos.pedidos;

import icc.pap.u1.patrones.creacionales.practica.gestionpedidos.configuracion.ConfiguracionSistema;

public abstract class Pedido {
    protected String codigo;
    private String cliente;
    private double subtotal;

    protected Pedido(String codigo, String cliente, double subtotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public void procesar() {
        ConfiguracionSistema config = ConfiguracionSistema.getGlobal();
        double impuestoPedido = config.getImpuestos();
        double valorImpuesto = subtotal * (impuestoPedido / 100);
        double total = subtotal + valorImpuesto;

        System.out.println(
                "Cliente: " + cliente + " Subtotal: $" + subtotal + " Impuesto: $" + valorImpuesto + " Total: $" + total);

        generarComprobante();
    }

    protected abstract void generarComprobante();

    

}
