package BinarySearch;

public class BinarySearch1 {
    public static void main(String[] args) {
        int [] array1=new int[100000];
        int target=9999;
        int index=binarySearch(array1, target);

    }
   
    private static int binarySearch(int []array1, int target){
        int left=array1[0];
        int right=array1.length-1;
       
           while(left<=right){
            int mid=left-(right+left)/2;
            int midval=array1[mid];
            System.out.println("middle values" + midval);
            if(midval<target){
                left=mid+1;
            }
            else if(midval>target){
                right=mid-1;
            }
            else return mid;
            }
           return -1;
        }
    }

