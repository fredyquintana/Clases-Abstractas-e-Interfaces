package Personajes;

// Interfaz genérica para las habilidades de un personaje
interface Habilidades<T> {
    void usarHabilidad(T habilidad);
}

// Clase abstracta Character
abstract class Personaje {
    protected String nombre;
    protected int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public abstract void atacar();
}

// Clase Player que hereda de Character y aplica la interfaz genérica
class Jugador<T> extends Personaje {
    private String clase;
    private T habilidad;

    public Jugador(String nombre, int nivel, String clase, T habilidad) {
        super(nombre, nivel);
        this.clase = clase;
        this.habilidad = habilidad;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " attacks with his weapon.");
    }

    public void usarHabilidad() {
        System.out.println(nombre + " use a skill: " + habilidad);
    }
}

// Clase Enemy que hereda de Character
class Enemigo extends Personaje {
    private String tipo;

    public Enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " attacks with ferocity.");
    }

    public void gritar() {
        System.out.println(nombre + " emits a terrified scream.");
    }
}





