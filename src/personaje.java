public abstract class personaje {
    private String nombre;
    private int puntosVida;
    private arma arma;


    public personaje(String nombre, arma arma){
        this.nombre = nombre;
        this.arma = arma;
        this.puntosVida = configuracionJuego.getInstacia().getVidaInicial();
    }

    public void atacar (personaje oponente){
        int dano = arma.calcularDano();
        oponente.recibirDano(dano);
        System.out.println(this.nombre + "ataca a" + oponente.getNombre()+ "con" + arma.getNombre() + "causando daño" + dano +  "puntos de dano");
    }

    public void recibirDano(int dano){
        this.puntosVida  = - dano;
        if (this.puntosVida < 0 ) {
            this.puntosVida = 0;
        }
    }
    
    public boolean estaVivo () {
        return this.puntosVida > 0;
    }

    public String getNombre  () {
        return nombre; 
    }

    public int getPuntosVida() {
        return puntosVida; 
    }

    public arma getArma() {
        return arma; 
    }

    public void setArma(arma arma) {
        this.arma = arma;
    }

    public void setPuntosDeVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

     public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + " " + nombre + " (" + puntosVida + " HP, " + arma.getNombre() + ")";
    }
}