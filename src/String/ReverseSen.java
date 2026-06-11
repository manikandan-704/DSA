package String;

import java.util.Arrays;

public class ReverseSen {
    static void main(String[] args) {
        String s="Java is Best";
        System.out.println(revSen(s));
    }
    static String revSen(String s){
        String[] str=s.trim().split(" ");
        StringBuilder result=new StringBuilder();
        for(int last= str.length-1;last>=0;last--){
            result.append(str[last]);
            if(last>0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
