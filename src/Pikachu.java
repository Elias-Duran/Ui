public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
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
