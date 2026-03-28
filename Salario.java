public class Salario {
    public static void main(String[] args) {

        double salario = 2000000;

        double salud = salario * 0.04;
        double pension = salario * 0.04;

        double salarioFinal = salario - salud - pension;

        System.out.println("Tu salario base es: " + salario);
        System.out.println("Descuento de salud: " + salud);
        System.out.println("Descuento de pensión: " + pension);
        System.out.println("El pago neto es: " + salarioFinal);
    }
}
