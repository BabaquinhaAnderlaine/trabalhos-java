public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 e 50:");
        
        int somaExcluidos = 0;
        
        for (int i = 1; i <= 50; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            } else {
                somaExcluidos += i;
            }
        }
        
        System.out.println("\n\nSoma de todos os números excluídos (não primos): " + somaExcluidos);
    }
    
    // Função para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
