package dependency_inversion_pricinple.good;

// GOOD: High-level class depends on an abstraction, not a concrete class.
interface Switchable {
    void turnOn();

    void turnOff();
}
