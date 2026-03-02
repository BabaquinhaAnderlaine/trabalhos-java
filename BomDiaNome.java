import java.util.Scanner;

public class BomDiaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Bom dia, " + nome + "!");
        
        scanner.close();
    }
}