package Patterns;

public class pattens {
    public static void main(String[] args) {
    patten1();
    }
    static void patten1(){
        for(int r = 0; r< 5; r++){
            for(int c = 1; c<= 5 -r; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
