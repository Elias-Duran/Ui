import Actracta.Pokemon;
import Interface.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {
    public Bulbasaur(int id,String nombre,String tipo) {
        super(id,nombre,tipo);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Paralizar");
    }
}
