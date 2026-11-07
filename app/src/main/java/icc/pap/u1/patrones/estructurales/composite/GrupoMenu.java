package icc.pap.u1.patrones.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite porque agrupa productos de tipo ElemetoMenu y calcula un precio es
 * la sumatoria de todos
 * los ElementoMenu
 * GrupoMenu
 */
public class GrupoMenu implements ElementoMenu {
    private List<ElementoMenu> items;

    public GrupoMenu() {
        items = new ArrayList<>();
    }

    @Override
    public double precio() {
        // //La sumatoria
        // double suma = 0;
        // for(ElementoMenu elementoMenu: items){
        //     suma = suma + elementoMenu.precio();
        // }
        // return suma;
        return items.stream().mapToDouble(ElementoMenu::precio).sum();
    }

    public void addItem(ElementoMenu item){
        this.items.add(item);
    }

}
