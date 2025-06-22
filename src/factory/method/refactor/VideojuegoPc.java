package factory.method.refactor;

public class VideojuegoPc implements Videojuego{

    private final String titulo;

    public VideojuegoPc(String titulo) {
        this.titulo=titulo;
    }

    @Override
    public void cargar() {
        System.out.println("Cargando " + titulo + " para PC");
    }

    @Override
    public void jugar() {
        System.out.println("Jugando " + titulo + " en PC");
    }
}
