import java.util.Arrays;
import java.util.Scanner;

public class ordernarnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();
        
        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();
        
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        
        System.out.println("Números em ordem crescente: " + 
                        numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        
        scanner.close();
    }
}