public class MetodosConRetorno {
    public static void main(String[] args) {
        int resultado = suma(5, 7);
        int r = suma(5,6,1,2,4);
        //int resultado2 = suma(2,3 + 10);
        String texto = suma();
        System.out.println("Resultado: " + r);
        //System.out.println("Resultado Dos: " + resultado2);
        System.out.println("Texto: " + texto);
    }

    static int suma(int a, int b) {
        int r = a + b; //Numeros, enteros, bytes, decimale, flotantes, String, [], {}
        return r; //Return - devolver un numero entero
    }

    //Mismo argumento overloading
    static int suma(int a, int b, int c) {
        return a + b + c; //Return - devolver
    }

    static int suma(int a, int b, int c, int d, int e) {
        return a + b + e;
    }

    static String suma() {
        return "Bienvenidos a los metodos";
    }
}