package factory.method.refactor;

public class FabricaVideojuegosPlayStation implements FabricaVideojuegos{

    @Override
    public Videojuego crearVideojuego(String titulo) {
        return new VideojuegoPlayStation(titulo);
    }
}
