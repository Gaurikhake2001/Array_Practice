//Write a Java program to sort a numeric array.

import java.util.Scanner;

public class ArraySorting {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter Elements in an Array: ");
        for(int i=0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Elements in an Array are: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(a[i] + " ");
        }

        for(int i=0; i<size; i++) {
            for (int j = i+1; j < size; j++) {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("Sorted Array is: ");
            for(int i=0; i<size; i++)
            {
                System.out.print(a[i] + " ");
            }

    }
}
