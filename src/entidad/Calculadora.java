
package entidad;

public class Calculadora {
    private int varNumero;
    private int varResultado;

    public Calculadora() {
    }

    public Calculadora(int varNumero, int varResultado) {
        this.varNumero = varNumero;
        this.varResultado = varResultado;
    }

    public int getVarNumero() {
        return varNumero;
    }

    public int getVarResultado() {
        return varResultado;
    }

    public void setVarNumero(int varNumero) {
        this.varNumero = varNumero;
    }

    public void setVarResultado(int varResultado) {
        this.varResultado = varResultado;
    }
}
