HOSPITAL MEDICAL SYSTEM
Why is MedicalService declared abstract?

Because it represents a parent class that defines a common structure for all service and Each type of service calculates its total cost differently.

Can an object be created directly from MedicalService? Explain.

No we can't create. Because An object cannot be created directly from an abstract class. but we can create objects from its concrete subclasses.

What is the difference between an abstract method and a concrete method?

Abstract method: is a method without body or without implementation. Concrete method: is a method has body or method with implementation.

Why must each concrete subclass implement calculateTotalCost()?

Beacuse every sub class has different additional charges. so each concrete subclass must implement calculateTotalCost() to calculate the correct total cost.