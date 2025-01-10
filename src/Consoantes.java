import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        for(int x = 0; x < consoantes.length; x++) {
            System.out.println("Digite uma consoante: ");
            String consoante = scan.next();
            if(!(consoante == "a" || consoante == "e" || consoante == "i" || consoante == "o" || consoante == "u")) {
                System.out.println("consoante confirmada");
                consoantes[x] = consoante;
            }
        }

        for(String element: consoantes) {
            System.out.println("consoante: " + element);
        }
    }
}
