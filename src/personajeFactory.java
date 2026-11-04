public class personajeFactory {

    private personajeFactory() { }

    public static personaje crear(String tipo, String nombre) {
        switch (tipo.toLowerCase()) {
            case "guerrero":
                return new guerrero(nombre);
            case "arquero":
                return new arquero(nombre);
            case "mago":
                return new mago(nombre);
            default: throw new IllegalArgumentException("Tipo desconocido: " + tipo);
        }
    }
}