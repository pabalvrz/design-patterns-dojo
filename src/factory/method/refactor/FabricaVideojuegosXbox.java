package factory.method.refactor;

public class FabricaVideojuegosXbox implements FabricaVideojuegos{

    @Override
    public Videojuego crearVideojuego(String titulo) {
        return new VideojuegoXbox(titulo);
    }
}
