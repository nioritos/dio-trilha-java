import java.util.Scanner;

public class Nota{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int nota;
        while (true) {
            System.out.println("Nota entre 0 e 10: ");
            nota = leitor.nextInt();
            if(nota > 10 || nota < 0) {
                System.out.println("nota invalida");
                break;
            };
            if(nota > 7)
                System.out.println("passou na media, com " + nota);
            else
                System.out.println("nao passou na media, passou com " + nota);
        }
    }
}
