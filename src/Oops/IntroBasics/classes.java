package Oops.IntroBasics;

public class classes {
    public static void main(String[] args) {
        Student Beginner=new Student();
        Beginner.roll= 1;
        Beginner.name="Basics";
        Beginner.mark=50;
        System.out.println(Beginner.roll);
        System.out.println(Beginner.name);
        System.out.println(Beginner.mark);
        System.out.println();

        Student Mani=new Student();
        System.out.println(Mani.roll);
        System.out.println(Mani.name);
        System.out.println(Mani.mark);
        Student.greeting(Mani.name);
        System.out.println();

        Student Ragul=new Student(22,"Ragul Kannan",91.4);
        System.out.println(Ragul.roll);
        System.out.println(Ragul.name);
        System.out.println(Ragul.mark);
        Ragul.greeting();


    }
    static class Student{
        int roll;
        String name;
        double mark;

        static void greeting(String name){
            System.out.println("My fav sudent is "+ name);
        }

        void greeting(){
            System.out.println("My fav sudent is "+ this.name);
        }

        Student(){
            this.roll=21;
            this.name="Manikandan";
            this.mark=89.8;
        }

        Student(int rol,String name,double mark){
            roll=rol;
           this.name=name;
           this.mark=mark;
        }
    }
}
