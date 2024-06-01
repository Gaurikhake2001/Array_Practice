import java.util.Scanner;

public class AdditionOfAlternateElements {
    public static int add(int arr[], int sum)
    {
//        sum1=0;
//        sum2=0;
       for(int i=0; i<arr.length; i++) {
           if (i % 2 == 0) {
               sum = sum + arr[i];
           }
       }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array: ");
        int size =sc.nextInt();
        int sum = 0;

        int arr[] = new int[size];

        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(add(arr, sum));
    }
}
