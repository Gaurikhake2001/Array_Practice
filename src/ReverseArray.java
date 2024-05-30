//Write a Java program to reverse an array of integer values.


import java.util.Scanner;

public class ReverseArray {

    public static void main(String args[])
    {
//        System.out.print("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter Elements: ");
        for(int i=0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Array Elements are: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println("Reversed Array is: ");
        for(int i=size-1; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }

    }
}
