package ejercicio1;
import java.io.IOException;

import javax.swing.*;

public class Persona Comparable<Persona>{
    private int dni;
	private String nombre;
    private String apellido;
    
    
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



    public Persona(){  }
    public Persona(String nombre,String apellido,String dni){
    	this.apellido= apellido;
    	this.nombre = nombre;
    	if(validarDNI(dni))
        this.dni = Integer.parseInt(dni);
    }
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
    @Override
	public String toString() {
		return nombre + " " + apellido + ", Dni=" + dni;
	}


	@Override
	public int compareTo(Persona o) {
	
		//ORDENAMIENTO por DNI de > a <
		if(o.dni == this.dni)
			return 0;
		
		if (o.dni<this.dni)
		{
			return 1;
		}		
		return -1;
		
	}

	@Override
	public int hashCode() {
		return dni+31;
	}
	
	
	public boolean equals(Object obj)
	{
		Persona objPersona;
		if(obj instanceof Persona)
		{
			objPersona = (Persona) obj;
			if(objPersona.getDni() == this.getDni())
			{
				return true;
			}
		}
		    return false;
	}
}
