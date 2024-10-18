package dependency_inversion_pricinple.bad;

// BAD: High-level class depends directly on low-level class.
class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is turned on");
    }

    public void turnOff() {
        System.out.println("LightBulb is turned off");
    }
}
