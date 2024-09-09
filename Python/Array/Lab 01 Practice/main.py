from StudentRankingSystem.Student import Student
from StudentRankingSystem.StudentManager import StudentManager

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