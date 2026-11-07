package icc.pap.u1.patrones.estructurales.bridege;

public class NotificacionAcademica extends Notificacion {

    public NotificacionAcademica(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("Not Academico: " + mensaje);
    }
    
}
