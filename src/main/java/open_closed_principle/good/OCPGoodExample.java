package open_closed_principle.good;

public class OCPGoodExample {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(5);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle area: " + calculator.calculateArea(circle));
    }
}