package icc.pap.u1.patrones.estructurales.practica2;

public class CanalSms implements CanalEnvio {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Número: " + destinatario + "\nSMS: " + mensaje);
    }

}
