package liskov_substitution_principle.bad;

public class LSPBadExample {
    public static void main(String[] args) {
        Bird bird = new Ostrich();
        bird.fly();  // Will throw an exception
    }
}