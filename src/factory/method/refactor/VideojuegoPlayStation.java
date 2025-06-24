package factory.method.refactor;

public class VideojuegoPlayStation implements Videojuego{

    private final String titulo;

    public VideojuegoPlayStation(String titulo) {
        this.titulo=titulo;
    }

    @Override
    public void cargar() {
        System.out.println("Cargando " + titulo + " para PlayStation");
    }

    @Override
    public void jugar() {
        System.out.println("Jugando " + titulo + " en PlayStation");
    }
}
