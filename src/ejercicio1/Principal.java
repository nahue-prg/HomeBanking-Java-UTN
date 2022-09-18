package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import javax.swing.*;


public class Principal {

    public static void main(String[] args) {

        //Instancia Persona, pide DNI y lo valida.
        // Si está ok lo pasa a int, lo setea y muestra. Sino muestra cartel de error.
        Persona persona = new Persona();
        List<Persona> listaPersonas = new ArrayList<Persona>();
         String dni = JOptionPane.showInputDialog("Ingrese DNI: ");

        if ( Persona.validarDNI(dni) ) {
            persona.setDni(Integer.parseInt(dni));
            System.out.println(persona.getDni());
        }
        
        
        Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		if(archivo.existe())
		{	
			///archivo.lee_lineas();
			
			listaPersonas = archivo.devolverlista();
		}
		else
		{
			System.out.println("No existe archivo");
			///archivo.creaArchivo();
		}
		Collections.sort(listaPersonas,new SortApellidos());
		
        for(Persona x : listaPersonas)
        {
        	System.out.println(x.toString());
        }

        
    }
}
