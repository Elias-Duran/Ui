package Actracta;

public abstract class Pokemon {
    protected int id;
    protected String nombre;
    protected String tipo;

    // Constructor
    public Pokemon(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Métodos para establecer y obtener el ID
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Métodos para establecer y obtener el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos para establecer y obtener el tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    // Métodos abstractos para ataques
    protected abstract void atacarPlacaje();
    protected abstract void atacarArañazo();
    protected abstract void atacarMordisco();

    @Override
    public String toString() {
        return "Pokemon: [ID: " + id + ", Nombre: " + nombre + ", Tipo: " + tipo + "]";
    }
}
