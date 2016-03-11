/*
 12.	Calculadora.

 Crea una clase llamada calculadora.

 Atributos:
 - resultado: es el último resultado calculado. De tipo float.
 - anterior: es el anterior resultado. De tipo float.

 Métodos:
 - constructor(): muestra un mensaje que dice "Bienvenido".
 - mostrar(): muestra por pantalla el resultado actual. 

 Los siguientes métodos, justo al final de su ejecución, llamarán todos al método mostrar(). 
 Además, estos métodos, antes de modificar el atributo 'resultado', 
 realizarán una copia de este en el atributo 'anterior' (para poder recuperar el resultado anterior).

 - reset(): pone a cero el resultado.
 - set(float valor): guarda en el atributo 'resultado' el valor pasado como parámetro
 - sumar(float cantidad): suma al resultado la cantidad indicada.
 - restar(float cantidad): resta al resultado la cantidad indicada.
 - multiplica(float cantidad): multiplica el resultado por la cantidad indicada y almacena el resultado en 'resultado'
 - divide(float cantidad): divide el resultado entre la cantidad indicada y almacena el resultado en 'resultado'
 - resto(float cantidad): calcula el resto de dividir el resultado entre la cantidad indicada y lo almacena en 'resultado'
 - retroceder(): coloca en el atributo 'resultado' el valor contenido en el atributo 'anterior'.

 Después, realiza una clase Test con un método main que cree un objeto calculadora y realice con él varias operaciones.

 */

public class Calculadora {

    float resultado = 0;
    float anterior;

    public Calculadora() {
        System.out.println("Bienvenido");
    }

    public void reset() {
        anterior = resultado;
        resultado = 0;
    }

    public void guarda(float almacena) {
        anterior = resultado;
        resultado = almacena;
    }

    public void suma(float sumacant) {
        anterior = resultado;
        resultado += sumacant;
    }

    public void resta(float restacant) {
        anterior = resultado;
        resultado -= restacant;
    }

    public void divide(float dividecant) {
        anterior = resultado;
        resultado /= dividecant;
    }

    public void resto(float restocant) {
        anterior = resultado;
        resultado %= restocant;
    }

    public void retroceso(float vuelveatras) {
        anterior = resultado; 
        resultado = anterior;
    }
}
