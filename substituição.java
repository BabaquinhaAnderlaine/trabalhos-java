import java.util.Arrays;
import java.util.Scanner;

public class substituição {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[20];
        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }
        System.out.println("\nDigite 20 números para o vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }
        int[] C = new int[30];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        
        for (int i = 0; i < B.length; i++) {
            C[10 + i] = B[i];
        }
        
        ordenarVetor(C);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Vetor A (10 elementos): " + Arrays.toString(A));
        System.out.println("Vetor B (20 elementos): " + Arrays.toString(B));
        System.out.println("Vetor C (A + B ordenado): " + Arrays.toString(C));
        
        scanner.close();
    }
    

    public static void ordenarVetor(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}