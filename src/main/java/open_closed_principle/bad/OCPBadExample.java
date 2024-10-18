package open_closed_principle.bad;

public class OCPBadExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(5);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle area: " + calculator.calculateArea(circle));
    }
}
