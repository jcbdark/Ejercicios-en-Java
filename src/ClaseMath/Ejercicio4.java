package ClaseMath;

public class Ejercicio4 {
    public static void main(String[] args) {
        double numero1 = (Math.random()*50);
        double numero2 = (Math.random()*50);
        double numeroUnoRedondeado = Math.ceil(numero1);
        double numeroDosRedondeado = Math.round(numero2);
        System.out.println("Numero1: "+numeroUnoRedondeado);
        System.out.println("NUmero2: "+numeroDosRedondeado);
        System.out.println("El numero mayor es: "+Math.max(numeroUnoRedondeado,numeroDosRedondeado));
    }
}
