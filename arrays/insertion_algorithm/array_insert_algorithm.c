#include <stdio.h>
void array_insert_algorithm(int A[], int n, int k, int item){
    //initialise counter
    int j = n-1;
    //repeat while j >= k
    while(j >= k){
        //move jth element down
        A[j+1] = A[j];
        //decrement j by 1
        j--;
    }
    //insert element
    A[k] = item;
    //reset n
    n = n+1;
    

    //print the array A
    for (int i=0; i<n;i++) {
        printf("%d ",A[i]);
    }

}

int main(){
    int A[] = {1,2,3,4,5,6};
    int n = sizeof(A)/sizeof(int);
    int k = 2;
    int item = 8;

    array_insert_algorithm(A,n,k,item);
}
