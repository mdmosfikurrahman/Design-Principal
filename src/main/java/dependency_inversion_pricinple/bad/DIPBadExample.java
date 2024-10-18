package dependency_inversion_pricinple.bad;

public class DIPBadExample {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);
        lightSwitch.operate("on");
        lightSwitch.operate("off");
    }
}

