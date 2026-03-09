import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String senhaCorreta = "123456"; // Senha pré-definida
        String senhaDigitada;
        
        System.out.println("=== SISTEMA DE LOGIN ===");
        
        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
            
        } while (!senhaDigitada.equals(senhaCorreta));
        
        System.out.println("Senha correta! Acesso permitido.");
        
        scanner.close();
    }
}
