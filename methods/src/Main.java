
public class Main {
    public static void main(String[] args) {
        SmarTV smartv = new SmarTV();

        System.out.println("Tv ligada? " + smartv.ligada);
        System.out.println("canal atual: " + smartv.canal);
        System.out.println("volume atual: " + smartv.volume);

        System.out.println("User Editing==================================================");

        smartv.ligarTv();
        System.out.println("Tv ligada? " + smartv.ligada);
        smartv.aumentarVolume();
        System.out.println("volume atual: " + smartv.volume);
        smartv.aumentarCanal();
        System.out.println("canal atual: " + smartv.canal);
        smartv.mudarCanal(23);
        System.out.println("canal mudado para: " + smartv.canal);
        smartv.diminuirVolume();
        System.out.println("volume diminuido para: " + smartv.volume);
        smartv.diminuirCanal();
        System.out.println("canal diminuido para: " + smartv.canal);
        smartv.desligarTv();
        System.out.println("Tv ligada? " + smartv.ligada);



    }


}