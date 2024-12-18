# Lab Exercise: Understanding Anonymous Classes in Java

## Objective:
- To understand and practice using anonymous classes in simple, real-world scenarios.
- To learn how anonymous classes can implement interfaces or extend classes without the need for creating a separate named class.

---

## Part 1: Implementing an Interface with an Anonymous Class

#### Task:
1. Create a simple interface `Shape` that has a method `draw()`.
2. Use **an anonymous class** to implement the `Shape` interface.
3. The anonymous class should override the `draw()` method to print `"Drawing the shape!"`.
4. Create a reference to `Shape` and assign the anonymous class to it. Then, call the `draw()` method.

---

## Part 2: Using an Anonymous Class to Extend a Class

#### Task:
1. Create a class `Animal` with a method `speak()` that prints `"Animal speaking"`.
2. Use **an anonymous class** to extend `Animal` and override the `speak()` method to print `"Dog barking!"`.
3. Create a reference to `Animal` and assign the anonymous subclass to it. Then, call the `speak()` method.

---

## Part 3: Simple Calculation with an Anonymous Class

#### Task:
1. Create a `Calculator` interface with a method `calculate(int a, int b)` that returns an `int`.
2. Use **an anonymous class** to implement the `Calculator` interface to perform addition.
3. Create another anonymous class to perform multiplication.
4. Test both anonymous classes by calling the `calculate()` method with two numbers and printing the results.

---

## Part 4: Understanding the Use of Anonymous Classes in Real-World Context

#### Scenario:
A simple **login validation system** uses an anonymous class to implement validation logic for different types of users (e.g., admin, guest).

#### Task:
1. Create an interface `UserValidation` with a method `validate(String username, String password)` that returns a `boolean`.
2. Use **an anonymous class** to implement the `UserValidation` interface to validate an `admin` user with username `"admin"` and password `"admin123"`.
3. Create another anonymous class to validate a `guest` user with username `"guest"` and password `"guest123"`.
4. Simulate login for both users by calling the `validate()` method and printing whether the login is successful.

