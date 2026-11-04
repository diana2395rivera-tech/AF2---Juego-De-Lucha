public class mago extends personaje {
    public mago(String nombre) { super(nombre, new baston()); }
    @Override public String getTipo() {
        return "Mago";
    }
}