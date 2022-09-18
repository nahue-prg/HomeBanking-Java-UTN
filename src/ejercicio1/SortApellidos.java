package ejercicio1;

import java.util.Comparator;

class SortApellidos implements Comparator<Persona> {
    public int compare(Persona a, Persona b)
    {
        return a.getApellido().compareTo(b.getApellido());
    }

}