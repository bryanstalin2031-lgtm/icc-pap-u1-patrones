package icc.pap.u1.patrones.creacionales.builder;

/**
 * Objeto Builder 
 * PizzaBuilder va ha acumular las opciones de una pizza
 * y crea el producto(Objeto(pizza)) cuando de le pida
 * el metodo construir(build)
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class PizzaBuilder {

    // private String size = "mediana";
    // private List<String> ingredientes = new ArrayList<>();
    private  String size;
    private Set<String> ingredientes;

    
    public PizzaBuilder() {
        this.size = "Mediana";
        this.ingredientes = new HashSet<>();
        this.ingredientes.add("Queso");
    }

    // OPC 1
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    // OPC 2
    public PizzaBuilder addIngrediente(String ing) {
        boolean contiene = ingredientes.contains(ing);
        if(contiene)
            return this;
        this.ingredientes.add(ing);
        return this;
    }

    // Metodo Build
    // devuelve un producto
    public Pizza build() {
        return new Pizza(size, ingredientes);
    }
}
