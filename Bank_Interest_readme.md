# Bank Interest Calculator System
A Java based banking system that demonstrates object oriented programming concepts such as abstraction, inheritance, polymorphism, method overriding, constructors, and conditional statements through a bank interest calculator.

## Overview
This program simulates different banks and calculates interest based on:
- Principal amount
- Time period (years)
- Bank-specific interest rates

Each bank has its own interest calculation logic implemented using separate classes.

## OOP Concepts Used

### Abstraction
An abstract class `Bank` is used as the parent class containing:
- Common attributes
- An abstract method:
```java
calculateInterest()
```

### Inheritance
The classes:
- `MCB`
- `HBL`
- `SCB`

are inherited from the class `Bank`.

### Method Overriding
Each bank overrides:
```java
calculateInterest()
```

to calculate interest differently according to its own conditions and rates.

### Runtime Polymorphism
Parent class references are used to store child class objects:

```java
Bank b1 = new MCB(100000, 6);
```

This allows different implementations of the same method to run at runtime.

### Conditional Statements
Each bank uses `if` conditions to modify interest rates depending on:
- Number of years
- Principal amount

## Banks & Interest Rates

| Bank | Base Interest Rate |      Special Condition      |
|------|--------------------|-----------------------------|
|  MCB |       6.4%         |      +1% if years > 5       |
|  HBL |       9.3%         | +0.5% if principal > 500000 |
|  SCB |       9.7%         |     +1.2% if years >= 10    |

## Formula Used
Interest = (Principal × Rate × Time) / 100

Where:
- **Principal** = Original deposited amount
- **Rate** = Interest percentage
- **Time** = Number of years

## How to Run

1. Compile the program
2. Run the program

## Author
Maham Zehra