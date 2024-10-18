package interface_segregation_principle.bad;

public class Robot implements Worker {
    public void work() {
        System.out.println("Robot is working");
    }

    public void eat() {
        // Robot doesn't need to eat, but forced to implement this method
    }
}