# JAVA-Project
# Student Management System Using Java

A simple console-based Student Management System developed using Core Java for B.Tech CSE.

**Project Overview**

The Student Management System is a Java application designed to manage student records efficiently. It allows users to add, display, search, update, and delete student information.

The project uses Object-Oriented Programming (OOP), ArrayList, and file handling to store and manage student data.

 **Objectives**
* To develop a student record management system using Java.
* To understand Object-Oriented Programming concepts.
* To implement CRUD operations.
* To store student records using file handling.
* To improve programming and problem-solving skills.

**Features**

* Add new student records.
* Display all student records.
* Search students by ID.
* Update student information.
* Delete student records.
* Save records in a text file.
* Load records when the application starts.

 **Technologies Used**

| Technology      | Purpose                   |
| --------------- | ------------------------- |
| Java            | Programming language      |
| JDK 17 or later | Compilation and execution |
| VS Code         | Code editor               |
| ArrayList       | Store student objects     |
| File Handling   | Save and load records     |

 **Project Structure**

```text
StudentManagementSystem/
│
├── Student.java
├── StudentManagementSystem.java
├── students.txt
└── README.md
```

 **Requirements**
Before running the project, install:

1. Java JDK 17 or later.
2. Visual Studio Code.
3. Extension Pack for Java in VS Code.

 **How to Run**

### Step 1: Clone or Download the Project

Download the project files and open the project folder in VS Code.

### Step 2: Open Terminal

In VS Code, select:

```text
Terminal → New Terminal
```

### Step 3: Compile the Java Files

```bash
javac Student.java StudentManagementSystem.java
```

### Step 4: Run the Application

```bash
java StudentManagementSystem
```

 **Application Menu**

================================
     STUDENT MANAGEMENT SYSTEM
================================
1. Add Student
2. Display Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
================================
Enter your choice:
```
 **Sample Student Record**

| Field      | Example         |
| ---------- | --------------- |
| Student ID | 1               |
| Name       | Prachi Rout     |
| Course     | BTech CSE AI ML |
| Marks      | 95              |

 **Concepts Used**

* Classes and Objects
* Encapsulation
* Constructors
* Methods
* ArrayList
* Loops
* Conditional Statements
* Switch Case
* Exception Handling
* File Handling

 **Data Storage**

Student records are saved in a file named `students.txt`.

Example:

```text
1|Prachi Rout|BTech CSE AI ML|95.0
6|Sonu|BTech ECE|98.0
```

**CRUD Operations**

| Operation | Description               |
| --------- | ------------------------- |
| Create    | Add a new student         |
| Read      | Display or search records |
| Update    | Modify student details    |
| Delete    | Remove a student          |

 **Advantages**

* Easy to use.
* Beginner-friendly Java project.
* Reduces manual record management.
* Demonstrates real-world application of Java.
* Stores data for future use.

**Limitations**

* Console-based interface.
* No login system.
* Uses a text file instead of a database.
* Basic student information only.

 **Future Scope**

* Add Java Swing or JavaFX GUI.
* Connect with MySQL using JDBC.
* Add student attendance management.
* Implement login and authentication.
* Add grade calculation.
* Export records to PDF or CSV.

 **Author**

Name: Prachi Rout

Course:B.Tech CSE AI & ML

**Project**: Student Management System Using Java

 **Acknowledgement**
This project was developed to gain practical knowledge of Core Java, Object-Oriented Programming, and file handling.
