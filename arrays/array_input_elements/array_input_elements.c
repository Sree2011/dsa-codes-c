/**
 * this code takes the elements of array as input
 * using different methods in C language
 * 
 */

#include <stdio.h>
void arr_inp(int *a,int n){
    
    //take elements of array as input
    printf("Enter the elements of array: \n");
    for (int i=0;i<n;i++){
        printf("Enter the element at index %d: ",i);
        scanf("%d",&a[i]);
    }

    //display the array
 
    for (int i=0;i<n;i++){
        printf("The element at index %d is %d\n",i,a[i]);
        
    }



}

int main(){
    int a[5];
    int n = sizeof(a)/sizeof(int);
    arr_inp(a,n);
    return 0;
}
