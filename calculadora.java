import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" CALCULADORA ");
        
        
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        
        
        System.out.println("\nEscolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        
        int opcao = scanner.nextInt();
        double resultado = 0;
        boolean operacaoValida = true;
        
        
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Operação: Soma");
                break;
                
            case 2:
                resultado = num1 - num2;
                System.out.println("Operação: Subtração");
                break;
                
            case 3:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Operação: Divisão");
                } else {
                    System.out.println("Erro: Divisão por zero não permitida!");
                    operacaoValida = false;
                }
                break;
                
            case 4:
                resultado = num1 * num2;
                System.out.println("Operação: Multiplicação");
                break;
                
            default:
                System.out.println("Opção inválida!");
                operacaoValida = false;
        }
        
        
        if (operacaoValida) {
            System.out.printf("Resultado: %.2f %s %.2f = %.2f%n", 
                num1,
                obterSimboloOperacao(opcao),
                num2,
                resultado);
        }
        
        scanner.close();
    }
    
    
    public static String obterSimboloOperacao(int opcao) {
        switch (opcao) {
            case 1: return "+";
            case 2: return "-";
            case 3: return "/";
            case 4: return "*";
            default: return "?";
        }
    }
}