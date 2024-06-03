//Write a Java program to find common elements between two arrays (string values).

public class CommonStringElements {

    public static void cmnStringEle(String arr1[], String arr2[])
    {
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i].equals(arr2[j]))
                {
                    System.out.println(arr2[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        String arr1[] = {"Lina", "Mina", "Rina", "Shila", "Lila"};
        String arr2[] = {"Mina", "Lila", "Tina"};

        cmnStringEle(arr1, arr2);
    }
}
