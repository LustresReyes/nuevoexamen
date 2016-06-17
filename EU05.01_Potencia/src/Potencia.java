import java.util.*;

public class Potencia {
    
    public static int calPotencia(int a, int b){
        int resul = (int)Math.pow(a, b);
        return resul;
    }

    public static void main(String[] args) {
        
        System.out.println("Cálculo de potencias.");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero : ");
        int a = sc.nextInt();
        System.out.print("Introduzca la potencia : ");
        int b = sc.nextInt();
        
        System.out.printf("\nEl número %d elevado a %d es %d\n", a, b, calPotencia(a, b));
        
    }
    
}
