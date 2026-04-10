public class Book {

     long isbn;
     String titulo;
     String autor;
     String genero;
     boolean estaDisponible;

    private boolean prestamoDisponible;
    private boolean extencionPrestamo;


    public Book() {
    }

    public Book(double isbn, String titulo, String autor, String genero, boolean estaDisponible) {
        this.isbn = (long) isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estaDisponible = estaDisponible;
        this.prestamoDisponible = isPrestamoDisponible();
        this.extencionPrestamo = isExtencionPrestamo();
    }


    public double getIsbn() {
        return isbn;
    }

    public void setIsbn(double isbn) {
        this.isbn = (long) isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public boolean isPrestamoDisponible() {
        return prestamoDisponible;
    }

    public void setPrestamoDisponible(boolean prestamoDisponible) {
        this.prestamoDisponible = prestamoDisponible;
    }

    public boolean isExtencionPrestamo() {
        return extencionPrestamo;
    }

    public void setExtencionPrestamo(boolean extencionPrestamo) {
        this.extencionPrestamo = extencionPrestamo;
    }


}
