package factory.method.refactor;

public class FabricaVideojuegosPc implements FabricaVideojuegos{

    @Override
    public Videojuego crearVideojuego(String titulo) {
        return new VideojuegoPc(titulo);
    }
}
