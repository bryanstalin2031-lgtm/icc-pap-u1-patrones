package icc.pap.u1.patrones.estructurales.proxy;

public class AppProxy {
    public static void main(String[] args) {
        Documeto documeto = new DocumentoProxy("informe.pdf");
        System.out.println("El proxy ya está creado.");
        documeto.mostrar();
        documeto.mostrar();
    }
}
