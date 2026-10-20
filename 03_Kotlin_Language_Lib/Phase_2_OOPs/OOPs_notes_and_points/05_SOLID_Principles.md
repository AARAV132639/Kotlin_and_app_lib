# SOLID Principles

- Single Responsibility Principle (SRP)
- Open Closed Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)

## Central Idea

- Write software so that each component has a clear responsiblity, dependencies are manageable, and new requirements can be accomodated without destabilizing existing functionality.

### Single Responsibiliyt Principle (SRP)
- Seperate reasons to change.
- A class should have one well-defned responsibility, or one reason to change.
- Ask: Is this class handling unrelated responsibilities?

### Open/ Closed Principle(OCP)
- Add behaviour without repeatedly rewriting stable code.
- Software components should be open for extension but closed for modifications
- Ask: Can I add a new behaviour without repeatedly editing stable code?

### Liskov Substitution Principle (LSP)
- Inheritance must preserve behavioral expectations
- An object of a subtupe should be usable wherever its parent type is expected, without breaking the program's expected behaviour
- Ask: Does this subclass genuinely honour its parent's contract?

### Interface Segregation Principle(ISP)
- Give clients only the contracts they need.
- Clients should not be forced to depend on methods they do not need
- Ask: Is an interface forcing a class to implement irrelevant operations?

### Dependency Inversion Principle
- Business policies should not be traped by implementation details
- High level busniness logic should depend on abstractions rather than directly depending on low-level implementation details
- Ask: Can I replace a database, payment provider, or notification service without rewriting my business logic?

*SOLID principles are about designing object-oriented software so that responsibilites remain clear, dependencies remain controlled, and changes do not unnecessarily ripple through the system.*

## Big Picture: Where SOLID fits

1. *Programming Fundamentals* : variables, functions, data structures, control flow

2. *Object Oriented Programming* : Classes, objects, encapsulation, inheritance, polymorphism

3. **SOLID Principles** : Responsibility, extensibility, substitutability, interfaces, dependencies

4. *Software Desing & Architecture*: Design patterns, modularity, layered architecture, testing, maintainability

5. *Software Engineering in Practice*: Requirements, Version control, testing, deployment, evolution, teamwork

## Key Terminologies

### Layer 1: OOP fundamentals

1. *Classes & Objects* : Blueprint versus instance

2. *Encapsulation*: Protecting state and controlling access

3. *Abstraction* : Exposing essential behaviour while hiding details

4. *Inheritance*: Deriving a type from another type

5. *Polymorphism*: Using a different implementations through a common type

6. *Interface & Abstract Class*: Contracts versus partially implemented base types

7. *Composition* : Building behaviour by combining objects

8. *Association, Aggregation & Composition*: Relationships and ownership between objects

### Layer 2: Core SOLID vocabulary

1. *Responsibility & Reason to Change* : SRP

2. *Cohesion* : How closely related a module's responsibilities are

3. *Coupling* : How strongly modules depend on each other

4. *Extension point* : Where new behavior can be added

5. *Behavioral Subtyping*: Whether a subtype preserves expected behaviour

6. *Precondition, Postconditon & Invariant*: Rules that operations and objects must respect

7. *Interface Segregation* : Seperating contracts by clients needs.

8. *Dependency Inversion*: Seperating high - level policy from implementation details

### Layer 3: Dependency management
- How components connect?

1. *Dependency*: A component's reliance on another componet

2. *Concrete Dependency*: Depending directly on a specific implementation

3. *Abstraction/contract*: A stable description of expected behaviour

4. *Dependency Injection* (DI): Supplying dependencies from outside

5. *Inversion of Control*(IoC): Delegating control to a framework or external mechanism

6. *Constructor Injection*: Providing dependencies when an object is created

7. *Dependency Graph* : The network of relationships between components

8. *Seperation Of Concerns*: Keeping distinct aspects of a system seperate.