import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.println("\nMúltiplos de 3 entre " + num1 + " e " + num2 + ":");
        
        if (num1 < num2) {
            // Ordem crescente
            for (int i = num1; i <= num2; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            // Ordem decrescente
            for (int i = num1; i >= num2; i--) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        
        scanner.close();
    }
}
