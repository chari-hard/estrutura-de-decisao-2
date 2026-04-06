//5. Na última Black Friday, o gerente de uma loja de perfumes colocou todo o seu estoque em promoção, de acordo com a tabela a seguir:
//
//Código	Condição de Pagamento	Desconto (%)
//1 	À vista (em espécie) 	10
//2	Cartão de débito	5
//3	Cartão de crédito	3
//4	PIX			7.5
//
//Construa um programa que solicite ao operador do caixa o preço total da venda, bem como a forma de pagamento.
//Ao fim, o programa deve informar o valor final a ser pago.
//Salvar o código como: black_friday.java

import java.util.Scanner;

public class black_friday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA BLACK FRIDAY");

        System.out.print("Informe o preço total da venda: ");
        double valor = scanner.nextDouble();

        System.out.printf("Informe o método de pagamento:%n1 - À vista (em espécie)%n2 - Cartão de débito%n3 - Cartão de crédito%n4 - PIX%nDigite aqui: ");
        int pagamento = scanner.nextInt();
        double valorFinal = 0;
        double valorDescontado = 0;

        if (pagamento >= 1 && pagamento <= 4) {
            if (pagamento == 1) {
                valorFinal = valor - (valor * 0.1);
            } else if (pagamento == 2) {
                valorFinal = valor - (valor * 0.05);
            } else if (pagamento == 3) {
                valorFinal = valor - (valor * 0.03);
            } else {
                valorFinal = valor - (valor * 0.075);
            }
            valorDescontado = valor - valorFinal;
        } else {
            System.out.print("Método de pagamento inválido");
            return;
        }

        System.out.printf("Valor final: R$%.2f%nValor descontado: R$%.2f", valorFinal, valorDescontado);
    }
}