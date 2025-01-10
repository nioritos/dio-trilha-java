import java.util.Scanner;

public class ArrayInverso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = {-5, 12, 3, 51, 62, 823, 123,};
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("=======================================");
        for(int i = vetor.length-1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
