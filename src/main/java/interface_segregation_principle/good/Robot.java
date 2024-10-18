package interface_segregation_principle.good;

class Robot implements Workable {
    public void work() {
        System.out.println("Robot is working");
    }
}
