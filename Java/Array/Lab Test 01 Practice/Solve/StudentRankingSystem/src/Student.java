public class Student {

    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getGpa(){
        return this.gpa;
    }
    public String toString(){
        String result = "Student{id=" + this.id + ", name='"+ this.name + "'" + "', GPA=" + this.gpa +"}";
        return result;
    }
}
