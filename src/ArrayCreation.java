import java.util.Scanner;


public class ArrayCreation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5};

        System.out.println("Size of an Array is: " + a.length);
        System.out.println(a[1]);

        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Elements in an Array are: ");
            System.out.print(arr[i]);


        }

        System.out.println("Enter Size of an Array");
        int size = sc.nextInt();

        int array[] = new int[size];

        for(int i=0; i<array.length; i++)
        {
            array[i] = sc.nextInt();
        }

        for(int i=0; i<array.length; i++)
        {
            System.out.println("Elements in an Array are: ");
            System.out.print(array[i]);
        }

    }
}

