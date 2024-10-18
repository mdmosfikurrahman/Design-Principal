package interface_segregation_principle.good;

class Developer implements Workable, Eatable {
    public void work() {
        System.out.println("Developer is coding");
    }

    public void eat() {
        System.out.println("Developer is eating");
    }
}
