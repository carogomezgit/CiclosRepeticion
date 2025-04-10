package EjerciciosCiclos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numRandom = (int)(Math.random() * 10 + 1);
        int respuesta;
        // System.out.println(numRandom);  <-- testeo de rng para verificar

        System.out.println("Adivina el número del 1 al 10");
        do{
            respuesta = sc.nextInt();
            if (respuesta != numRandom){
            System.out.println("Incorrecto, inténtelo de nuevo");}
        }while(respuesta != numRandom);
        System.out.println("¡Has adivinado el número!");
        System.out.println("El número es " + numRandom);
    }
}