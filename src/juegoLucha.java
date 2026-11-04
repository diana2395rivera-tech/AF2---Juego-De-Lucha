import java.util.Scanner;

public class juegoLucha {
    private personaje jugador1;
    private personaje jugador2;

    public juegoLucha(String nombre1, String nombre2) {
        this(personajeFactory.crear("guerrero", nombre1),
             personajeFactory.crear("guerrero", nombre2));
    }

    public juegoLucha(personaje jugador1, personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " + jugador1 + " y " + jugador2 + "...");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    private void turno(personaje atacante, personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() + ". Puntos de vida de "
                + defensor.getNombre() + ": " + defensor.getPuntosVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene "
                + defensor.getPuntosVida() + " puntos de vida.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        personaje p1 = leerPersonaje(scanner, 1);
        personaje p2 = leerPersonaje(scanner, 2);
        new juegoLucha(p1, p2).iniciarPelea();
    }

    private static personaje leerPersonaje(Scanner scanner, int numero) {
        System.out.print("Introduce el nombre del jugador " + numero + ": ");
        String nombre = scanner.nextLine();
        String tipo = null;
        while (tipo == null) {
            System.out.print("Clase (1=Guerrero, 2=Mago, 3=Arquero): ");
            switch (scanner.nextLine().trim()) {
                case "1": tipo = "guerrero"; break;
                case "2": tipo = "mago"; break;
                case "3": tipo = "arquero"; break;
                default: System.out.println("Opcion invalida.");
            }
        }
        return personajeFactory.crear(tipo, nombre);
    }
}