

import java.util.Scanner;
public class ContaTerminal {


int numero;
String agencia;
String NomeCompleto;
double saldo = 1500;

 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String NomeCompleto = scanner.nextLine();

    System.out.println("Por favor, digite sua Agencia: ");
    String agencia = scanner.nextLine();

    System.out.println("Digite sua conta: ");
    int numero = scanner.nextInt();
 
    double saldo = scanner.nextDouble();
    
    
    System.out.println("óla " + NomeCompleto + "obrigado por criar um conta no nosso banco, sua agencia é " + agencia + "conta " + numero + " e seu saldo " + saldo + "já esta disponivel para saque" );


  




    }

}
