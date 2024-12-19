public class SmarTV {
    boolean ligada = false;
    int canal = 1;
    int volume;

    public void aumentarVolume() {
        ++volume;
    }

    public void diminuirVolume() {
        --volume;
    }

    public void ligarTv() {
        ligada = true;
    }

    public void desligarTv() {
        ligada = false;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        ++canal;
    }

    public void diminuirCanal() {
        --canal;
    }
}
