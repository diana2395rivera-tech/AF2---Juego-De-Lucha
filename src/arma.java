import java.util.Random;

public abstract class arma {
    private final String nombre;
    private final int minDano;
    private final int maxDano;
    private final Random rand = new Random();

    protected arma(String nombre, int minDano, int maxDano) {
        configuracionJuego cfg = configuracionJuego.getInstacia();
        this.nombre = nombre;
        this.minDano = Math.max(minDano, cfg.getMinDano());
        this.maxDano = Math.min(maxDano, cfg.getMaxDano());
    }
    public int calcularDano() {
        return rand.nextInt((maxDano - minDano) + 1) + minDano;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMinDano() {
        return minDano;
    }

    public int getMaxDano() {
        return maxDano;}
}
