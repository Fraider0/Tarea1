public class LlamarUser {
    public static void main(String[] args) {

        User usuario = new User("Miguel", "Zapata", "migue1234@gmail.com", 1231, 3, "Estudinate");

        System.out.println("EL nombre del usuario es:" + usuario.getNombre());
        System.out.println("El apellido del usuario es: " + usuario.getApellido());
        System.out.println("El correo del usuario es: " + usuario.getCorreo());
        System.out.println("La id de identificacion del usuario es: " + usuario.getIdIdentificacion());
        System.out.println("La cantidad de libros que el usuario a prestado es de: " + usuario.getLibroPrestado());
        System.out.println("El usuario es un: " + usuario.getRol());

    }
}