package scr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Enumeración para los tipos de misiones
enum TipoMision {
    HISTORIA,
    SECUNDARIA,
    EXPLORACION
}

// Enumeración para los tipos de habilidades
enum TipoHabilidad {
    ATAQUE,
    DEFENSA,
    MAGIA
}

// Clase para el personaje
class Personaje {
    private int salud;
    private int experiencia;
    private int nivel;
    private List<Habilidad> habilidades;
    private List<Objeto> objetos;
    private String nombre;
    private String raza;
    private String clase;
    private int fuerza;
    private int agilidad;
    private int inteligencia;
    private List<Mision> misiones;

    public Personaje(String nombre, String raza, String clase) {
        this.nombre = nombre;
        this.raza = raza;
        this.clase = clase;
        salud = 100;
        experiencia = 0;
        nivel = 1;
        habilidades = new ArrayList<>();
        objetos = new ArrayList<>();
        fuerza = 10;
        agilidad = 10;
        inteligencia = 10;
        misiones = new ArrayList<>();
    }

    public void agregarHabilidad(Habilidad habilidad) {
        habilidades.add(habilidad);
    }

    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public void agregarMision(Mision mision) {
        misiones.add(mision);
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getClase() {
        return clase;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public List<Mision> getMisiones() {
        return misiones;
    }

	public Objeto[] getObjetos() {
		// TODO Auto-generated method stub
		return null;
	}
}

// Clase para el enemigo
class Enemigo {
    private int salud;
    private int ataque;
    private String nombre;

    public Enemigo(String nombre, int salud, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase para la misión
class Mision {
    private String descripcion;
    private TipoMision tipo;
    private int recompensa;
    private boolean completada;

    public Mision(String descripcion, TipoMision tipo, int recompensa) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.recompensa = recompensa;
        this.completada = false;
    }

    public void completarMision(Personaje personaje) {
        if (!completada) {
            personaje.setExperiencia(personaje.getExperiencia() + recompensa);
            completada = true;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }
}

// Clase para el NPC
class NPC {
    private String nombre;
    private String descripcion;
    private List<Objeto> objetos;

    public NPC(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        objetos = new ArrayList<>();
    }

    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public void interactuar(Personaje personaje) {
        System.out.println("El NPC " + nombre + " te dice: " + descripcion);
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase para la facción
class Faccion {
    private String nombre;
    private int reputacion;

    public Faccion(String nombre, int reputacion) {
        this.nombre = nombre;
        this.reputacion = reputacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getReputacion() {
        return reputacion;
    }

    public void setReputacion(int reputacion) {
        this.reputacion = reputacion;
    }
}

// Clase para el objeto
class Objeto {
    private String nombre;
    private String descripcion;
    private int valor;

    public Objeto(String nombre, String descripcion, int valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getValor() {
        return valor;
    }
}

// Clase para la habilidad
class Habilidad {
    private String nombre;
    private TipoHabilidad tipo;
    private int nivel;

    public Habilidad(String nombre, TipoHabilidad tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoHabilidad getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }
}

// Clase para el área
class Area {
    private String nombre;
    private String descripcion;
    private List<Objeto> objetos;
    private List<NPC> npcs;
    private List<Enemigo> enemigos;

    public Area(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        objetos = new ArrayList<>();
        npcs = new ArrayList<>();
        enemigos = new ArrayList<>();
    }

    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public void agregarNPC(NPC npc) {
        npcs.add(npc);
    }

    public void agregarEnemigo(Enemigo enemigo) {
        enemigos.add(enemigo);
    }

    public void explorar(Personaje personaje) {
        System.out.println("Estás en el área " + nombre + ". " + descripcion);
        for (Objeto objeto : objetos) {
            System.out.println("Ves un objeto: " + objeto.getNombre());
        }
        for (NPC npc : npcs) {
            System.out.println("Ves un NPC: " + npc.getNombre());
        }
        for (Enemigo enemigo : enemigos) {
            System.out.println("Ves un enemigo: " + enemigo.getNombre());
        }
    }
}

// Clase para el puzzle
class Puzzle {
    private String descripcion;
    private boolean resuelto;

    public Puzzle(String descripcion) {
        this.descripcion = descripcion;
        resuelto = false;
    }

    public void resolver(Puzzle puzzle) {
        if (!resuelto) {
            // Código para resolver el puzzle
            resuelto = true;
        }
    }
}

public class juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear personaje
        System.out.println("Introduce el nombre del personaje:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce la raza del personaje:");
        String raza = scanner.nextLine();
        System.out.println("Introduce la clase del personaje:");
        String clase = scanner.nextLine();
        Personaje personaje = new Personaje(nombre, raza, clase);

        // Crear áreas
        Area bosque = new Area("Bosque", "Un bosque oscuro y misterioso");
        Area cueva = new Area("Cueva", "Una cueva oscura y peligrosa");
        Area ciudad = new Area("Ciudad", "Una ciudad bulliciosa y emocionante");

        // Crear objetos
        Objeto espada = new Objeto("Espada", "Una espada afilada y poderosa", 10);
        Objeto armadura = new Objeto("Armadura", "Una armadura resistente y ligera", 20);
        Objeto pocion = new Objeto("Pocion", "Una pocion que restaura la salud", 5);

        // Crear NPCs
        NPC vendedor = new NPC("Vendedor", "Un vendedor amistoso que te ofrece objetos");
        NPC guerrero = new NPC("Guerrero", "Un guerrero fuerte y valiente que te ofrece ayuda");

        // Crear enemigos
        Enemigo goblin = new Enemigo("Goblin", 20, 5);
        Enemigo dragon = new Enemigo("Dragon", 100, 20);

        // Crear misiones
        Mision mision1 = new Mision("Matar 5 goblins", TipoMision.HISTORIA, 100);
        Mision mision2 = new Mision("Recopilar 10 objetos", TipoMision.SECUNDARIA, 50);

        // Agregar objetos a las áreas
        bosque.agregarObjeto(espada);
        cueva.agregarObjeto(armadura);
        ciudad.agregarObjeto(pocion);

        // Agregar NPCs a las áreas
        bosque.agregarNPC(vendedor);
        ciudad.agregarNPC(guerrero);

        // Agregar enemigos a las áreas
        bosque.agregarEnemigo(goblin);
        cueva.agregarEnemigo(dragon);

        // Agregar misiones al personaje
        personaje.agregarMision(mision1);
        personaje.agregarMision(mision2);

        // Iniciar el juego
        while (true) {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Explorar el bosque");
            System.out.println("2. Explorar la cueva");
            System.out.println("3. Explorar la ciudad");
            System.out.println("4. Ver mis misiones");
            System.out.println("5. Ver mis objetos");
            System.out.println("6. Ver mi información");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    bosque.explorar(personaje);
                    break;
                case 2:
                    cueva.explorar(personaje);
                    break;
                case 3:
                    ciudad.explorar(personaje);
                    break;
                case 4:
                    System.out.println("Misiones:");
                    for (Mision mision : personaje.getMisiones()) {
                        System.out.println(mision.getDescripcion());
                        if (mision.isCompletada()) {
                            System.out.println("Completada");
                        } else {
                            System.out.println("No completada");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Objetos:");
                    for (Objeto objeto : personaje.getObjetos()) {
                        System.out.println(objeto.getNombre());
                    }
                    break;
                case 6:
                    System.out.println("Información del personaje:");
                    System.out.println("Nombre: " + personaje.getNombre());
                    System.out.println("Raza: " + personaje.getRaza());
                    System.out.println("Clase: " + personaje.getClase());
                    System.out.println("Salud: " + personaje.getSalud());
                    System.out.println("Experiencia: " + personaje.getExperiencia());
                    System.out.println("Nivel: " + personaje.getNivel());
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
