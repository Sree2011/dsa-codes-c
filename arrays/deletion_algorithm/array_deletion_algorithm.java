package deletion_algorithm;

public class array_deletion_algorithm {
    public static void delete(int[] A, int n, int k,int item){
        //set item to A[k]
        n = A.length;
        item = A[k];
        //repeat from j= k to n-1
        for(int j=k;j<n-1;j++){
            //move (j+1)st element upward
            A[j] = A[j+1];
        }
        //reset number of elements in a
        n = n - 1;
        //print the array A
        for(int i=0;i < n;i++){
            System.out.println(A[i]);
        }
    }

    public static void main(String args[]){
        int[] A = {1,2,3,4,5,6};
        int n = 5;
        int k = 2;
        int item = 8;

        delete(A,n,k,item);

        
    }


}
