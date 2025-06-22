package factory.method.refactor;

public class VideojuegoXbox implements Videojuego{

    private String titulo;

    public VideojuegoXbox(String titulo) {
        this.titulo=titulo;
    }

    @Override
    public void cargar() {
        System.out.println("Cargando " + titulo + " para XBOX");
    }

    @Override
    public void jugar() {
        System.out.println("Jugando " + titulo + " en XBOX");
    }
}
