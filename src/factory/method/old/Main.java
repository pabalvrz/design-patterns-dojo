package factory.method.old;

public class Main {
    public static void main(String[] args) {
        factoryMethod();
    }

    private static void factoryMethod() {
        // Creación directa de instancias (mal diseño)
        Videojuego juego1 = new Videojuego("The Witcher 3", "PC");
        Videojuego juego2 = new Videojuego("God of War", "PlayStation");
        Videojuego juego3 = new Videojuego("Halo Infinite", "Xbox");

        // Operaciones con los juegos
        juego1.cargar();
        juego1.jugar();

        juego2.cargar();
        juego2.jugar();

        juego3.cargar();
        juego3.jugar();
    }


}