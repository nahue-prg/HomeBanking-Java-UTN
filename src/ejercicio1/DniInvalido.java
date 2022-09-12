package ejercicio1;

public class DniInvalido extends NumberFormatException{

    public DniInvalido() { }

    @Override
    public String getMessage() {
        return "El DNI solo debe llevar números.";
    }
}
