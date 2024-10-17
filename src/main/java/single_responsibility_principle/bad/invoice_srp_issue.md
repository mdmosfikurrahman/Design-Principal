### Why it's bad:

The `Invoice` class has multiple responsibilities:
- Calculating the total
- Printing the invoice
- Saving it to the database

This violates the **Single Responsibility Principle (SRP)** because if the way to print or save changes, we need to modify the `Invoice` class.
