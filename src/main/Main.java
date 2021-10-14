
package main;

import entidad.Calculadora;
import servicio.CalculadoraService;

public class Main {

    public static void main(String[] args) {
        CalculadoraService cs = new CalculadoraService();
        Calculadora calc = cs.crearCalculadora();
        
        cs.binarioDecimal(calc);
    }
    
}
