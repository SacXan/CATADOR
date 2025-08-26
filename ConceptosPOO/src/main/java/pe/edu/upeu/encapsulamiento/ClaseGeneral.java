package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {

    public  static void main( String[] args ) {
        persona p = new persona();
        //p. nombre = "Isaac";
        //p. edad = 25;

        p.setNombre("FUEFUE");
        p.setEdad(25);
        p.apellido = "FUEFUE";
        p.saludo();

        Trabajador t = new Trabajador();
        t.setNombre("FUEFUE");
        t.setEdad(25);
        t.setApellido("FUEFUE");
        t.setArea("Sistemas");
        t.setGenero('M');
        System.out.println(t);


    }


}
