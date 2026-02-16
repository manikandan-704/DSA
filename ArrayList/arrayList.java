package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args){

        //ArrayList is a resizeable array that stores object
        //Arrays are fixed size but "ArrayLists" are size can be change

        ArrayList<String> foods=new ArrayList<>();
        
        foods.add("Pizza");          //add the object at the end od an ArrayList
        foods.add("Burgur");
        foods.add("Pastha");

        foods.remove(1);         //removes the object

        foods.set(1,"Burgur");     //set the oject to the index  

        System.out.println(foods.get(2));   // insert the object at the index position

        System.out.println(foods.size());   //enters the size of an arrayList

        System.out.println(foods);

        Collections.sort(foods);     //arrange in acending order

    }
}
