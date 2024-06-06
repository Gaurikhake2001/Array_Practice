//Write a Java program to find the maximum and minimum value of an array.

public class MaxMinEle {

    public static void maxMin(int arr[])
    {
        int max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];

            }
        }
        System.out.println("Max element is: "+max);
        int min=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]< min)
            {
                min = arr[i];

            }
        }
        System.out.println("Min element is: "+min);
    }

    public static void main(String[] args) {

        int arr[] = {10,12,85,56,1,5,75};
        maxMin(arr);
    }

}
