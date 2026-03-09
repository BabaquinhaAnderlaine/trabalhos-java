import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inicial: ");
        int numero = scanner.nextInt();
        
        System.out.println("\nOs 100 próximos números (de 6 em 6):");
        for (int i = 1; i <= 100; i++) {
            System.out.print((numero + (i * 6)) + " ");
            if (i % 10 == 0) { // Quebra a cada 10 números para melhor visualização
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
