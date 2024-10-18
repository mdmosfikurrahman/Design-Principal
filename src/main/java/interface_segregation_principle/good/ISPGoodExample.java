package interface_segregation_principle.good;

public class ISPGoodExample {
    public static void main(String[] args) {
        Workable dev = new Developer();
        dev.work();

        Eatable devEater = (Eatable) dev;
        devEater.eat();

        Workable robot = new Robot();
        robot.work();  // No irrelevant methods here
    }
}

