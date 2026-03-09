import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        
        System.out.println("\n=== TABUADA DO " + numero + " ===");
        System.out.println("\nADIÇÃO:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " + " + i + " = " + (numero + i));
        }
        
        System.out.println("\nSUBTRAÇÃO:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " - " + i + " = " + (numero - i));
        }
        
        System.out.println("\nMULTIPLICAÇÃO:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        System.out.println("\nDIVISÃO:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " ÷ " + i + " = " + (numero / (double) i));
        }
        
        scanner.close();
    }
}
