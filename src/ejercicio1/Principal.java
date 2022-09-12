package ejercicio1;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        //Instancia Persona, pide DNI y lo valida.
        // Si está ok lo pasa a int, lo setea y muestra. Sino muestra cartel de error.
        Persona persona = new Persona();
        String dni = JOptionPane.showInputDialog("Ingrese DNI: ");

        if ( Persona.validarDNI(dni) ) {
            persona.setDni(Integer.parseInt(dni));
            System.out.println(persona.getDni());
        }

    }
}
