### Why it's bad:

The `Switch` class is tightly coupled to the `LightBulb` class, violating the **Dependency Inversion Principle (DIP)**. This means that if we need to control a different device (e.g., a fan), we'd have to modify the `Switch` class, which leads to several issues:

- **Lack of Flexibility:** The `Switch` class is limited to controlling only `LightBulb`. To support other devices, like a fan, we would need to modify the `Switch` class, making the system less adaptable to change.
- **Violates Open/Closed Principle:** Since the `Switch` class would need to be changed whenever a new device is introduced, it violates the **Open/Closed Principle (OCP)**, as the class is not closed for modification.
- **Increased Maintenance:** Tight coupling between `Switch` and `LightBulb` means that any changes to the device being controlled require corresponding changes to `Switch`. This increases maintenance overhead and the risk of introducing bugs.
- **Reduced Reusability:** The `Switch` class can only be used with a `LightBulb`, making it less reusable in other contexts where different devices need to be controlled.

This tightly coupled design reduces the flexibility and scalability of the system, making it harder to adapt to new requirements.
