
package paquete2;

public class InstitucionEducativa {

    private String nombreI;
    private String siglas;

    public InstitucionEducativa(String a, String b) {
        nombreI = a;
        siglas = b;
    }

    public void establecerNombreI(String a) {
        nombreI = a;

    }

    public void establecerSiglas(String a) {
        siglas = a;
    }

    public String obtenerNombreI() {
        return nombreI;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Nombre del Centro Educativo: %s\n"
                + "Siglas del Centro Educativo: %s", nombreI, siglas);
        return cadena;
    }

}
