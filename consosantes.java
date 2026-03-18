import java.util.Scanner;

public class consosantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().toLowerCase();
        
        int contadorConsoantes = 0;
        StringBuilder consoantes = new StringBuilder();
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c) && !isVogal(c)) {
                contadorConsoantes++;
                consoantes.append(c).append(" ");
            }
        }
        
        System.out.println("\nNúmero de consoantes: " + contadorConsoantes);
        System.out.println("Consoantes encontradas: " + consoantes.toString());
        
        scanner.close();
    }
    
    public static boolean isVogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}