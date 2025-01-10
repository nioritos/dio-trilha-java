import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[20];
        for(int i = 0; i < vetor.length; i++) {
            int n = random.nextInt(100);
            vetor[i] = n;
        }
        
        for(int n : vetor) System.out.println(n);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        for(int n : vetor) System.out.println("Antecessor: " + (n-1));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        for(int n : vetor) System.out.println("Sucessor: " + (n+1));
        
    }
}
    