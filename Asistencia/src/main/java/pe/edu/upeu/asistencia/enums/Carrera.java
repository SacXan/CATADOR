package pe.edu.upeu.asistencia.enums;

import javafx.beans.property.StringProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Carrera {
    SISTEMAS(Facultad.FIA, "ing.Sistemas"),
    CIVIL(Facultad.FIA, "ing.Civil"),
    AMBIENTAGE(Facultad.FIA, "ing.Ambiental"),

    ADMINISTRACION(Facultad.FCE, "Administracion"),
    NUTRICION(Facultad.FCS, "Nutricion"),
    EDUCACION(Facultad.FACIHED, "Educacion");


    private Facultad facultad;
    private String descripcion;
}
