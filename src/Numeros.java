import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int x = 0; x < vetor.length; x++) {
            System.out.println("Digite um numero: ");
            int n = scan.nextInt();

            if(!(n < 0 || n > 100)) vetor[x] = n;
        }
    }
}
