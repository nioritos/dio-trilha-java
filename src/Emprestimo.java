public class Emprestimo {
    public static double getParcelasUnitarias() {
        return 0.3;
    }
    public static void emprestimo(int valor, int parcelas) {
        
        if (parcelas == 5) System.out.println("emrpestimo de 10x " + ( valor + (valor * getParcelasUnitarias())));
        
    }
}
