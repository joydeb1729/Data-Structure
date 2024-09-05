## Task: Student Record Manager with GPA Ranking and Array Manipulation

Write a Java program that manages student records for a class that can only hold up to 5 students at a time using an array of `Student` objects. The program should include the following methods:

1. **insertStudent(Student student)**: Adds a new `Student` object to the class records. The array should maintain the following order:
   - Students with higher GPAs should be placed earlier in the array.
   - If two students have the same GPA, the one with the lower roll number should come first.
   - If a new student with a higher GPA is added and the class already has 5 students, the lowest GPA student will be removed to maintain the size limit.

2. **deleteStudent(int studentId)**: Removes a `Student` from the array by their student ID. After removing the student, all students behind that student in the array should move one position forward (step back by 1 index). If the student is not found, display a message.

3. **updateStudent(int studentId, String newName, double newGPA)**: Updates the name and GPA of a `Student` by their student ID. After updating, the array should be re-ordered according to the GPA and roll number rules mentioned above.

4. **searchStudent(int studentId)**: Searches for a `Student` by their student ID and returns the student's details. If the student is not found, display a message.

### Example Java Code:

```bash


public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Initial Insertion
        manager.insertStudent(new Student(101, "Alice", 3.8));   // Insert Alice with GPA 3.8
        manager.insertStudent(new Student(102, "Bob", 3.9));     // Insert Bob with GPA 3.9
        manager.insertStudent(new Student(103, "Charlie", 3.5)); // Insert Charlie with GPA 3.5
        manager.insertStudent(new Student(104, "David", 3.8));   // Insert David with GPA 3.8 (David placed after Alice due to roll number)
        manager.insertStudent(new Student(105, "Eve", 3.6));     // Insert Eve with GPA 3.6

        // Array is full. New insertion will remove the lowest GPA student
        manager.insertStudent(new Student(106, "Frank", 4.0));   // Insert Frank with GPA 4.0, Charlie will be removed (lowest GPA)

        // Deletion with students stepping back
        manager.deleteStudent(102);   // Remove Bob, all students behind him (David, Eve) should move one position forward
        
        // Insert a student with the same GPA as an existing student
        manager.insertStudent(new Student(107, "Grace", 3.8));   // Insert Grace with GPA 3.8, should be placed after Alice and David but before Eve (since Eve has a lower GPA)

        // Updating a student's GPA
        manager.updateStudent(101, "Alice Johnson", 4.0);   // Alice's GPA updated, reordering should happen

        // Display top 5 students
        for (Student student : manager.getTopStudents()) {
            System.out.println(student);
        }
    }
}

```

### Sample Output:

```bash
Student{id=101, name='Alice Johnson', GPA=4.0}
Student{id=106, name='Frank', GPA=4.0}
Student{id=104, name='David', GPA=3.8}
Student{id=107, name='Grace', GPA=3.8}
Student{id=105, name='Eve', GPA=3.6}

```