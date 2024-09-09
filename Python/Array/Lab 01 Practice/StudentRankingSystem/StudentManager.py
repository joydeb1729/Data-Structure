from StudentRankingSystem.Student import Student

class StudentManager:
    def __init__(self):
        self.studentList = [None] * 5
        self.studentCount = 0

    def insert_student(self, newStudent):
        if self.studentCount < len(self.studentList) or newStudent.getGpa() > self.studentList[self.studentCount-1].getGpa():
            if self.studentCount == len(self.studentList):
                self.delete_student(self.studentList[len(self.studentList)-1].getId())

            i = self.studentCount - 1
            while i >= 0 and (self.studentList[i] is not None and (self.studentList[i].getGpa() < newStudent.getGpa() or (self.studentList[i].getGpa() == newStudent.getGpa() and self.studentList[i].getId() > newStudent.getId()))):
                if i + 1 < len(self.studentList):
                    self.studentList[i + 1] = self.studentList[i]
                i -= 1
            
            if i + 1 < len(self.studentList):
                self.studentList[i + 1] = newStudent
            if self.studentCount < len(self.studentList):
                self.studentCount += 1

    def delete_student(self, id):
        for i in range(len(self.studentList)):
            if self.studentList[i] is not None and self.studentList[i].getId() == id:
                for j in range(i, len(self.studentList) - 1):
                    self.studentList[j] = self.studentList[j + 1]
                self.studentList[len(self.studentList) - 1] = None
                self.studentCount -= 1
                break

    def update_student(self, newId, newName, newGpa):
        self.delete_student(newId)
        newStudent = Student(newId, newName, newGpa)
        self.insert_student(newStudent)

    def get_top_students(self):
        topStudentList = []
        for i in range(min(self.studentCount, 5)):
            topStudentList.append(self.studentList[i])
        return topStudentList