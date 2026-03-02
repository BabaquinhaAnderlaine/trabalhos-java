import java.util.Scanner;

public class maiordetres {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    double num1 = scanner.nextDouble() ;

    System.out.println("Digite o segundo número: " );
    double num2 = scanner.nextDouble();

    System.out.println("Digite o terceiro número: " );
    double num3 = scanner.nextDouble();

    double maior = num1;
    double menor = num1;

    if (num2 > maior)  {
        maior = num2;
    }
    if (num3 > maior) {
        maior= num3;
    }
    if (num2 < menor) {
        menor = num2;
    }
    if (num3 < menor) {
        menor = num3;
    }

    System.out.println("O maior é: "+ maior);
    System.out.println("O menor é: "+ menor);

    scanner.close();
    }
}
