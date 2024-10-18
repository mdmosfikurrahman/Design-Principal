package dependency_inversion_pricinple.good;

class Switch {
    private final Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(String action) {
        if (action.equalsIgnoreCase("on")) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
