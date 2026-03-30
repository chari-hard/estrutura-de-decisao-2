//2. Desenvolva um programa que leia três números e que imprima:
//   2.1. o maior,
//   2.2. o menor,
//   2.3. a soma,
//   2.4. a média.
//Exemplo:
//num1 = 5	num2 = 3	num3 = 10
//**********
//maior = 10
//menor = 3
//soma = 18
//media = 6
//Salvar o código como: maior_menor.java

import java.util.Scanner;

public class maior_menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Escreva o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Escreva o terceiro número: ");
        double num3 = scanner.nextDouble();
        double maior;
        double menor;
        double soma = num1 + num2 + num3;
        double media = (num1 + num2 + num3) / 3;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }
        //esse printf é um inferno
        System.out.printf("----------------------%nMaior: %.0f%nMenor: %.0f%nSoma: %.0f%nMedia: %.0f", maior, menor, soma, media);
    }
}
