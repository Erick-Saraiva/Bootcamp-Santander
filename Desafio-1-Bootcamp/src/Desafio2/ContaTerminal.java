package Desafio2;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner leitorString = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        Integer textAgencia = leitorString.nextInt();

        System.out.println("Por favor, digite a agência !");
        String numAgencia = leitorInt.next();

        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = leitorString.next();

        System.out.println("Por favor, digite o saldo !");
        Double saldo = leitorInt.nextDouble();

        ContaBanco contaCliente = new ContaBanco(textAgencia, numAgencia, nomeCliente, saldo);

        System.out.println("Olá " + contaCliente.getNomeCliente() + ", obrigado por criar conta em nosso banco, " +
                "sua agência é " + contaCliente.getAgencia() + ", conta " + contaCliente.getNumero() +
                 " e seu saldo de " + contaCliente.getSaldo() + " já está disponível para saque.");


    }
}
