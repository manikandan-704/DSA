package LinearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int [] array={1,4,6,8,0,56,4,3};
        int index=linearsearch(array,56);
         System.out.println(index);
    }

    private static int linearsearch(int[] array , int val){
        for(int i=0;i<array.length;i++){
            if(array[i]== val){
                return i;
            }
        }
        return -1;
    }
}
