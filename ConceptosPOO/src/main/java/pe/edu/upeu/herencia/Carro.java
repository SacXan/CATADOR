package pe.edu.upeu.herencia;

public class Carro extends vehiculo {

    public static void main(String[] args) {
        Carro c  = new Carro();
        System.out.println("Caracteristicas");
        c.marca="Toyota";
        System.out.println("Marca  "+c.marca);
        System.out.println("Modelo "+c.marca);
        System.out.println("Color: no se puede heredar " +
                " por ser privado"+c.marca);
        c.sonido();
    }
}
