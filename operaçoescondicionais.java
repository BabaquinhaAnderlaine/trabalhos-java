import java.util.Scanner;

public class operaçoescondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        
        double resultado;
        
        if (num2 > num1) {
            resultado = num1 + num2;
            System.out.println("Segundo número maior que o primeiro - SOMA");
            System.out.println(num1 + " + " + num2 + " = " + resultado);
        } 
        else if (num1 < num2) {
            resultado = num1 - num2;
            System.out.println("Primeiro número menor que o segundo - SUBTRAÇÃO");
            System.out.println(num1 + " - " + num2 + " = " + resultado);
        }
        else {
            System.out.println("Os números são iguais: " + num1 + " = " + num2);
        }
        
        scanner.close();
    }
}