import java.util.Scanner;
import java.util.Random;

public class juegoAdivinarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // INGRESA UN NUMERO ALEATORIO ENTRE 0 Y 100
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivinar el número ");
        System.out.println("Estoy pensando en un número entre 0 y 100. ¡Intenta adivinar el numero!");

        while (true) {
            System.out.print("Introduce tu numero que crees: ");
            int suposicion = scanner.nextInt();
            intentos++;

            if (suposicion == numeroAleatorio) {
                System.out.println("¡Felicitaciones! ¡Has adivinado el número que estaba pensando en el juego adivino en " + intentos + " intentos!");
                break;
            } else if (suposicion < numeroAleatorio) {
                System.out.println("El número que estoy pensando es un numero mayor.");
            } else {
                System.out.println("El número que estoy pensando es un numero menor.");
            }
        }

        scanner.close();
    }
}


