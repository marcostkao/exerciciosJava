package banco;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Entre com o numero da conta: ");
        int number = sc.nextInt();
        System.out.print("Entre com o Titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Tem depósito inicial (S/N)? ");
        char response = sc.next().charAt(0);
        if (response == 's') {
            System.out.print("Entre com o valor inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Conta atual:");
        System.out.println(account);

        //Deposito
        System.out.println();
        System.out.print("Entre com o valor do depósito: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Valor depositado: ");
        System.out.println(account);
        //Saque
        System.out.println();
        System.out.print("Entre com o valor do saque: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Valor depositado: ");
        System.out.println(account);



        sc.close();
    }
}
