package icc.pap.u1.patrones.comportamiento.observerDos;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.observers.ControlMatricula;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.NotificadorRepresentante;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.SeguimientoAcademico;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.SeguimientoAsistencia;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.SeguimientoIntegral;

public class AppObserverPractica {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("EST001", "Ana Torres", 8.5, 1, Matricula.ACTIVO);
        Estudiante luis = new Estudiante("EST002", "Luis Pérez", 7.2, 4, Matricula.ACTIVO);
        Estudiante maria = new Estudiante("EST003", "María López", 9.1, 0, Matricula.ACTIVO);

        // Observador 1: auditoria
        Consumer<CambioEstudiante> auditoria = cambio -> {
            System.out.printf("[AUDITORIA] %s | %s: %s -> %s%n",
                    cambio.estudiante(),
                    cambio.atributo(),
                    cambio.valorAntiguo(),
                    cambio.valorNuevo());
        };
        ana.suscribir(auditoria);
        luis.suscribir(auditoria);
        maria.suscribir(auditoria);

        // Observador 2: Academico
        SeguimientoAcademico obAcademico = new SeguimientoAcademico();

        ana.suscribir(obAcademico);
        luis.suscribir(obAcademico);
        maria.suscribir(obAcademico);

        // Observador 3: Asistencia

        SeguimientoAsistencia obAsistencia = new SeguimientoAsistencia();

        ana.suscribir(obAsistencia);
        luis.suscribir(obAsistencia);
        maria.suscribir(obAsistencia);

        // Observador 4: Estado matricula

        ControlMatricula obControlMatricula = new ControlMatricula();

        ana.suscribir(obControlMatricula);
        luis.suscribir(obControlMatricula);
        maria.suscribir(obControlMatricula);

        // Observador 5: Seguimiento integral

        SeguimientoIntegral obIntegral = new SeguimientoIntegral();
        ana.suscribir(obIntegral);
        luis.suscribir(obIntegral);
        maria.suscribir(obIntegral);

        // Observador 6: Notificaion Representante

        NotificadorRepresentante obRepresentante = new NotificadorRepresentante();

        ana.suscribir(obRepresentante);
        luis.suscribir(obRepresentante);

        ana.setCodigo("EST004");
        System.out.println();
        ana.setNombre("ANA");
        System.out.println("\n=== CASO 01 ===");
        System.out.println();
        ana.setPromedio(6.5);
        System.out.println("\n=== CASO 02 ===");
        System.out.println();
        ana.setPromedio(7.8);
        System.out.println("\n=== CASO 03 ===");
        System.out.println();
        luis.setInasistencias(7);
        System.out.println("\n=== CASO 04 ===");
        System.out.println();
        maria.setEstado(Matricula.SUSPENDIDO);
        System.out.println();
        maria.setEstado(Matricula.ACTIVO);
        System.out.println("\n=== CASO 05 ===");
        System.out.println();
        luis.setPromedio(6.4);
        System.out.println("\n=== CASO 06 ===");
        maria.setCodigo("EST003");
        maria.setNombre("María López");
        maria.setPromedio(9.1);
        maria.setInasistencias(0);
        maria.setEstado(Matricula.ACTIVO);
        System.out.println("\n No se ejecuta ningun observador");
        System.out.println("\n=== CASO 07 ===");
        System.out.println();
        ana.setPromedio(4.4);
        System.out.println();
        ana.setInasistencias(4);
        System.out.println();
        luis.setPromedio(7.5);
        System.out.println();
        luis.setInasistencias(2);
        System.out.println();
        maria.setPromedio(6.0);
        System.out.println();
        maria.setInasistencias(7);
        System.out.println("\n=== CASO 08 ===");
        System.out.println();
        maria.setPromedio(7.0);
        System.out.println();
        ana.setPromedio(5.5);
        System.out.println();
        luis.setInasistencias(8);
        System.out.println();
        maria.setInasistencias(9);
        System.out.println();
        luis.setEstado(Matricula.SUSPENDIDO);
        System.out.println();

    }

}
