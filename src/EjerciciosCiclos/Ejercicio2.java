package EjerciciosCiclos;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio2 {
    public static Logger log =
            Logger.getLogger(Ejercicio2.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userCorrecto = "admin";
        String user;
        String contraseñaCorrecta = "ciclos";
        String contraseña;
        int intentos = 0;
        boolean usuario = false;

        while (intentos < 3 && !usuario) {
            intentos++;
            log.info("Ingrese su usuario");
            user = sc.next();
            log.info("Ingrese su contraseña");
            contraseña = sc.next();

            if (user.equals(userCorrecto) && contraseña.equals(contraseñaCorrecta)) {
                usuario = true;
                log.info("Has ingresado correctamente");
            } else {
                log.info("Las credenciales no son correctas");
            }
        }if (!usuario) {
            log.warning("Has alcanzado tu máximo número de intentos");
            log.severe("Su cuenta ha sido bloqueada");
        }
    }
}