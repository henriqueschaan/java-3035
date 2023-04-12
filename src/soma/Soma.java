package soma;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int num;

        System.out.print("Insira uma sequência de números: ");

        while ((num = scanner.nextInt()) >= 0) {
            soma += num;
        }

        System.out.println("A soma é " + soma);
        
        scanner.close();
    }
}