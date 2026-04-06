//4.2 Suponha que o professor Atila possua dois logins na rede do SENAI-SP. 
//Construa um programa que valide o acesso do professor à rede. 
//Caso o par usuário/senha informado esteja correto, o programa deve imprimir a mensagem “Seja bem vindo!”.
//Caso contrário, “Usuário e senha não conferem”.
//Dados dos dois logins:
//login 1			login 2
//: atila		usuário: olivi
//senha: 12345		senha: 54321
//Salvar o código como: dois_logins.java


import java.util.Scanner;

public class dois_logins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-viado");
        System.out.print("Por favor, informe seu usuário: ");
        String inserirUser = scanner.nextLine();
        System.out.print("Informe sua senha: ");
        String inserirPass = scanner.nextLine();

        String atilaUser = "atila";
        String atilaPassword = "senai12345";

        String oliviUser = "olivi";
        String oliviPassword = "senai54321";

        String verificarAcesso;

        if (inserirUser.equals(atilaUser) && inserirPass.equals(atilaPassword)) {
            verificarAcesso = "Acesso concedido! Seja bem-vindo Atila";
        } else if(inserirUser.equals(oliviUser) && inserirPass.equals(oliviPassword)) {
            verificarAcesso = "Acesso concedido! Seja bem-vindo Olivi";
        } else {
            verificarAcesso = "Acesso negado. Usuário ou senha incorretos";
        }

        System.out.print(verificarAcesso);
    }
}
