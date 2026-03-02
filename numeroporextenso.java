import java.util.Scanner;

public class numeroporextenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" NÚMERO POR EXTENSO ");
        System.out.println("Digite um número entre 1 e 1000:");
        
        int numero = scanner.nextInt();
        
        if (numero < 1 || numero > 1000) {
            System.out.println("Número inválido! Digite um valor entre 1 e 1000.");
        } else {
            String extenso = converterParaExtenso(numero);
            System.out.println(numero + " - " + extenso);
        }
        
        scanner.close();
    }
    
    public static String converterParaExtenso(int numero) {
        if (numero == 1000) {
            return "mil";
        }
        
        if (numero >= 1 && numero <= 19) {
            return unidadesPorExtenso(numero);
        }
        
        if (numero >= 20 && numero <= 99) {
            return dezenasPorExtenso(numero);
        }
        
        if (numero >= 100 && numero <= 999) {
            return centenasPorExtenso(numero);
        }
        
        return "";
    }
    
    private static String unidadesPorExtenso(int numero) {
        String[] unidades = {
            "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
            "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", 
            "dezessete", "dezoito", "dezenove"
        };
        return unidades[numero];
    }
    
    private static String dezenasPorExtenso(int numero) {
        String[] dezenas = {
            "", "", "vinte", "trinta", "quarenta", "cinquenta", 
            "sessenta", "setenta", "oitenta", "noventa"
        };
        
        int dezena = numero / 10;
        int unidade = numero % 10;
        
        if (unidade == 0) {
            return dezenas[dezena];
        } else {
            return dezenas[dezena] + " e " + unidadesPorExtenso(unidade);
        }
    }
    
    private static String centenasPorExtenso(int numero) {
        String[] centenas = {
            "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos",
            "seiscentos", "setecentos", "oitocentos", "novecentos"
        };
        
        int centena = numero / 100;
        int resto = numero % 100;
        
        
        if (numero == 100) {
            return "cem";
        }
        
        if (resto == 0) {
            return centenas[centena];
        } else {
            return centenas[centena] + " e " + converterParaExtenso(resto);
        }
    }
}