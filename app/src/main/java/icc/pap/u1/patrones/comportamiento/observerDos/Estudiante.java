package icc.pap.u1.patrones.comportamiento.observerDos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private int inasistencias;
    private Matricula estado;
    private final List<Consumer<CambioEstudiante>> observadores;

    

    public Estudiante(String codigo, String nombre, double promedio, int inasistencias, Matricula estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.inasistencias = inasistencias;
        this.estado = estado;
        this.observadores = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (this.codigo == codigo) {
            return ;  
        }
        String codigoAntiguo = this.codigo;
        this.codigo = codigo;
        CambioEstudiante cE = new CambioEstudiante(this, "codigo", codigoAntiguo, codigo);
        notificar(cE);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(this.nombre == nombre){
            return ;
        }
        String nombreAntigup = this.nombre;
        this.nombre = nombre;
        CambioEstudiante cE = new CambioEstudiante(this, "nombre", nombreAntigup, nombre);
        notificar(cE);
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if(this.promedio == promedio){
            return ;
        }
        double promedioAntiguo = this.promedio;
        this.promedio = promedio;
        CambioEstudiante cE = new CambioEstudiante(this, "promedio", promedioAntiguo, promedio);
        notificar(cE);
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias(int inasistencias) {
        if(this.inasistencias == inasistencias){
            return ;
        }
        int inasistenciasAntiguas = this.inasistencias;
        this.inasistencias = inasistencias;
        CambioEstudiante cE = new CambioEstudiante(this, "inasistencias", inasistenciasAntiguas, inasistencias);
        notificar(cE);
    }

    public void suscribir(Consumer<CambioEstudiante> observador) {
        observadores.add(observador);
    }

    public void notificar(CambioEstudiante cambio) {
        for (Consumer<CambioEstudiante> observador : observadores) {
            observador.accept(cambio);
        }
    }
    public Matricula getEstado() {
        return estado;
    }

    public void setEstado(Matricula estado) {
        if(this.estado == estado){
            return ;
        }
        Matricula estadoAntiguo = this.estado;
        this.estado = estado;
        CambioEstudiante cE = new CambioEstudiante(this,"estado", estadoAntiguo,estado);
        notificar(cE);
    }

    

    @Override
    public String toString() {
        return " [Código: " + codigo + ", Nombre: " + nombre + ", Promedio: " + promedio + ", Inasistencias: "
                + inasistencias +  ", Estado: "+estado  + "]";
    }

    
    public List<Consumer<CambioEstudiante>> getObservadores() {
        return observadores;
    }

}
