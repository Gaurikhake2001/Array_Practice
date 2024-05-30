//Write a Java program to sum values of an array.


public class ArraySum {

    public static void main(String args[]) {
        int a[] = {10,50,65,89,20};
        int sum = 0;

        for(int i:a)
        {
            sum += i;
        }
        System.out.println("Sum of Elements in an Array: "+sum);
    }
}