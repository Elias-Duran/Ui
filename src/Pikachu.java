import Actracta.Pokemon;
import Interface.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {
    Pikachu(int id, String nombre,String tipo){
        super(id,nombre,tipo);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpactruno() {
        System.out.println("Hola soy Pikachu y este es mi ataque  Impactrueno");
    }

    @Override
    public void atacarOunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque  Union Trueno");
    }
}
