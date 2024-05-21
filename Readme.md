O: Open/Closed Principle (OCP)
Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

This means the design of a software entity should be such that you can introduce new functionality or behavior without modifying the existing code since changing the existing code might introduce bugs.

By introducing an abstraction (Shape class) and separating the concrete implementations (Rectangle and Circle classes), we can add new shapes without modifying the existing code.

The ShapeCalculator class can now work with any shape that implements the Shape interface, allowing for easy extensibility.