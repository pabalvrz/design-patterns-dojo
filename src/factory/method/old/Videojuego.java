package factory.method.old;

public class Videojuego {
    private String titulo;
    private String plataforma;

    public Videojuego(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    public void cargar() {
        System.out.println("Cargando " + titulo + " para " + plataforma);
    }

    public void jugar() {
        System.out.println("Jugando " + titulo + " en " + plataforma);
    }
}