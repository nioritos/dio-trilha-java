import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        int counter = 0;
        int maior = 0;
        int soma = 0;
        int media = 0;

        do {
            System.out.println("Digite um número ");
            numero = leitor.nextInt();
            soma += numero;
            if(numero > maior) maior = numero;
            counter = counter + 1;
            if(counter == 5) media = (soma/counter);
//            System.out.println("media: " + media);
        }while(counter < 5);
        System.out.println("soma: " + soma);
        System.out.println("contador: " + counter);
        System.out.println("Maior número: " + maior);
        System.out.println("Media dos numeros: " + media);
    }

}
