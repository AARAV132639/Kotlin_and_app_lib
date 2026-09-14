# Overview & Essence

1. *Java's verobosity is largely a trade-off for maintainability*

In large codebase, explicit structure becomes valuable. One can look at a class and understand:

- what state it owns?
- who can modify that state?
- what operations are exposed?
- what dependencies it has?
- what contracts it follows?

2. *OOP isn't really about the four pillars individually*

- **AIM**: To design the code so that changes remain localized and don't cause a cascade of modifications

- OOP is a technique for managing complexity. It's four pillars: Encapsulation Polymorphism Abstraction &  Inheritance are the tools to achieve that.

- Further concept: OOP --> Modularity --> low coupling + high cohesion --> Maintainability --> Scalability

- Further topics: 
                1. SOLID
                2. DRY
                3. composition over inheritance
                4. dependency inversion
                5. dependency injection
                6. design patterns
                7. interfaces/contracts
                8. seperation of concerns
                9. clean architecture
    
    *Ulimately the goal is answer the same question*: 
            **How do we keep a large software system undestandable when it keeps changing?**

