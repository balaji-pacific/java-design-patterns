# java-design-patterns

Creational Design Pattern

	• Deals with Object creational mechanism.
	• Reducing the complexity in the controlled manure.
	• The new operator is often considered harmful as it scatted across the application. And it is tightly coupled with. And it is hard to change the implementation if we want to.
	• This design pattern address the issue by decoupling the client.

	1. Factory
		Define the factory methos inside the interface or abstract class.
		And let sun class or a concrete class decide which object to create.
	2. Abstract Factory
		a. It’s a super factory.
		b. It creates factory. And that factory will create factory of factory's…
		c. Interface is taking care of creating object without explicitly specifying their classes.
		d. Each generated factory will give the objects as per the factory pattern.
	3. Singleton
		Create the object instance and maintain the object instance through out the application till the JVM dies.
	4. Builder
		Used for constructing a complex object.
		
	5. Prototype 
		a. Prototype design pattern is generally used when we have object instance already and wanted to create similar object by just cloning it.

It is very useful if we have a expensive object like calling DB and initialize it and we have a scenario to create the similar object multiple times then Prototype is very useful.



Structural Design Pattern:

	1. Adapter Design Pattern:
		a. It’s a bridge between two in compactable interfaces.
		b. Adaptor class can wraps the existing class with the new interface. So that it become compactable with client interface.
		c. For Example Duck and Turkey is the inteface, we can adopt turkey to duck and make sure passing the turkeyObject as duck.
	2. Bridge
		Bridge design pattern can split the business logic or big class into separate class hierarchies that can be developed independently. 
		The Class hierarchies are Abstraction and Implementations. The abstraction can delegate some of its call to implementation. 
			
	3. Composite
	4. Decorator
	5. Façade
	6. Flyweight
Proxy