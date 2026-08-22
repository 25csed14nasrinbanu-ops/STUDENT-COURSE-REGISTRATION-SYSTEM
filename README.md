# Student Course Registration System

A Java-based console application for student course registration that allows students to view available courses, register for courses, drop courses, and manage their course registrations.

## Features

- ✅ **View Available Courses** - Display all available courses with details (code, title, description, capacity, schedule)
- ✅ **Register for Courses** - Students can register for available courses with capacity management
- ✅ **Drop Courses** - Remove registered courses and free up capacity
- ✅ **View Registered Courses** - Display all courses a student is registered for
- ✅ **Duplicate Prevention** - Prevents students from registering for the same course twice
- ✅ **Capacity Management** - Automatically manages course capacity and prevents over-registration

## How to Compile and Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line/Terminal

### Steps to Run

1. **Compile the program:**
   ```bash
   javac StudentCourseRegistration.java
   ```

2. **Run the program:**
   ```bash
   java StudentCourseRegistration
   ```

3. **Follow the menu prompts:**
   - Enter your Student ID and Name when prompted
   - Choose from the menu options (1-5)
   - Enter 5 to exit the system

## Usage Example

```
===== STUDENT COURSE REGISTRATION SYSTEM =====
Enter Student ID: 101
Enter Student Name: John Doe

===== MENU =====
1. Display Available Courses
2. Register for a Course
3. Drop a Course
4. View Registered Courses
5. Exit
Enter your choice: 1

----- AVAILABLE COURSES -----
Course Code: CS101
Title: Java Programming
Description: Introduction to Java programming
Available Slots: 3
Schedule: Monday - 10:00 AM

Course Code: CS102
Title: Data Structures
Description: Learn basic data structures
Available Slots: 2
Schedule: Wednesday - 2:00 PM

Course Code: CS103
Title: Operating Systems
Description: Learn operating system concepts
Available Slots: 2
Schedule: Friday - 11:00 AM
```

## Available Courses

| Course Code | Title | Description | Capacity | Schedule |
|------------|-------|-------------|----------|----------|
| CS101 | Java Programming | Introduction to Java programming | 3 | Monday - 10:00 AM |
| CS102 | Data Structures | Learn basic data structures | 2 | Wednesday - 2:00 PM |
| CS103 | Operating Systems | Learn operating system concepts | 2 | Friday - 11:00 AM |

## Project Structure

```
STUDENT-COURSE-REGISTRATION-SYSTEM/
├── StudentCourseRegistration.java  (Main application file)
├── README.md                       (This file)
└── .gitignore                      (Git ignore file)
```

## Classes Overview

### Course Class
- Stores course information (code, title, description, capacity, schedule)
- `display()` - Displays course details

### Student Class
- Stores student information (id, name, registered courses)
- `registerCourse(Course)` - Registers a student for a course
- `dropCourse(String)` - Drops a course by course code
- `viewRegisteredCourses()` - Displays all registered courses

### StudentCourseRegistration Class
- Main application class
- Handles user menu and interactions

## Future Enhancements

- [ ] Separate classes into individual files
- [ ] Add persistent data storage (database/file)
- [ ] Add student authentication/login
- [ ] Add course prerequisites
- [ ] Add grades/marks tracking
- [ ] Add admin features (add/remove courses, manage capacity)
- [ ] Add input validation and exception handling
- [ ] Create GUI version using Swing/JavaFX

## Author
25csed14nasrinbanu-ops

## License
This project is open source and available under the MIT License.
