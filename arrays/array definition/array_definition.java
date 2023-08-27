/**
 * this code defines an array using 
 * different methods in Java language
 * 
 */

public class array_definition{
    public static void arr_def(){
        int[] a = new int[10];  //initialising as new object with size
        int[] b = {1,2,3,4,5};  //initialising with elements
        //printing the arrays
        System.out.println("Array initialised with object:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
        System.out.println("Arrays initialised with object has all its values as zero.");

        System.out.println("Array initialised with elements:");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);

        }

    }

    public static void main(String args[]){
        arr_def();
    }
}