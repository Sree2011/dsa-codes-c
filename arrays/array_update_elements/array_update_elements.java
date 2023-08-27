package array_update_elements;

public class array_update_elements {
    
    public static void array_update(int A[],int k,int item){
        A[k] = item;
        int n = A.length;
        for(int i=0;i<n;i++){
            System.out.printf("%d th element of A is %d\n",i,A[i]);
        }
    }

    public static void main(String args[]){
        int A[] = {1,2,3,4,5,6,7};
        int n = A.length;
        int k = 4;
        int item = 10;
        System.out.println("Before update:\n");
        for(int i=0;i<n;i++){
            System.out.printf("%d th element of A is %d\n",i,A[i]);
        }
        System.out.println("After update:\n");
        array_update(A,k,item);


    }
}
