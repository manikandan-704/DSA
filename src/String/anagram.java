package String;

import Oops.Interfaces.NestedInterface.A;

import java.util.Arrays;

public class anagram {
    static void main(String[] args) {
        String s1="anagram";
        String s2="ramana";
        System.out.println(anagramMethod1(s1,s2));
        System.out.println(anagramMethode2(s1,s2));
    }

    public static Boolean anagramMethod1(String s1,String s2){
        int[] count=new int[26];

        for(char c: s1.toCharArray()){
            count[c-'a']++;
        }

        for(char c:s2.toCharArray()){
            count[c-'a']--;
        }

        for(int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

    public static Boolean anagramMethode2(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;

        char[] s=s1.toCharArray();
        char[] t=s2.toCharArray();

        Arrays.sort(s);
        Arrays.sort(t);

        return Arrays.equals(s, t);
    }
}
