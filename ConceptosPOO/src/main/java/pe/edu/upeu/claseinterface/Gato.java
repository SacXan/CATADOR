package pe.edu.upeu.claseinterface;

public class Gato implements Animal {
    @Override
    public void emitirsonido() {
        System.out.println("miau...");
    }

    @Override
    public void dormir() {
        System.out.println("zzzzzzzzzz");
    }
}
