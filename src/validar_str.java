//6. Desenvolva um programa que receba uma string e exiba a mesma na tela. Se o valor digitado for em branco exibir 'Dado inválido'
//Salvar o código como: validar_str.java

import java.util.Scanner;

public class validar_str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma frase aleatória:");
        String minhaString = scanner.nextLine();

        if (!minhaString.isBlank()){
            System.out.print("Seu texto: " + minhaString);
        } else {
            System.out.print("inválido. Insira uma frase ou palavra.");
            return;
        }
    }
}
