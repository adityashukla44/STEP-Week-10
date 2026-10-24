# Week 10 Practice — Concept Question Answers

### 1. String immutability and performance
A Java `String` cannot be changed after creation; operations such as concatenation produce another string instead. Repeated concatenation in a loop can create many temporary objects and extra copying. Use `StringBuilder` for repeated modifications, then call `toString()` when the final text is ready.

### 2. The `this` keyword in constructors
`this.field` refers to the current object's field, while a same-named parameter refers to the local parameter. For example, `Student(String name) { this.name = name; }` stores the parameter in the object's field instead of assigning the parameter to itself.

### 3. Object vs. reference variable
An object is the instance with its own state; a reference variable stores a value that identifies which object to access. Assigning `w2 = w1` copies the reference value, not the object, so both variables refer to the same instance and changes through either reference are visible through the other.

### 4. Static vs. instance variables
A static variable belongs to the class and is shared by all its instances, so it suits a shared counter or constant. An instance variable belongs to one object, so it suits a student's name, marks, or an individual wallet balance.

### 5. `for`, `while`, and `do-while`
A `for` loop is convenient when initialization, condition, and update are tied to a known counter. A `while` loop is useful when repetition depends on a condition and the number of iterations is not known in advance. A `do-while` loop executes its body at least once, which fits menu prompts or input validation that must run before checking the condition.

### 6. Pass-by-value in Java
Java always passes arguments by value. For a primitive, the method receives a copy of the number or boolean, so changing its parameter does not change the caller's variable. For an object, the copied value is the reference; the method can modify the same object's mutable fields, but reassigning its local reference does not reassign the caller's variable.

### 7. Integer division and casts
Dividing two integers discards the fractional part, so `250 / 3` evaluates to `83`. To keep the fractional component, make at least one operand floating-point before division, such as `(double) 250 / 3`, which evaluates to approximately `83.3333`.

### 8. Encapsulation and access modifiers
Encapsulation keeps an object's state and its operations together and controls access to that state. Making a field `private` prevents direct external modification; public methods can validate inputs before updating it, preserving invariants. Getters expose only the required read access, and setters should be added only when controlled mutation is appropriate.

### 9. `==` vs. `equals()`
For objects, `==` checks whether two references point to the same object. `equals()` checks logical equality as defined by the class; String overrides it to compare character contents. A class can override `equals()` (and should generally also override `hashCode()`) to define equality based on meaningful fields.

### 10. Overloading vs. overriding
Overloading defines methods with the same name but different parameter lists, and the compiler chooses a matching overload at compile time. Overriding replaces an inherited instance-method implementation in a subclass, and runtime dispatch chooses the implementation based on the actual object. For example, `print(int)`/`print(String)` are overloaded; `Dog.sound()` overriding `Animal.sound()` is overriding.
