public class LlamarPerson {
    public static void main(String[] args) {

        Person per = new Person ("Miguel", "Zapata", "miaue1234@gmail.com", 14334213);


        System.out.println("El nombre de la persona es: " + per.getNombre());
        System.out.println("El apellido de la persona es: " + per.apellido);
        System.out.println("El correo de la persona es: " + per.correo);
        System.out.println("El id de identificacion de la persona es: " + per.idIdentificacion);

    }
}
