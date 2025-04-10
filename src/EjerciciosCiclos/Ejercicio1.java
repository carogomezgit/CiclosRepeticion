package EjerciciosCiclos;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio1 {
    public static Logger log =
            Logger.getLogger(Ejercicio1.class.getName());
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numRandom = (int)(Math.random() * 10 + 1);
        int respuesta;
        // System.out.println(numRandom);  <-- testeo de rng para verificar

        log.info("Adivina el número del 1 al 10");
        do{
            respuesta = sc.nextInt();
            if (respuesta != numRandom){
            log.info("Incorrecto, inténtelo de nuevo");}
        }while(respuesta != numRandom);

        log.info("¡Has adivinado el número!");
        log.info("El número es " + numRandom);
    }
}