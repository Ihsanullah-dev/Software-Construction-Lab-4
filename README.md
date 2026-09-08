# Lab Task 04 – Data Types, Mutability, and Collections

## University of Engineering and Technology, Abbottabad Campus

**Course:** Software Construction
**Lab Task:** 04 – Fall 2026
**Semester:** 5th Semester
**Subject:** Software Construction

---

## Objective

The objective of this lab is to apply concepts of mutability, interface implementations such as `List`, `Map`, and `Set`, and safe iterator traversal using Java Collections.

---

# Lab Tasks

## Lab Task 1 – Mutability & Performance

### Objective

To understand the difference between immutable `String` and mutable `StringBuilder` objects and compare their performance when generating a sequence of numbers.

### Implementation

The `StringPerformance` class contains two methods:

* `buildString(int n)` uses normal String concatenation.
* `buildStringBuilder(int n)` uses `StringBuilder.append()`.

Both methods generate numbers from `0` to `n`. Execution time is measured for `n = 10000` to observe the performance difference between immutable String concatenation and StringBuilder.

---

## Lab Task 2 – Safe Collection Modification

### Objective

To safely modify a Java collection while traversing it and avoid `ConcurrentModificationException` by using an `Iterator`.

### Implementation

The `CourseManager` class creates a list containing:

```text
[6.045, 6.005, 8.03, 6.813, 14.03]
```

Subjects starting with `"6."` are removed using an `Iterator` and `iter.remove()`.

The final list is:

```text
[8.03, 14.03]
```

This demonstrates safe collection modification using an Iterator.

---

## Lab Task 3 – Complex Data Types (Map)

### Objective

To understand how a `HashMap` can store key-value pairs and how map values can be updated and processed.

### Implementation

The `TreasureMap` class uses a `HashMap<String, Double>` with the following entries:

```text
beach = 25.0
palm = 50.0
cove = 75.0
```

The value of `"palm"` is updated by adding the current size of the map.

The values are then traversed using a for-each loop to calculate the total value.

After the update:

```text
palm = 53.0
```

The total value is:

```text
153.0
```

---

## Lab Task 4 – Unmodifiable Wrappers

### Objective

To implement runtime immutability by preventing modifications to a collection.

### Implementation

The `Zoo` class creates a mutable list containing:

```text
[lion, tiger, bear]
```

The list is returned using:

```java
Collections.unmodifiableList()
```

An attempt to add `"flamingo"` to the returned list is made. The operation throws `UnsupportedOperationException`, demonstrating that the returned list cannot be modified.

---

# Homework 1 – Enhanced Map Tracking

### Objective

To apply `Map` and `Set` concepts to track unique student records and protect the returned set of student IDs from modification.

### Implementation

The `StudentDirectory` class uses:

```java
Map<Integer, String>
```

The student ID is used as the key and the student's name is stored as the value.

The following method returns all student IDs:

```java
public Set<Integer> getAllIDs()
```

The returned set is wrapped using:

```java
Collections.unmodifiableSet()
```

This prevents users from modifying the returned set.

JUnit tests are included to verify this behavior.

---

# Homework 2 – Designing Immutable Classes

### Objective

To apply immutability principles and the `final` keyword when designing an immutable Java class.

### Implementation

A fully immutable `Point` class is implemented.

The class is declared as:

```java
public final class Point
```

The coordinates are declared as final:

```java
private final int x;
private final int y;
```

The class does not contain any setter or mutator methods. The coordinates are initialized through the constructor and accessed through getter methods.

This ensures that the state of a `Point` object cannot be changed after it has been created.

---

# Testing

JUnit tests are included to verify the implemented functionality.

The tests cover:

* String and StringBuilder output
* StringBuilder and String performance comparison
* Safe Iterator removal
* Treasure map value updates
* Treasure map total calculation
* Zoo unmodifiable list
* StudentDirectory operations
* Unmodifiable student ID set
* Point coordinates
* Point object behavior

All tests should pass successfully.

---

# How to Run

### Using NetBeans

1. Open the project in NetBeans.
2. Build the Maven project.
3. Run the individual Java classes to view their console output.
4. Right-click the project.
5. Select **Test** to run all JUnit tests.
6. Verify that the tests complete successfully with no failures or errors.

### Main Classes

```text
StringPerformance.java
CourseManager.java
TreasureMap.java
Zoo.java
StudentDirectory.java
Point.java
```

---

# Expected Results

### CourseManager

```text
Before removal:
[6.045, 6.005, 8.03, 6.813, 14.03]

After removal:
[8.03, 14.03]
```

### TreasureMap

```text
palm = 53.0
Total value = 153.0
```

### Zoo

```text
[lion, tiger, bear]

UnsupportedOperationException caught successfully.
```

### StudentDirectory

The student IDs are returned successfully, but attempting to modify the returned set results in:

```text
UnsupportedOperationException
```

---

# Reflection

Through this lab and homework, I gained practical understanding of Java data types, mutability, and collections. I learned the difference between immutable `String` objects and mutable `StringBuilder` objects and understood why `StringBuilder` can be more efficient when repeatedly modifying strings. I also learned how to safely modify a collection using an `Iterator` and `iter.remove()` instead of directly removing elements during a for-each loop, which helps avoid `ConcurrentModificationException`. The `HashMap` task improved my understanding of storing key-value pairs, updating values, and iterating through map values to calculate a total. I also learned how `Collections.unmodifiableList()` and `Collections.unmodifiableSet()` can prevent users from modifying collections at runtime. In the homework, I applied `Map` and `Set` concepts to create a student directory and learned how to protect the returned set of student IDs from modification. Finally, I learned how to design a fully immutable `Point` class by using the `final` keyword, final fields, and no setter methods. Overall, these tasks improved my understanding of safe data handling, collection management, mutability, and immutable object design in Java.

---

# Conclusion

This lab provided practical experience with Java mutability, String and StringBuilder performance, List, Map, Set, Iterator traversal, unmodifiable collections, and immutable class design. The implementation of the lab tasks and homework, along with JUnit testing, demonstrates the practical application of these Java concepts.

---


## Author

**Ihsanullah – 5th Semester Software Engineering**

**Lab Task 04 – Fall 2026**
