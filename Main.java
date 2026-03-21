public class Main {
    public static void main(String[] args) {

        Book leer1 = new Book (212321, "El señor de los anillos", "J. R. R. Tolkien", "fantasia", true);

        System.out.println("el isbn del libro es: " + leer1.getIsbn());
        System.out.println("El titulo del libro es: " + leer1.getTitulo());
        System.out.println("El autor del libro es: "+ leer1.getAutor());
        System.out.println("El genero del libro es: " + leer1.getGenero());


        if (leer1.estaDisponible == true) {
            System.out.println("El libro esta dicponible");
        }
        else {
            System.out.println("El libro no esta disponible");
        }
    }
}