package icc.pap.u1.patrones.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Producto {

    // interfaz propia de java
    // Consumer para establecer una accion.
    private String codigo;
    private double precio;
    private String nombre;
    public final List<Consumer<CambioProducto>> observadores;

    public Producto(String codigo, double precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.observadores = new ArrayList<>();
    }

    public void suscribir(Consumer<CambioProducto> observador) {
        observadores.add(observador);

    }

    private void notifyAll(CambioProducto cambio) {
        for (Consumer<CambioProducto> observador : observadores) {
            observador.accept(cambio);
        }

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String codigoAntiguo = this.codigo;
        this.codigo = codigo;
        CambioProducto cP = new CambioProducto(this, "codigo", codigoAntiguo, codigo);
        notifyAll(cP);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        double precioOld = this.precio;
        this.precio = precio;
        CambioProducto cP = new CambioProducto(this, "20.50", precioOld, precio);
        notifyAll(cP);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String nombreOld = this.nombre;
        CambioProducto cP = new CambioProducto(this, "PIZZA", nombreOld, nombre);
        this.nombre = nombre;
        notifyAll(cP);
    }

    public List<Consumer<CambioProducto>> getObservadores() {
        return observadores;
    }

    @Override
    public String toString() {
        return "Pro[" + codigo + ", " + precio + ", " + nombre + "]";
    }

}
