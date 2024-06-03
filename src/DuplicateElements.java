//Write a Java program to find duplicate values in an array of integer values.

public class DuplicateElements {

    public static void duplicate()
    {
        int arr[] = {10,20,2,0,10,5,5,9,8,7,8,2};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        duplicate();
    }
}
