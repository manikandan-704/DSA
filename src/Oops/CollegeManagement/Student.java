package Oops.CollegeManagement;

public class Student {
    //  private variables (Encapsulation)
    private int StudentId;
    private String Name;
    private String Dept;
    private int Mark;

    // static variable
    static String college="Engineering College";

    // Default Constructor
    Student(){
        StudentId=0;
        Name="Unknown";
        Dept="not assigned";
        Mark=0;
    }

    // constructor Overloading
    Student(int id, String name){
        this.StudentId=id;
        this.Name=name;
    }

    // constructor Overloading
    Student(int id, String name, String dept, int mark){
        StudentId=id;
        Name=name;
        Dept=dept;
        Mark=mark;
    }

    // Getters and Setters
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }
    public void setMarks(int mark) {
        if(mark >= 0 && mark <= 100) {
            this.Mark = mark;
        }
        else {
            System.out.println("Invalid Marks");
        }
    }

    // Methode Overloading
    void display(String msg){
        System.out.println(msg);
        display();
    }

    // Methode Overloading
    void display(){
        System.out.println(college);
        System.out.println("Student Details");
        System.out.println("ID           : " + StudentId);
        System.out.println("Name         : " + Name);
        System.out.println("Department   : " + Dept);
        System.out.println("Marks        : " + Mark);
    }

    void display(int bonusMark){
        System.out.println("Bonus Mark: ");
        Mark=Mark+bonusMark;
        System.out.println("Updated Mark: "+ Mark);
        display();
    }
}
