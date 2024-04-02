import Actracta.Pokemon;
import Interface.IFuego;

public class Charmander extends Pokemon implements IFuego {
    Charmander(int id, String nombre,String tipo){
        super(id,nombre,tipo);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Charmander y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Puño Fuego");
    }

    @Override
    public void atacarLanzaLlama() {
        System.out.println("Hola soy Charmander y este es mi ataque Lanza Llama");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque Ascuas");
    }
}
