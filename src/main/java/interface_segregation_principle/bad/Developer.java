package interface_segregation_principle.bad;

public class Developer implements Worker {
    public void work() {
        System.out.println("Developer is coding");
    }

    public void eat() {
        System.out.println("Developer is eating");
    }
}