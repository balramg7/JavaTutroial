package Sorting_Algo;

public class Bubble_Sort {
    public static void sort(int arr[]){
        for (int i = 0; i< arr.length-1; i++){
            for (int j = 0; j<arr.length-1- i; j++){
                //swap
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]= {5, 4, 9, 6, 10, 2};
        sort(arr);
        printArr(arr);
    }
}
