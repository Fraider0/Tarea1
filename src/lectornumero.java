import java.util.Scanner;

public class lectornumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero ");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("El numero " + number + " es par" );
        }else {
            System.out.println("El numero " + number +  " es impar");
        }
    }
}