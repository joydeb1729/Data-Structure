public class StudentManager {

    private Student[] studentList;
    private int studentCount;

    public StudentManager(){
        studentList = new Student[5];
        studentCount = 0;
    }

    public void insertStudent(Student newStudent) {
        if (studentCount < studentList.length || newStudent.getGpa() > studentList[studentList.length - 1].getGpa()) {
            if (studentCount == studentList.length) {
                deleteStudent(studentList[studentList.length - 1].getId()); // Remove the student with the lowest GPA
            }

            int i;
            for (i = studentCount - 1; i >= 0; i--) {
                if (studentList[i] != null && (studentList[i].getGpa() < newStudent.getGpa() ||
                        (studentList[i].getGpa() == newStudent.getGpa() && studentList[i].getId() > newStudent.getId()))) {
                    studentList[i + 1] = studentList[i];
                } else {
                    break;
                }
            }
            studentList[i + 1] = newStudent;
            studentCount++;
        }
    }

    public void deleteStudent(int id) {
        int i;
        for (i = 0; i < studentCount; i++) {
            if (studentList[i].getId() == id) {
                break;
            }
        }
        if (i < studentCount) {
            for (int j = i; j < studentCount - 1; j++) {
                studentList[j] = studentList[j + 1];
            }
            studentList[studentCount - 1] = null;
            studentCount--;
        } else {
            System.out.println("Student not found.");
        }
    }

    public void updateStudent(int id, String newName, double newGpa) {
        deleteStudent(id);
        insertStudent(new Student(id, newName, newGpa));
    }

    public Student[] getTopStudents() {
        Student[] topStudents = new Student[Math.min(studentCount, 5)];
        for (int i = 0; i < topStudents.length; i++) {
            topStudents[i] = studentList[i];
        }
        return topStudents;
    }
}