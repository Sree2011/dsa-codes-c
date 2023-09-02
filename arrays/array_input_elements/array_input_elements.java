/**
 * this code takes the elements of array as input
 * using different methods in Java language
 * 
 */

package array_input_elements;
import java.util.*;
public class array_input_elements{
    public static void arr_inp(int a[]){
        // initialise the scanner object
        Scanner sc = new Scanner(System.in);
        //take the elements of array as input
        for (int i=0;i<a.length;i++){
            System.out.println("Enter the element at index "+i+":");
            a[i] = sc.nextInt();
            
        }

        //display the new array
        System.out.println("Array after entering the elements:");
        for(int i=0;i<a.length;i++){
            System.out.println("The element at index "+i+" is "+a[i]);
        }

        sc.close();

            
    }

    public static void main(String args[]){
        int[] a = new int[5];
        System.out.println("Array before entering the elements:");
        for(int i=0;i<a.length;i++){
            System.out.println("The element at index "+i+" is "+a[i]);
        }
        arr_inp(a);
        
    }
}
