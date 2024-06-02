public class CommonElement {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6,7,8};
        int arr2[] = {3,8,19,65,23,2};
        int arr3[] = {1,3,56,8,2,88};

        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                for(int k=0; k<arr3.length; k++)
                {
                    if(arr1[i] == arr2[j] && arr2[j] == arr3[k])
                    {
                        System.out.println(arr3[k]);
                    }
                }
            }
        }
    }
}
