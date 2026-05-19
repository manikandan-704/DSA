package Oops.CollegeManagement;

public class GraduateStudents extends Student{
    private String Project;

    //Constructor
     GraduateStudents(int id, String name, String dept, int mark, String project) {
        super(id, name, dept, mark);
        Project = project;
    }

    public GraduateStudents() {

    }

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }

    // Methode Overriding (Runtime Polymorphism)
    @Override
    void display(){
        System.out.println(college);
        System.out.println("Student Details");
        System.out.println("ID: "+ getStudentId());
        System.out.println("Name: "+ getName());
        System.out.println("Department: "+getDept());
        System.out.println("Mark: "+getMark());
        System.out.println("Project Title: "+getProject());
    }
}
