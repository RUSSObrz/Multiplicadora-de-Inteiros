// Programa para multiplicação de inteiros | João Pedro

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Programa de multiplicação\nDigite o primeiro número: ");
                int num1 = in.nextInt();

                System.out.print("Digite o segundo número: ");
                int num2 = in.nextInt();

                System.out.println(num1 + " x " + num2 + " = " + num1 * num2);

                String input = in.nextLine();
                if (input.equalsIgnoreCase("q")){
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Valor inválido, por favor digite apenas números inteiros!");
                in.nextLine();
            }
        }
    }
}