## Student Record Manager with GPA Ranking and Array Manipulation

This project is a Python-based program that manages student records for a class that can hold up to 5 students at a time using a list of `Student` objects. The program provides methods to insert, delete, update, and search for student records, while maintaining the order based on GPA and student ID.

### Program Features

1. **`insert_student(student: Student)`**: Adds a new `Student` object to the class records. The list maintains the following order:
   - Students with higher GPAs are placed earlier in the list.
   - If two students have the same GPA, the one with the lower roll number comes first.
   - If a new student with a higher GPA is added and the class already has 5 students, the lowest GPA student is removed to maintain the size limit.

2. **`delete_student(student_id: int)`**: Removes a `Student` from the list by their student ID. After removing the student, all students behind that student in the list move one position forward. If the student is not found, a message is displayed.

3. **`update_student(student_id: int, new_name: str, new_gpa: float)`**: Updates the name and GPA of a `Student` by their student ID. After updating, the list is re-ordered according to the GPA and roll number rules mentioned above.

4. **`search_student(student_id: int)`**: Searches for a `Student` by their student ID and returns the student's details. If the student is not found, a message is displayed.

### Example Python Code

```bash


class Main:
    @staticmethod
    def run():
        manager = StudentManager()

        # Initial Insertion
        manager.insert_student(Student(101, "Alice", 3.8))   # Insert Alice with GPA 3.8
        manager.insert_student(Student(102, "Bob", 3.9))     # Insert Bob with GPA 3.9
        manager.insert_student(Student(103, "Charlie", 3.5)) # Insert Charlie with GPA 3.5
        manager.insert_student(Student(104, "David", 3.8))   # Insert David with GPA 3.8 (David placed after Alice due to roll number)
        manager.insert_student(Student(105, "Eve", 3.6))     # Insert Eve with GPA 3.6

        # Array is full. New insertion will remove the lowest GPA student
        manager.insert_student(Student(106, "Frank", 4.0))   # Insert Frank with GPA 4.0, Charlie will be removed (lowest GPA)

        # Deletion with students stepping back
        manager.delete_student(102)   # Remove Bob, all students behind him (David, Eve) should move one position forward

        # Insert a student with the same GPA as an existing student
        manager.insert_student(Student(107, "Grace", 3.8))   # Insert Grace with GPA 3.8, should be placed after Alice and David but before Eve (since Eve has a lower GPA)

        # Updating a student's GPA
        manager.update_student(101, "Alice Johnson", 4.0)   # Alice's GPA updated, reordering should happen

        # Display top 5 students
        for student in manager.get_top_students():
            print(student)


# Entry point of the program
if __name__ == "__main__":
    Main.run()

```

### Sample Output:

```bash
Student{id=101, name='Alice Johnson', GPA=4.0}
Student{id=106, name='Frank', GPA=4.0}
Student{id=104, name='David', GPA=3.8}
Student{id=107, name='Grace', GPA=3.8}
Student{id=105, name='Eve', GPA=3.6}

```