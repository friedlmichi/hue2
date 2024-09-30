import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose calculator:");
            System.out.println("1 = Rational calculator");
            System.out.println("2 = Vector calculator");
            System.out.println("3 = Complex calculator");
            System.out.println("4 = Exit program");
            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            AbstractCalculator calculator = null;
            switch (choice) {
                case 1:
                    calculator = new RationalCalculator(
                            (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),
                            (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),
                            (x, y) -> new Number(x.getA() * y.getA(), x.getB() * y.getB()),
                            (x, y) -> new Number(x.getA() / y.getA(), x.getB() / y.getB())
                    );
                    break;
                case 2:
                    calculator = new VectorCalculator(
                            (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),
                            (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),
                            null, null
                    );
                    break;
                case 3:
                    calculator = new ComplexCalculator(
                            (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),
                            (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),
                            null, null
                    );
                    break;
            }

            System.out.println("Enter number x a> ");
            double a = scanner.nextDouble();
            System.out.println("Enter number x b> ");
            double b = scanner.nextDouble();
            System.out.println("Enter number y a> ");
            double c = scanner.nextDouble();
            System.out.println("Enter number y b> ");
            double d = scanner.nextDouble();

            Number x = new Number(a, b);
            Number y = new Number(c, d);

            System.out.println("Choose operation:");
            System.out.println("1 = add");
            System.out.println("2 = subtract");
            System.out.println("3 = multiply");
            System.out.println("4 = divide");
            int operation = scanner.nextInt();

            Number result = null;
            switch (operation) {
                case 1:
                    result = calculator.add(x, y);
                    break;
                case 2:
                    result = calculator.subtract(x, y);
                    break;
                case 3:
                    result = calculator.multiply(x, y);
                    break;
                case 4:
                    result = calculator.divide(x, y);
                    break;
            }

            System.out.println("=========================");
            System.out.println("Solution: a = " + result.getA() + " b = " + result.getB());
            System.out.println("=========================");
        }

        scanner.close();
    }
}
