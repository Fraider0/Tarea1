public class LlamarPrestamo {
    public static void main(String[] args) {

        Book leer1 = new Book(212321, "El señor de los anillos", "J. R. R. Tolkien", "fantasia", true);
        User user1 = new User("Miguel", "Zapata", "migue1234@gmail.com", 1231, 3, "Estudinate");

        Prestamo miPrestamo = new Prestamo(1243, leer1, user1, 7);

        miPrestamo.mostrarInfoPrestamo();
        System.out.println("¿Está el libro disponible? " + leer1.isEstaDisponible());

        miPrestamo.devolverLibro();
        System.out.println("¿Está el libro disponible ahora? " + leer1.isEstaDisponible());
    }
}
