package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.Matricula;

public class ControlMatricula implements Consumer<CambioEstudiante>{

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("estado")) {
            return;
        }

        Matricula nuevo = (Matricula) cambio.valorNuevo();
        Matricula anterior = (Matricula) cambio.valorAntiguo();
        if (nuevo.toString().equals("SUSPENDIDO")) {
            System.out.println("\n[ESTADO MATRICULA] Estudiante Suspendido " + cambio.estudiante());
        }else if (nuevo.toString().equals("RETIRADO")) {
            System.out.println("\n[ESATDO MATRICULA] Estudiante Retirado " + cambio.estudiante());
        }else if (anterior.toString().equals("SUSPENDIDO") && nuevo.toString().equals("ACTIVO")) {
            System.out.println("\n[ESTADO MATRICULA] Estudiante ha sido reactivado" + cambio.estudiante());
        }
    }
    
}
