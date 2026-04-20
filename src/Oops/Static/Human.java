package Oops.Static;

public class Human {
    int age;
    char gender;
    String name;
    static int present;

    public Human(int age,char gen,String name){
        this.age=age;
        this.name=name;
        this.gender=gen;
        present+=1;
    }
    Human (){
        name="Default name";
        age=0;
        gender='o';
        present+=1;
    }
}
