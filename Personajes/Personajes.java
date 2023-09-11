package Personajes;

// Abstract class Character
abstract class Personajes {
    protected String nombre;
    protected int nivel;

    public Personajes(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public abstract void atacar();
}

//MagicalAbilities Interface
interface HabilidadesMagicas {
    void usarMagia();
}

// PhysicalSkills Interface
interface HabilidadesFisicas {
    void usarHabilidadFisica();
}

// Player class that inherits from Character and implements the interfaces
class Jugador extends Personajes implements HabilidadesMagicas, HabilidadesFisicas {
    private String clase;

    public Jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " attacks with his weapon.");
    }

    @Override
    public void usarMagia() {
        System.out.println(nombre + " use a magical ability.");
    }

    @Override
    public void usarHabilidadFisica() {
        System.out.println(nombre + " uses a physical skill.");
    }

    public void usarHabilidadEspecial() {
        System.out.println(nombre + " Use your special ability.");
    }
}

// Enemy Class that inherits from Character
class Enemigo extends Personajes {
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
        System.out.println(nombre + " emits a terrifying scream.");
    }
}



