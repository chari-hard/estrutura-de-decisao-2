
import java.util.Scanner;

public class validar_int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero;

        if (scanner.hasNextInt()){
            numero = scanner.nextInt();
            System.out.print("Seu número: " + numero);
        } else {
            System.out.print("inválido. Insira um número ou palavra.");
            return;
        }
    }
}
