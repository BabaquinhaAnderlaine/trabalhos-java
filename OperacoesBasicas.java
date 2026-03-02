import java.util.Scanner;

public class OperacoesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + subtracao);
        System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + multiplicacao);
        System.out.println("Divisão: " + num1 + " / " + num2 + " = " + divisao);
        
        scanner.close();
    }
}