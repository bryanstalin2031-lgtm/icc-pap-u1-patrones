package icc.pap.u1.patrones.estructurales.practica2;

public class AppNotificaciones {
    public static void main(String[] args) {
        System.out.println("\n=== CASO 1 ===");

        Notificacion n1 = new NotificacionAcademica(new CanalCorreo());

        n1.notificar("estudiante@universidad.edu", "Sus calificaciones están disponibles.");

        System.out.println("\n=== CASO 2 ===");

        Notificacion n2 = new NotificacionAdministrativa(new CanalSms());

        n2.notificar("0991234567", "Usted tiene un trámite pendiente.");

        System.out.println("\n=== CASO 3 ===");

        CanalEnvio proxyAutorizado = new ProxyCanalEnvio(new CanalPush(), true);

        Notificacion n3 = new NotificacionSeguridad(proxyAutorizado);

        n3.notificar("usuario123", "Se detectó un nuevo inicio de sesión");

        System.out.println("\n=== CASO 4 ===");

        CanalEnvio proxyDeshabilitado = new ProxyCanalEnvio(new CanalSms(), false);

        Notificacion n4 = new NotificacionAcademica(proxyDeshabilitado);

        n4.notificar("0987654321", "");

        System.out.println("\n=== CASO 5 ===");

        CanalCorreo canalCorreo = new CanalCorreo();

        Notificacion n5 = new NotificacionAcademica(canalCorreo);
        Notificacion n5_1 = new NotificacionAdministrativa(canalCorreo);

        n5.notificar("bcarchim@est.ups.edu.ec", "Actividades pendientes");

        n5_1.notificar("bcarchim@est.ups.edu.ec", "Su petición fue aprobada");

        System.out.println("\n=== CASO 6 ===");

        CanalEnvio proxyAbi = new ProxyCanalEnvio(new CanalCorreo(), true);
        CanalEnvio proxyDes = new ProxyCanalEnvio(new CanalSms(), false);

        Notificacion n6 = new NotificacionSeguridad(proxyAbi);
        Notificacion n6_1 = new NotificacionSeguridad(proxyDes);

        n6.notificar("bryanstalin2031@gmail.com", "Cuidado recibiste un correo malisioso");
        n6_1.notificar("0981718419", "Spam");



    }
}
