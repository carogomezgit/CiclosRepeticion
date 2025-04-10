package EjerciciosCiclos;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio3 {
    public static Logger log =
            Logger.getLogger(Ejercicio3.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userCorrecto = "admin";
        String user;
        String passwordCorrecta = "ciclos";
        String password;
        String colorCorrecto = "naranja";
        String color;
        int intentoLogin = 0;
        int intentoPregunta = 0;
        boolean verificacion = false;

        while (intentoLogin < 3 && !verificacion) {
            intentoLogin++;
            log.info("Ingrese su usuario");
            user = sc.next();
            log.info("Ingrese su contraseña");
            password = sc.next();

            if (user.equals(userCorrecto) && password.equals(passwordCorrecta)) {
                verificacion = true;
                do{
                    intentoPregunta++;
                    log.info("Pregunta de seguridad");
                    log.info("¿Cuál es su color favorito?");
                    color = sc.next();
                    if (color.equals(colorCorrecto)){
                        log.info("Has ingresado correctamente");
                    } else{
                        verificacion = false;
                    }
                }while (intentoPregunta < 2 && !color.equals(colorCorrecto));
            } else {
                log.info("Las credenciales no son correctas, intente de nuevo");
            }
        }
        if (!verificacion) {
            log.warning("Has alcanzado tu máximo número de intentos");
            log.severe("Su cuenta ha sido bloqueada");
        }


    }
}
