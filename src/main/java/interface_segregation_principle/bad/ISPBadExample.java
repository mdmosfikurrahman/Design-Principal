package interface_segregation_principle.bad;

public class ISPBadExample {
    public static void main(String[] args) {
        Worker dev = new Developer();
        dev.work();
        dev.eat();

        Worker robot = new Robot();
        robot.work();
        robot.eat();  // Irrelevant method for Robot
    }
}