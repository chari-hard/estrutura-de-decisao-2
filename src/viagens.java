//3. Desenvolva um programa que pergunte a distância que um passageiro deseja percorrer em km.
//Calcule o preço da passagem, cobrando R$ 0,50 por km para viagens de até de 200 km, e R$
//0,45 para viagens mais longas.
//Salvar o código como: viagens.java

import java.util.Scanner;

public class viagens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a distância que deseja percorrer?(por km)");
        double distancia = scanner.nextDouble();
        double valor;

        if (distancia <= 200) {
            valor = distancia * 0.50;
        } else {
            valor = distancia * 0.45;
        }

        System.out.printf("Se a distância percorrida for %.0fKm%nO valor a ser pago será de R$%.2f.", distancia, valor);
    }
}
