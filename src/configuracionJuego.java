public class configuracionJuego {
    private static configuracionJuego instancia;

    private final int minDano = 10;
    private final int maxDano = 30;
    private final int vidaInicial = 100;

    private configuracionJuego() {}

    public static configuracionJuego getInstacia() {
        if (instancia == null){
            instancia = new configuracionJuego();
        }
        return instancia;
    }

    public int getMinDano(){
        return minDano;
    }

    public int getMaxDano(){
        return maxDano;
    }

    public int getVidaInicial() {
        return vidaInicial; 
    }
} 