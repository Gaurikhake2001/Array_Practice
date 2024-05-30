//Write a Java program to calculate the average value of array elements
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int sum = 0;

        int a[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));

        for(int i:a)
        {
            sum += i;
        }

        System.out.println(sum +" "+ size);
        int avg = sum / size;
        System.out.println("Average of array Elements are: "+ avg);
    }
}
