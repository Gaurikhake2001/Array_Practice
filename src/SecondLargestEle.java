//Write a Java program to find the second smallest element in an array.

public class SecondLargestEle {
    public static int secondLargestEle(int arr[]){

        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int num = arr[1];
        return num ;

    }

    public static void main(String[] args) {
        int arr[] = {5,6,8,1,0,7};
        System.out.println(secondLargestEle(arr));
    }
}
