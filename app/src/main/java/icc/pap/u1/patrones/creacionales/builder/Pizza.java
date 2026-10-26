package icc.pap.u1.patrones.creacionales.builder;

import java.util.List;
import java.util.Set;

/**
 * 
 * Pizza clase inmutable
 * 
 * respresenta una pizza ya configurada
 */
public final class Pizza {
    private final  String size;
    private final List<String> ingredientes;
    
   

    protected  Pizza(String size, Set<String> ingredientes) {
        this.size = size;
        this.ingredientes = List.copyOf(ingredientes);
    }



    public String descripcion(){
        return "Pizza" + size + " con: " + ingredientes;
    }
    


    
}
