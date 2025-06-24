package factory.method.refactor;

public class Main {
    public static void main(String[] args) {
        factoryMethod();
    }

    private static void factoryMethod() {
        // Usamos las fábricas en lugar de crear objetos directamente
        FabricaVideojuegos fabricaPC = new FabricaVideojuegosPc();
        FabricaVideojuegos fabricaPlayStation = new FabricaVideojuegosPlayStation();
        FabricaVideojuegos fabricaXbox = new FabricaVideojuegosXbox();

        // Creamos videojuegos usando las fábricas
        Videojuego juego1 = fabricaPC.crearVideojuego("The Witcher 3");
        Videojuego juego2 = fabricaPlayStation.crearVideojuego("God of War");
        Videojuego juego3 = fabricaXbox.crearVideojuego("Halo Infinite");

        // Operaciones con los juegos
        juego1.cargar();
        juego1.jugar();

        juego2.cargar();
        juego2.jugar();

        juego3.cargar();
        juego3.jugar();
    }


}