package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> Numbers=new ArrayList<>();

        System.out.println("Enter the number to add on ArrayList:");
        int size =sc.nextInt();

        for(int i=0 ; i<size ; i++){
            System.out.println("Enter the number to add on ArrayList:");
            int add=sc.nextInt();
            Numbers.add(add);
        }
        System.out.println(Numbers);

        sc.close();
    }
}
