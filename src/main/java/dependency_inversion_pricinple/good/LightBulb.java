package dependency_inversion_pricinple.good;

class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb is turned on");
    }

    public void turnOff() {
        System.out.println("LightBulb is turned off");
    }
}
