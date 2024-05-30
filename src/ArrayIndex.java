//Write a Java program to find the index of an array element.

import java.util.Scanner;

public class ArrayIndex {

    public static String arrayIndex(int arr[], int num)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == num)
            {
                return "Index of an element is: "+ i;
            }
        }
        return "No element is found in Array";
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
        System.out.println("Enter a number which index should be checked: ");
        int num = sc.nextInt();
        System.out.println(arrayIndex(arr,num ));

    }
}
