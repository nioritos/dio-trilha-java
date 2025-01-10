import java.util.Scanner;

public class NameAge {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean controller = true;
        String nameUser;
        int ageUser;

        while(controller) {
             System.out.println("Name: ");
             nameUser = leitor.next();

            if(nameUser.equals("0")) break;

             System.out.println("Age");
             ageUser = leitor.nextInt();


        }
    }
}