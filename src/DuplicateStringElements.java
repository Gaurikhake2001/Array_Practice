//Write a Java program to find duplicate values in an array of string values.

public class DuplicateStringElements {

    public static void strDuplicate()
    {
        String arr[] = {"Huda", "Teju", "Gauri", "Shreya", "Huda", "Shraddha", "Teju"};

        for(int i=0; i<arr.length; i++)
        {
            for(int j =i+1; j<arr.length; j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        strDuplicate();
    }
}
