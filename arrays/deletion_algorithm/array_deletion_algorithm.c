/*
 * Here A is a linear array with N elements and k is a positive integer
 * such that k <= N. This algorithm deletes an element item from kth
 * position of A.
 */

#include<stdio.h>
void array_deletion_algorithm(int A[], int n, int k, int item){
    //set item  to A[k]
    item = A[k];
    //repeat from j = k to n -1
    for(int j = k;j < n-1;j++){
        //move (j+1)st element upward
        A[j] = A[j+1];
    }
    //reset number of elements in A
    n = n - 1;

    //print the array A
    for(int i=0;i<n;i++){
        printf("%d ",A[i]);
    } 
}

int main(){
    int A[] = {1,2,3,4,5,6};
    int n = 5;
    int k = 2;
    int item = 8;

    array_deletion_algorithm(A,n,k,item);
    return 0;
}
