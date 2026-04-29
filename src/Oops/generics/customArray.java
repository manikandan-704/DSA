package Oops.generics;

import java.util.Arrays;

public class customArray {
    public static void main(String[] args){
        customArray arr=new customArray();
        arr.add(4);
        arr.add(12);
        arr.add(7);
        arr.add(57);
        System.out.println(arr.getVal(3));
        arr.setIndex(10,20);
        System.out.println(arr);

    }

    private int[] arr;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public customArray() {
        this.arr = new int[DEFAULT_SIZE];
    }
    // add element to an array
    public void add(int num){
        if(isFull()){
            reSize();
        }
        arr[size++]=num;
    }

    // return size of inserted elements
    public int size(){
        return size;
    }

    //checks the inserted element "size" == length of an array
    private boolean isFull() {
        return arr.length==size;
    }

    //resize the array 2* arr.length
    private void reSize(){
        int [] temp=new int[arr.length*2];
        // copy the elements to the new array
        System.arraycopy(arr, 0, temp, 0, arr.length);
//        for(int i = 0; i<arr.length; i++){
//            temp[i]=arr[i];
//        }
        arr=temp;
    }
    // set element at a particular index if the grater then default size resize
    public void setIndex(int ind, int val){
        if(ind>=arr.length){
            reSize();
        }
        arr[ind]=val;
    }

    // get the value by index
    public int getVal(int ind){
        int val= arr[ind];
        return val;
    }

    // remove the element
    private int remove(){
        int rev=arr[--size];
        return rev;
    }

    //print the array by converting into the string
    @Override
    public String  toString() {
        return "customArray{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
