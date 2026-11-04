public class guerrero extends personaje {
    public guerrero (String nombre){
        super(nombre, new espada());
    }
    
    @Override public String getTipo() {
        return "Guerrero";
    }
}