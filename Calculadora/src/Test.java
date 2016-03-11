/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1-DAM
 */
public class Test {
    public static void main(String[] args) {
    Calculadora calc1 = new Calculadora();
    calc1.suma(20);
    System.out.printf("El resultado actual tras la suma es de %.2f\n", calc1.resultado);
    calc1.resta(6);
    System.out.printf("El resultado actual tras la resta es de %.2f\n", calc1.resultado);
    calc1.divide(2);
    System.out.printf("El resultado actual tras la division es de %.2f\n", calc1.resultado);
    calc1.resto(3);
    System.out.printf("El resultado actual del resto es de %.2f\n", calc1.resultado);
    
    
    
    }
}