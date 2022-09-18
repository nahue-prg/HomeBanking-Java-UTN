package ejercicio1;

import java.util.Comparator;

class SortApellidos implements Comparator<Persona>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Persona a, Persona b)
    {
        return a.getApellido().compareTo(b.getApellido());
    }
}