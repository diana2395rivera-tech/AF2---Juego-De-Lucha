public class demoBuilder {
    public static void main(String[] args) {
        System.out.println("Singleton unico? "
                + (configuracionJuego.getInstacia() == configuracionJuego.getInstacia()));

        personaje aria = new personajeBuilder()
                .tipo("mago").nombre("Aria").vida(120).arma(new espada()).build();
        personaje robin = new personajeBuilder().tipo("arquero").nombre("Robin").build();

        new juegoLucha(aria, robin).iniciarPelea();
    }
} 