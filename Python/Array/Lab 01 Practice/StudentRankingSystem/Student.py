class Student:
    def __init__(self, id, name, gpa):
        self.name = name
        self.id = int(id)
        self.gpa = float(gpa)

    def getName(self):
        return self.name

    def getId(self):
        return self.id

    def getGpa(self):
        return self.gpa

    def __str__(self):
        return f"Student{{id={self.id}, name='{self.name}', GPA={self.gpa}}}"