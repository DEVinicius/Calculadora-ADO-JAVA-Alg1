package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        boolean statusCalculadora = true;

        while(statusCalculadora) {
            int escolhaUsuario = 0;

            double numero1, numero2;

            System.out.println("Digite o numero 1: ");
            numero1 = scanner.nextDouble();

            System.out.println("Digite o numero 2: ");
            numero2 = scanner.nextDouble();

            System.out.println("Digite:\n1 - Adicao\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n5 - Sair");
            escolhaUsuario = scanner.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    System.out.println("Soma\n " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    break;

                case 2:
                    System.out.println("Subtracao\n " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));

                    break;

                case 3:
                    System.out.println("Multiplicacao\n " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));

                    break;

                case 4:
                    System.out.println("Divisao\n " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));

                    break;

                case 5:
                    System.out.println("Ate mais");
                    statusCalculadora = false;
                    break;

                default:
                    System.out.println("Escolha Inválida");
                    break;
            }
        }

    }
}
