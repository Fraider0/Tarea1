public class Metodos {
    public static void main(String[] args) {
        miMetodo(); //Lamo al metodo

        //Pasamos el argumento
        nombres("Lola");
        //Pasamos multiple argumentos
       informacionPersonal("Pepito", "Perez", 20, false);
    }

    static void miMetodo() {
        System.out.println("Mi primer metodo");
    }

    //Parametros -- valores / variables
    static void nombres(String nombre) {
        System.out.println("Hola " + nombre);
    }

    //Multiples parametros
    static void informacionPersonal(String nombre, String apellido, int edad, boolean dormido) {
        if(dormido) {
            System.out.println("La persona " + nombre + " " + apellido + "que tiene: " + edad + " se encuentra domido");
        } else {
            System.out.println("La persona " + nombre + " " + apellido + "que tiene: " + edad + " esta despierto");
        }

    }
}