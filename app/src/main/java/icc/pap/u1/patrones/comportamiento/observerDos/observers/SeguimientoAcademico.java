package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;

/**
 * OBSERVER 2
 * SeguimientoAcademico
 */
public class SeguimientoAcademico implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("promedio")) {
            return;
        }
        double anterior = (double) cambio.valorAntiguo();
        double nuevo = (double) cambio.valorNuevo();
        if (anterior >= 7.0 && nuevo < 7.0) {
            System.out.println("\n[ACADEMICO] Bajo rendimiento" + cambio.estudiante());
        }
        if(anterior <= 7.0 && nuevo >= 7.0){
            System.out.println("\n[ACADEMICO] Recuperación academica" + cambio.estudiante());
        }

    }

}
