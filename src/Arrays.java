public class Arrays {
    public static void main(String[] args){
        String[] nomes = {"Robinson", "Silvia", "Lola", "Bob", "Scoob"};
        System.out.println(nomes.length);
        System.out.println(nomes[0]);

        for(int x = 0; x < nomes.length; x++) {
            System.out.println(nomes[x]);
        }

        System.out.println("----------------------------------------------------------");

        for(int x = nomes.length - 1; x >= 0; x-- ) {
            System.out.println(nomes[x]);
        }
    }

}
