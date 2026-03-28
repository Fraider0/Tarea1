public class Prestamo {
    private int id;
    private Book libro;
    private User usuario;
    private int diasPrestamo;

    public Prestamo(int id, Book libro, User usuario, int diasPrestamo) {
        this.id = id;
        this.libro = libro;
        this.usuario = usuario;
        this.diasPrestamo = diasPrestamo;

        this.libro.setEstaDisponible(false);
    }

    public void devolverLibro() {
        this.libro.setEstaDisponible(true);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto por " + usuario.getNombre());
    }

    public void mostrarInfoPrestamo() {
        System.out.println("Préstamo ID: " + id);
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Días otorgados: " + diasPrestamo);
        System.out.println("---------------------------");
    }
}