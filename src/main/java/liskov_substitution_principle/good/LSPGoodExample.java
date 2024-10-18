package liskov_substitution_principle.good;

public class LSPGoodExample {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly(); // Works fine

        Bird ostrich = new Ostrich();
        ostrich.eat(); // Works fine
    }
}