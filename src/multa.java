//1. Desenvolva um programa que pergunte a velocidade do carro de um usuário.
//Se a velocidade ultrapassar 80km/h, exiba uma mensagem dizendo que o usuário foi multado.
//Nesse caso, exiba o valor da multa, cobrando R$ 50,00 por cada km acima de 80 km/h.
//Exemplo: Digite a velocidade em Km/h: 85
//Limite = 80Km/h
//Excedeu 5Km/h
//multa = 5Km/h * R$ 50,00
//Valor da multa: R$ 250,00
//Salvar o código como: multa.java

import java.util.Scanner;

public class multa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velocímetro:");
        System.out.println("Qual velocidade deseja analisar?");
        System.out.print("Digite aqui(por km/h): ");
        int velocidade = scanner.nextInt();
        int limite = 80;
        int ultrapassou = velocidade - limite;
        double multaTotal = ultrapassou * 50;

        if (velocidade > limite) {
            System.out.println("Você foi multado!!!");
            System.out.printf("Sua velocidade está %dKm/h acima do limite!%n", ultrapassou);
            System.out.printf("Valor da multa: R$%.2f", multaTotal);
        }
    }
}
