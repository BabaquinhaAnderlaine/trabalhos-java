import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class saudacaidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite sua data de nascimento (formato: dd/MM/yyyy):");
        String dataNascimentoStr = scanner.nextLine();
        
        
        LocalDate hoje = LocalDate.now();
        int hora = java.time.LocalTime.now().getHour();
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        
        
        int idade = Period.between(dataNascimento, hoje).getYears();
        
        
        String saudacao;
        if (hora >= 5 && hora < 12) {
            saudacao = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }
        
        
        boolean maiorIdade = idade >= 18;
        String statusEntrada = maiorIdade ? "liberada" : "negada (menor de idade)";
        
        System.out.println("\n" + saudacao + ", " + nome + "!");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Entrada " + statusEntrada);
        
        scanner.close();
    }
}