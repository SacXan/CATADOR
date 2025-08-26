package pe.edu.upeu.encapsulamiento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Trabajador {
    private String nombre;
    private int edad;
    private String apellido;
    private String area;
    private char genero;

    @Override
    public String toString() {
        return "Tienes las siguientes caracteristicas:\n"+
                "Nombre: "+nombre+"\n"+
                "Apellido: "+apellido+"\n"
                ;
    }
}
