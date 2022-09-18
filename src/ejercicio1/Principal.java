package ejercicio1;

import java.io.IOException;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        //Instancia Persona, pide DNI y lo valida.
        // Si está ok lo pasa a int, lo setea y muestra. Sino muestra cartel de error.
        Persona persona = new Persona();
        String dni = JOptionPane.showInputDialog("Ingrese DNI: ");
        try {
			if ( Persona.validarDNI(dni) ) {
			    persona.setDni(Integer.parseInt(dni));
			    System.out.println(persona.getDni());
			}
		} catch (DniInvalido e) {
			// TODO Auto-generated catch block
			System.out.println("El dni no es valido!");
		} 
    }
}
