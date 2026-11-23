import java.util.Scanner;
import java.util.Random;

public class Funciones {
    public static void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        int intento = 0;

        System.out.println("Adivina un numero entre 1 y 10:");
        while (intento != numeroSecreto) {
            System.out.print("Tu numero: ");
            intento = scanner.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Muy bajo, intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto, intenta de nuevo.");
            } else {
                System.out.println("Felicidades! Adivinaste el numero.");
            }
        }
        scanner.close();
    }
}
