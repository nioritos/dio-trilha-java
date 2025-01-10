import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Diga a quantidade de números: ");
        int numero;
        numero = scan.nextInt();
        int parImpar = numero % 2;
        System.out.println(parImpar);
        if(numero % 2 == 0) {
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
}
