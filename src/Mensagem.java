public class Mensagem {
    public static void sayMessage(int hour) {
        
        if(hour == 0 || hour == 24) {
            System.out.println("meia noite");
        }else if(hour > 0 && hour < 5) {
            System.out.println("Madrugada");
        }else if(hour > 5 && hour < 12) {
            System.out.println("manha");
        }else if(hour > 12 && hour < 18) {
            System.out.println("tarde");
        }else if(hour > 18 && hour < 24) {
            System.out.println("NOITE");
        }else System.out.println("horario inexsistente");
    } 
}
