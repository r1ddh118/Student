# Student
# Student Management System

## Overview
This project is a **Student Management System** written in Java. It allows users to add, display, search, update, and delete student records. The project follows **Object-Oriented Programming (OOP)** principles, ensuring encapsulation by using **getter and setter methods**.

## Project Structure
The system consists of three Java files:
1. `Student.java` - Defines the `Student` class with attributes and methods.
2. `StudentOperations.java` - Manages student records with operations.
3. `Main.java` - Provides a menu-based interface for user interaction.

---

## Class Descriptions & Methods

### 1️⃣ **`Student.java` (Student Class)**
This class represents a student and contains the following attributes:
- `String name` - Student's name.
- `long prn` - Unique PRN (Permanent Registration Number).
- `String dept` - Department of the student.
- `String batch` - Batch year of the student.
- `double cgpa` - CGPA of the student.

#### **Methods in `Student.java`**
| Method Signature | Description |
|-----------------|-------------|
| `public Student(String name, long prn, String dept, String batch, double cgpa)` | Constructor to initialize a student object. |
| `public String getName()` | Returns the student's name. |
| `public void setName(String name)` | Updates the student's name. |
| `public long getPRN()` | Returns the student's PRN. |
| `public void setPRN(long prn)` | Updates the student's PRN. |
| `public String getDept()` | Returns the student's department. |
| `public void setDept(String dept)` | Updates the student's department. |
| `public String getBatch()` | Returns the student's batch year. |
| `public void setBatch(String batch)` | Updates the student's batch year. |
| `public double getCGPA()` | Returns the student's CGPA. |
| `public void setCGPA(double cgpa)` | Updates the student's CGPA. |
| `public void display()` | Prints the student's details. |

---

### 2️⃣ **`StudentOperations.java` (Managing Student Records)**
This class contains an **ArrayList** to store student objects and provides functions to perform various operations.

#### **Methods in `StudentOperations.java`**
| Method Signature | Description |
|-----------------|-------------|
| `public void addStudent(Scanner scan)` | Adds a new student by taking input from the user. |
| `public void displayStudents()` | Displays all students in the system. |
| `public void searchByPRN(Scanner scan)` | Searches for a student by PRN. |
| `public void searchByName(Scanner scan)` | Searches for a student by name. |
| `public void updateStudent(Scanner scan)` | Updates student details based on PRN. |
| `public void deleteStudent(Scanner scan)` | Deletes a student by PRN. |

---

### 3️⃣ **`Main.java` (User Interface & Menu System)**
This class contains the **main method**, which provides a menu-driven interface for interacting with the system.

#### **Methods in `Main.java`**
| Method Signature | Description |
|-----------------|-------------|
| `public static void main(String args[])` | Entry point of the program. It displays the menu and handles user choices. |

---
