//Write a Java program to remove a specific element from an array.


import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static int arrayIndex(int arr[], int num)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == num)
            {
                for(int j = i+1; j<arr.length; j++)
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                return arr.length-1;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number which we have to remove: ");
        int num = sc.nextInt();
        int newSize = arrayIndex(arr,num );
        System.out.println("New Array is: ");
        for(int i=0; i<newSize; i++) {
            System.out.print( arr[i]+" ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
