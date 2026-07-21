# Memory and Object Lifestyle 

## 1. The Big Picture

*How an object comes into existence, lives in memory, gets copied or moved and finally dies*

1. *Stack vs Heap* : Where does the object's memory live?

2. *Object Creation* : When does the object come into existence?

3. *Constructor* : How is it initialized?

4. *Copy Constructor*: How is a new object created from another?

5. *Assignment Operator*: How is an existing object updated from another?

6. *Shallow Copy* : What happens if internal resources are merely shared?

7. *Deep Copy* : How do we create independent ownership of resources?

8. *Move Semantics*: How can ownership be transferred efficiently without copying?

9. *Destructor*: How are owned resources releaseed when object's lifetime ends?


## 2. Important One- Lines

1. *Stack Memory* is automatically managed and follows LIFO

2. *Heap memory* is dynamically allocated and must be managed explicitly (or via smart pointers)

3. *Constructor* initialzes an object at creation

4. *Destructor* cleans up an object before it is destroyed

5. *Copy Constructor* initializes a new object from an existing object

6. *Copy Assignemnt* operator copies data into an existing object

7. *Shallow copy* copies pointer, addresses, causing shared ownership

8. *Deep copy* duplicates the underlying resource, creating independent ownership

9. *Move Semantics* transfers ownership instead of copying resources, improving performance

10. *RAII* ties resource management to object lifetime: acquire in the constructor, release in the destructor

## 3. Important Definitions

### Memory:

            - Collection of storage locations used to store data and program object during execution

            - Every object occupies memory.

            - Object's size determines how much memory it needs

            - An object's lifetime determines how long that memory remains allocated

### Stack Memory

            - Stack is a region of memory used for automatic storage of local variablles and function call information

            - Automatic allocation and deallocation

            - Fast Access

            - Limited Size

            - Managed by compiler/runtime. No manual memory management

            - Lives until the scope (or function) ends

            - `void fun() { int x =10}` x is automatically destroyed when fun() returns

### Heap Memory

            - Heap is a region of memory used for dynamic memory allocation during runtime

            - Allocatd manually (new) or by allocators

            - Release manually (delete) in C++ (unless managed by smart pointers)

            - Larger than stack

            - Slower than stack

            - Flexible lifetime

            - int *p = new int(5); delete p;

### Object

            - An object is an instance of a class that occupies memory and contains its own data and behaviour

            - Class ---> Blueprint ---> Object ---> Actual Memory

### Object Lifetime

            - Object Lifetime is the period between an object's creating and destruction

            - Stages:
                    o Memory allocation

                    o construction

                    o Usage

                    o Destruction

                    o Memory Release

### Constructor

            - Constructor is a special member that initalizes an object automatically when it is created

            - Same name as class

            - No return type

            - Runs automatically

            - Can be overloaded

            - Purpose : Initialize resources

### Destructor:

            - A destructor is a special member function that executes automatically when an object is destroyed

            - Begis with ~

            - No arguments or return type

            - Only one destructor per class

            - Purpose : Release owned resources

### Copy Constructor:

            - A copy constructor creates a new object by copying an existing object

            - ClassName (const ClassName& other);

            - Triggered when: Student s2 = s1; || Student s2(s1)

            - Purpose: Initialize a new object from an existing one

### Assignment Operator:

            - The copy assignment operator copies the contents of one existing object into another existing object.

            - Student& operator = (const Student& other);

            - Triggered: s2 =s1;

            - Copy constructor: Creates a new object

            - Assignment Operator: Copies into an existing object

### Shallow Copy:

            - A shallow copy copies member values directly, including pointer address. Hence sharing same memory

            - Problem: Double deletion, Dangling Pointer, Unexpected modifications

            - Copies addresses

            - Shared Ownnership

            - Unsafe for raw pointers

### Deep Copy:

            - A deep copy duplicates both the object and the resources it owns.

            - Advantages: Safe, Independent objects, No shared ownership

            - Copies data

            - Seperate memory

            - Independent ownership

### Move Semantics:

            - Move semantics transfers ownership of resources from one object to another instead of copying them.

            - Purpose: Avoid expensive copying

            - E.g. Instead of copy 1GB ... Move: Transfer pointer

            - Rvalue reference (&&)

            - Ownership transfer

            - Performance Optimization

            - No deep copy

### Resource:

            - A resource is anything that must be acquired and later released by program

            - Heap memory, File handles, Database Connections, Network Sockets, Mutexes

            - Key Idea: Objects often manage resources

### Resource Ownership

            - Ownership specifies which object is responsible for releasing a resource

            - E.g. who calls: delete ptr;

            - Single owner

            - Lifetime management

            - Prevent leaks

### Memory Leak

            - A memory leak occurs when dynamically allocated memory is no longer accessile but has not been released

            - E.g.: int *p = new int; p = nullprt;

            - Heap memory

            - Lost reference

            - Memory not freed

### Dangling Pointer

            - A dangling pointer points to memory that has already been deallocated

            - Example: delete p; // p still contains old address

            - Invalid pointer

            - Undefined behaviour

### RAII (Resource Acquisition Is Initialization)

            - RAII is a C++ idiom where resource acquisition occurs during object construction and resource release occurs during destruction

            - Purpose: automatically manage resources through object lifetime

            - Exception safety

            - No manual cleanup

            - Prevents resource leaks

### Rule of Three

            - If a class defines any one of: Destructor, Copy constructor, Copy assignment operator. It usually needs to define all three

            - Because the class likely manages a resource(such as heap memory) and the default compiler-generated versions may perform incorrect shallow copies

### Rule of Five

            - If a class manages resources in modern C++, it may need to define: Destructor|| Copy Constructor|| Copy assignment Operator|| Move constructor|| Move assignment operator

            - Purpose: Support both correct copying and efficient moving.

### 20. Rule of Zero:

            - Design classes so they don't directly manage resources.

            - Instead, use standard libaray types(e.g. std::string, std::vector, std::unique_ptr) that already handle resource management correctly

            - Less code
            - Fewer bugs
            - Automatic Support for copy/move operations where appropriate
