public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: No es posible dividir entre cero.");
            return 0.0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double suma = calc.sumar(12.5, 7.5);
        double resta = calc.restar(20.0, 4.5);
        double multiplicacion = calc.multiplicar(3.5, 2.0);
        double divisionValida = calc.dividir(15.0, 3.0);
        double divisionInvalida = calc.dividir(10.0, 0.0);

        System.out.println("Resultado Suma: " + suma);
        System.out.println("Resultado Resta: " + resta);
        System.out.println("Resultado Multiplicación: " + multiplicacion);
        System.out.println("Resultado División Válida: " + divisionValida);
        System.out.println("Resultado División Inválida: " + divisionInvalida);
    }
}