package icc.pap.u1.patrones.estructurales.adapter;

public abstract class DecoradorCargador implements Cargador {

    protected Cargador cargador;

    public DecoradorCargador(Cargador cargador) {
        this.cargador = cargador;
    }

    @Override
    public void cargarCelular() {
        if(cargador != null){
            cargador.cargarCelular();
        }
    }

}
