//4.1 Uma empresa, que presta serviço à companhia de energia elétrica do estado, necessita de um programa que auxilie os seus eletricistas no cálculo das principais grandezas da Eletricidade
//que são Tensão, Resistência e Corrente. Sabe-se que:
//U = R * I,
//onde,
//U é a Tensão      (em V),
//R é a Resistência (em Ώ) e,
//I é a Corrente    (em A).
//
//Você foi contratado(a) pela empresa para atender a essa solicitação.
//Construa um programa que apresente o seguinte menu:
//
//******************************
//CÁLCULO DE GRANDEZAS ELÉTRICAS
//******************************
//1. Tensão (em Volt)
//2. Resistência (em Ohm)
//3. Corrente (em Ampére)
//4. Sair do programa
//******************************
//Qual grandeza deseja calcular?
//
//Em seguida, o programa deve solicitar que o eletricista informe o valor das outras duas grandezas para realizar o cálculo.
//
//Quando o eletricista escolher:
//1. Tensão, o programa deve solicitar que ele informe os valores da Resistência e da Corrente.
//   Utilizar a fórmula: U = R * I
//
//2. Resistência, o programa deve solicitar que ele informe os valores da Tensão e da Corrente.
//   Utilizar a fórmula: R = U / I
//
//3. Corrente, o programa deve solicitar que ele informe os valores da Tensão e da Resistência.
//   Utilizar a fórmula: I = U / R
//
//Por fim, o programa deve calcular e apresentar o valor encontrado para a grandeza escolhida.
//Obs.: Qualquer opção diferente das apresentadas no menu (1 a 4) deverão ser informadas ao usuário como 'Opção inválida!'
//Salvar o código como: grandezas.java

import java.util.Scanner;

public class grandezas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CÁLCULO DE GRANDEZAS ELÉTRICAS");
        System.out.printf("1. Tensão (em Volt)%n2. Resistência (em Ohm)%n3. Corrente (em Ampére)%n4. Sair do programa%n");
        System.out.print("Qual grandeza deseja calcular?: ");
        int opcao = scanner.nextInt();
        double tensaoU;
        double resistenciaR;
        double correnteI;

        if (opcao == 1) {

            System.out.println("CALCULO DE TENSÃO");

            System.out.print("Informe o valor da Resistência: ");
            resistenciaR = scanner.nextDouble();
            System.out.print("Informe o valor da Corrente: ");
            correnteI = scanner.nextDouble();

            tensaoU = resistenciaR * correnteI;

            System.out.printf("Tensão = %.2fV%n", tensaoU);

        } else if (opcao == 2) {

            System.out.println("CALCULO DE RESISTÊNCIA");

            System.out.print("Informe o valor da Tensão: ");
            tensaoU = scanner.nextDouble();
            System.out.print("Informe o valor da Corrente: ");
            correnteI = scanner.nextDouble();

            resistenciaR = tensaoU / correnteI;

            System.out.printf("Resistência = %.2fΏ%n", resistenciaR);

        } else if (opcao == 3) {

            System.out.println("CALCULO DE CORRENTE");

            System.out.print("Informe o valor da Tensão: ");
            tensaoU = scanner.nextDouble();
            System.out.print("Informe o valor da Resistência: ");
            resistenciaR = scanner.nextDouble();

            correnteI = tensaoU / resistenciaR;

            System.out.printf("Corrente = %.2fA%n", correnteI);

        } else if (opcao == 4) {

            System.out.println("Você saiu com sucesso...");

        } else {

            System.out.println("Opção inválida.");

        }

        System.out.print("Programa encerrado");
    }
}

