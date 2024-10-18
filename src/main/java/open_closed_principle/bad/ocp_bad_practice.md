### Why it's bad:

The `AreaCalculator` class is not closed for modification. Every time a new shape is added, the method `calculateArea` needs to be changed, violating the **Open/Closed Principle (OCP)**. The OCP states that a class should be open for extension but closed for modification. By having to modify the `AreaCalculator` each time a new shape is introduced, we risk:

- **Introducing Bugs:** Changes in the existing logic may unintentionally break the current functionality.
- **Reduced Maintainability:** The class becomes harder to maintain as it grows with more shape types and logic.
- **Scalability Issues:** Extending the functionality to support new shapes requires modifying the class, which limits its scalability and flexibility.
- **Code Duplication:** The logic for each shape’s area calculation may get tangled within the same method, making the code harder to read and increasing the risk of code duplication.

This design leads to a rigid and error-prone system, which is not adaptable to changes.
