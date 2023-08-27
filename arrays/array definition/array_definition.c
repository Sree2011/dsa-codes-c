#include<stdio.h>
#include<conio.h>
/**
 * this code defines an array using 
 * different methods in C language
 * 
 */
void array_definition(){
    //define the array with only size
    int arr[5];
    //define the length of array1
    int n1 = sizeof(arr)/sizeof(int);

    //define the array with elements
    int arr2[] = {1, 3, 4};
    //define the length of array2
    int n2 = sizeof(arr2)/sizeof(int);

    //define the array with both size and elements
    int arr3[6] = {0, 1, 2, 3,4,5};
    //define the length of array3
    int n3 = sizeof(arr3)/sizeof(int);

    //print the first array
    printf("Array initialised with only size:\n");
    for(int i=0;i<n1;i++){
        printf("%d\n",arr[i]);
    }
    printf("Arrays initialised with only size has all its values as garbage values.\n");
    printf("\n");
    //print the second array
    printf("Array initialised with only elements:\n");
    for(int i=0;i<n2;i++){
        printf("%d\n",arr2[i]);
    }

    //print the third array
    printf("Array initialised with both size and elements:\n");
    for(int i=0;i<n3;i++){
        printf("%d\n",arr3[i]);
    }


}

int main(){
    array_definition();

}