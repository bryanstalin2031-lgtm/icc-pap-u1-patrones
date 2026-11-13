package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.Estudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.Matricula;

public class SeguimientoIntegral implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        Estudiante estudiante = cambio.estudiante();
        double promedio = estudiante.getPromedio();
        int inasistencias = estudiante.getInasistencias();
        Matricula estado = estudiante.getEstado();

        if (promedio < 7 && inasistencias >= 6 && estado.toString().equals("ACTIVO")) {
            System.out.println("\n[SEGUMIENTO INTEGRAL] Riesgo integral " + cambio.estudiante());

        }

    }

}