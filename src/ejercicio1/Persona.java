package ejercicio1;

import java.io.IOException;

import javax.swing.*;

public class Persona {
    private int dni;

    public Persona(){  }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    //MÉTODO QUE VERIFICA QUE EL DNI SOLO CONTENGA NÚMEROS
    public static boolean validarDNI(String entrada) throws DniInvalido {
        try{
        	Integer.parseInt(entrada);
        	return true;
        }catch(NumberFormatException e) {
        	throw new DniInvalido(); 
        }
		
    }

}
