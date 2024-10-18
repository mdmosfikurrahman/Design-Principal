### Why it's bad:

The `Ostrich` class violates the **Liskov Substitution Principle (LSP)** because it cannot behave like a typical `Bird`. The LSP states that subclasses should be able to replace their parent class without altering the correct behavior of the program. In this case, the `Ostrich` cannot fly, which breaks the expected behavior of a `Bird` in contexts where flying is assumed.

**Consequences include:**

- **Incorrect Assumptions:** Code that works with the `Bird` class might assume all birds can fly, leading to errors when substituting with an `Ostrich`.
- **Tight Coupling:** It forces changes in the code that relies on `Bird` behavior, violating the principle of relying on abstractions and introducing tight coupling.
- **Code Complexity:** Special cases or checks (e.g., "can this bird fly?") might need to be added to handle the `Ostrich`, making the code more complex and error-prone.
- **Violation of Expected Behavior:** The expected behavior of a bird (like flying) is not upheld, leading to potential bugs or failures when polymorphism is used.

This violation indicates that the `Ostrich` class should either not inherit directly from `Bird` or the design needs to be refined to avoid the assumption that all birds can fly.
