package dependency_inversion_pricinple.good;

public class DIPGoodExample {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);
        lightSwitch.operate("on");
        lightSwitch.operate("off");
    }
}
