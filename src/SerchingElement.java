//Write a Java program to test if an array contains a specific value.


import java.util.Scanner;

public class SerchingElement {

    public static String arraySearch(int[] arr, int num)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == num)
                return "Element found at index: "+i ;
        }
        return "Element not found";
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array: ");
        int size =sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter an element to search: ");
        int num = sc.nextInt();

        System.out.println(arraySearch(arr,num));
    }
}
