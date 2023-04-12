package eleitores;

import java.util.Scanner;

public class Eleitores {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o número total de eleitores na cidade: ");
        int totalEleitores = scanner.nextInt();
        
        System.out.print("Insira o número de votos válidos: ");
        int votosValidos = scanner.nextInt();
        
        System.out.print("Insira o número de votos nulos: ");
        int votosNulos = scanner.nextInt();
        
        System.out.print("Insira o número de votos em branco: ");
        int votosBranco = scanner.nextInt();
        
        double pcVotosValidos = calculaPcVotos(votosValidos, totalEleitores);
        double pcVotosNulos = calculaPcVotos(votosNulos, totalEleitores);
        double pcVotosBranco = calculaPcVotos(votosBranco, totalEleitores);
        
        System.out.println("Percentual de votos válidos: " + pcVotosValidos + "%");
        System.out.println("Percentual de votos nulos: " + pcVotosNulos + "%");
        System.out.println("Percentual de votos em branco: " + pcVotosBranco + "%");
        
        scanner.close();
    }
    
    public static double calculaPcVotos(int votos, int totalEleitores) {
        return (double) votos / totalEleitores * 100;
    }
}