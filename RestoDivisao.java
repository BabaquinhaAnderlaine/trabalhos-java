import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número (dividendo): ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número (divisor): ");
        int num2 = scanner.nextInt();
        
        if (num2 != 0) {
            int resto = num1 % num2;
            System.out.println("O resto da divisão de " + num1 + " por " + num2 + " é: " + resto);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida!");
        }
        
        scanner.close();
    }
}