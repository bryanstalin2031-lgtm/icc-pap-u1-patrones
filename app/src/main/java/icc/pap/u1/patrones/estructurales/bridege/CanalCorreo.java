package icc.pap.u1.patrones.estructurales.bridege;

public class CanalCorreo implements CanalEnvio {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Correo: " + mensaje);
    }

}
