
package servicio;

import entidad.Calculadora;
import java.util.Scanner;

public class CalculadoraService {
    Scanner leer = new Scanner(System.in);

    public Calculadora crearCalculadora() {
        int numero = 0;
        int resultado = 0;
        return new Calculadora(numero, resultado);
    }

    private int calcularDigitos(int n) {
        int digitos = 0;
        while (n != 0) {
            n /= 10;
            digitos++;
        }
        return digitos;
    }

    private void ingresarNumeroBinario(Calculadora c1) {
        boolean comprobar = false;
        int numero;
        String letras;
        int contador;
        do {
            System.out.println("Ingrese su numero binario: ");
            numero = leer.nextInt();
            letras = String.valueOf(numero);
            contador = 0;
            for (int i = 0; i < letras.length(); i++) {
                if (letras.substring(i, i + 1).equals("0") || (letras.substring(i, i + 1).equals("1"))) {
                    contador++;
                }
            }
            if (contador == letras.length()) {
                comprobar = true;
            } else {
                System.out.println("ERROR, Ingrese un numero binario");
            }
        } while (comprobar == false);
        c1.setVarNumero(numero);
    }

    public void binarioDecimal(Calculadora c1) {
        ingresarNumeroBinario(c1);
        int d = calcularDigitos(c1.getVarNumero());
        int[] num = new int[d];
        int suma = 0;
        int cont = 0;
        String numLetra = String.valueOf(c1.getVarNumero());
        for (int i = d; i > 0; i--) {                                   // Llena vector de atras hacia adelante
            num[i - 1] = Integer.parseInt(numLetra.substring(cont, cont + 1));
            cont++;
        }
        for (int i = 0; i < d; i++) {
            num[i] = num[i] * ((int) Math.pow(2, i));
            suma = suma + num[i];
        }
        c1.setVarResultado(suma);
        System.out.println("El numero binario es: " + c1.getVarNumero());
        System.out.println("El numero decimal es: " + c1.getVarResultado());
    }
}
