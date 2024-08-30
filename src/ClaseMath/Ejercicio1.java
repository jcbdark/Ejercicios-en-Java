package ClaseMath;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        System.out.println("Ingresa la base: ");
        base = sc.nextInt();
        int exponente;
        System.out.println("Ingresa el exponente");
        exponente = sc.nextInt();
        double resultado = Math.pow(base,exponente);
        System.out.println("El resultado es: "+resultado);
    }
}
