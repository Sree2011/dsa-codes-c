/**
 * this code updates the element at a particular
 * index in an array in C language
 * 
 */

#include<stdio.h>
void display_array(int A[],int n);
void array_update(int A[],int n,int k,int item){
    //update the element
    A[k] = item;

    //print the array
    for(int i=0;i<n;i++){
        printf("%dth element of A is %d\n",i,A[i]);
    }
}

void display_array(int A[],int n){
    for(int i=0;i<n;i++){
        printf("%dth element of A is %d\n",i,A[i]);
    }
}

int main(){
    int A[]  = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 5;
    int item = 10;
    printf("Before update\n");
    display_array(A,n);
    printf("After update\n");
    array_update(A,n,k,item);

    }
