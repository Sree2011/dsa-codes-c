package insertion_algorithm;
public class array_insert_algorithm{
    /*
     * Here A is a linear array with N elements and k is a positive integer
     * such that k <= N. This algorithm inserts an element item into kth
     * position of A.
     */
     public static void insert(int A[],int n,int k, int item){
        //initialise counter
        n = A.length;
        int j = n - 2;
        while(j >= k){
            //move jth element down
            A[j + 1] = A[j];
            //decrease counter
            j--;
        }
        //inserting the new element at the required index
        A[k] = item;
        //reset n
        n = n+1;

        //print the array A
        for (int i=0;i<A.length;i++){
            System.out.println("The value in the "+i+" th position is: "+A[i]);
        }

    }

    public static void main(String args[]){
        int[] A = {1,2,3,4,5,6};
        int n = 6;
        int k = 2;
        int item = 8;
        insert(A,n,k,item);
    }

}