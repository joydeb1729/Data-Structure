
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
