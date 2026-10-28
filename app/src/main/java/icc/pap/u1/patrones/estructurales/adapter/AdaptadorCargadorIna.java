package icc.pap.u1.patrones.estructurales.adapter;

public class AdaptadorCargadorIna implements Cargador  {



    private final CargadorInalambrico cargadorInalambrico;

    public AdaptadorCargadorIna(CargadorInalambrico cargadorInalambrico){
        this.cargadorInalambrico = cargadorInalambrico;
    }
    @Override
    public void cargarCelular() {
        //validaciones
        //Try catch
        //cotntrol de excepciones
        System.out.println("Cargando inalambricamente");
    }
    
}
