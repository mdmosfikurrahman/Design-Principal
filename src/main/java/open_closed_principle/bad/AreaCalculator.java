package open_closed_principle.bad;

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle rectangle) {
            return rectangle.length * rectangle.width;
        } else if (shape instanceof Circle circle) {
            return Math.PI * circle.radius * circle.radius;
        }
        return 0;
    }
}
