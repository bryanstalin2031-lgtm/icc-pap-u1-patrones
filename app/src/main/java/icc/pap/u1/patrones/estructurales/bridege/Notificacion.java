package icc.pap.u1.patrones.estructurales.bridege;

public abstract class Notificacion {
    protected final CanalEnvio canal;

    //Canstructor dependiente de Canal de Envio

    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }

    public  abstract void notificar(String mensaje);

    
}
