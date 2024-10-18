### Why it's good:

The `Switch` class now depends on the `Switchable` interface, adhering to the **Dependency Inversion Principle (DIP)**. This design brings several key advantages:

- **Flexibility:** The `Switch` class can now control any device that implements the `Switchable` interface, such as a `LightBulb` or a `Fan`. This allows for easy swapping of devices without modifying the `Switch` class.
- **Adheres to Open/Closed Principle:** Since new devices can be added by implementing the `Switchable` interface, the `Switch` class remains **closed for modification** but **open for extension**, following the **Open/Closed Principle (OCP)**.
- **Increased Reusability:** The `Switch` class becomes more versatile and reusable across different contexts, as it can control a variety of devices, enhancing the overall system's adaptability.
- **Simplified Maintenance:** By decoupling `Switch` from specific devices, maintenance becomes easier. Changes to individual devices (e.g., `Fan` or `LightBulb`) do not require changes to the `Switch` class.
- **Cleaner Architecture:** This design encourages dependency on abstractions (`Switchable` interface) rather than concrete implementations, resulting in a more modular, loosely coupled system that is easier to manage and extend.

By following the DIP, this approach enhances the flexibility, scalability, and maintainability of the system.
