package icc.pap.u1.patrones.creacionales.practica.gestionpedidos.configuracion;

public class ConfiguracionSistema {
    private static ConfiguracionSistema goblal;
    private double impuestos; 

    private ConfiguracionSistema(double impuestos) {
        this.impuestos = 15.0;
    }

    public static synchronized ConfiguracionSistema getGlobal(){
        if(goblal == null){
            goblal = new ConfiguracionSistema(15.0);
        }
        return goblal;
    }

    public double getImpuestos(){
        return impuestos;
    }

    public void setImpuestos(double impuestos){
        this.impuestos = impuestos;
    }

    


}
