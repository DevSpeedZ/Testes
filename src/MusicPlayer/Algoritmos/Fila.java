package MusicPlayer.Algoritmos;
import MusicPlayer.models.Mp3;

public class Fila {
    private int tempoTotal;

    public int getTempoDeFila() {
        return tempoTotal;
    }

    public void adicionarAFila(Mp3 m){
        tempoTotal += m.getDuracao();
    }
}
