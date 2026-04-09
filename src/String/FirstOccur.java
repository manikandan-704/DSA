package String;

public class FirstOccur {
    public static void main(String[] args) {
        String str1="sadbutsad";
        String str2="but";
        System.out.println(IndexOfFirstOccur(str1,str2));
    }
    static int IndexOfFirstOccur(String str1,String str2){
        int n=str1.length();
        int k=str2.length();
        for(int i=0;i<n-k;i++){
           if(str1.charAt(i)==str2.charAt(0)) {
               String sub = str1.substring(i, i + k);
               if(sub.equals(str2)){
                   return i;
               }
           }
        }
        return-1;
    }
}
