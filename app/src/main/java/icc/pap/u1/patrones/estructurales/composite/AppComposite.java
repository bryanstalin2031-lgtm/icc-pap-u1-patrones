package icc.pap.u1.patrones.estructurales.composite;

public class AppComposite {
    public static void main(String[] args) {
        GrupoMenu combo = new GrupoMenu();

        GrupoMenu hamburguesa = new GrupoMenu();
        hamburguesa.addItem(new ProductoMenu("Queso", 0.50));
        hamburguesa.addItem(new ProductoMenu("Carne", 1.00));
        hamburguesa.addItem(new ProductoMenu("Pan", 0.50));
        hamburguesa.addItem(new ProductoMenu("Lechuga", 0.25));

        ProductoMenu bebida = new ProductoMenu("CocaCola", 1.35);

        combo.addItem(hamburguesa); //AGREGUE una GM (hambueguesa)
        combo.addItem(bebida); //AGREGUE un PM (bebida)

        System.out.println("Total del combo: $" + combo.precio());
    }
}
