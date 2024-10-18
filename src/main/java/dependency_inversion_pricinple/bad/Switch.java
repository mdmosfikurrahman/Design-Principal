package dependency_inversion_pricinple.bad;

class Switch {
    private final LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate(String action) {
        if (action.equalsIgnoreCase("on")) {
            lightBulb.turnOn();
        } else {
            lightBulb.turnOff();
        }
    }
}
