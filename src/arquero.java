public class arquero extends personaje {
    public arquero(String nombre) {
        super(nombre, new arco());
    }
    
    @Override public String getTipo() {
        return "Arquero";
    }
}