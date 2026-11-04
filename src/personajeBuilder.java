public class personajeBuilder {
    private String tipo = "guerrero";
    private String nombre = "Sin nombre";
    private Integer vida;
    private arma arma;

    public personajeBuilder tipo(String tipo) {
        this.tipo = tipo; return this;
    }
    public personajeBuilder nombre(String nombre) {
        this.nombre = nombre; return this;
    }
    public personajeBuilder vida(int vida) {
        this.vida = vida; return this;
    }
    public personajeBuilder arma(arma arma) { this.arma = arma;
        return this;
    }

    public personaje build() {
        personaje p = personajeFactory.crear(tipo, nombre);
        if (vida != null) p.setPuntosDeVida(vida);
        if (arma != null) p.setArma(arma);
        return p;
    }
}