package String;

public class ValidPalindrome {
    static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
     public static boolean isPalindrome(String s) {
         s=s.toLowerCase();

         StringBuilder correctString= new StringBuilder();
         for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(Character.isLetterOrDigit(ch)){
                 correctString.append(ch);
             }
         }
         int start=0;
         int last=correctString.length()-1;

         while (start<last){
            if(correctString.charAt(start)!= correctString.charAt(last)){
                return false;
            }
            else{
                start++;
                last--;
            }
         }
         return true;
     }

}
