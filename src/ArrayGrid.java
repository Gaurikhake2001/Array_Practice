/*Write a Java program to print the following grid.

Expected Output :

        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -

 */

public class ArrayGrid {
    public static void grid()
    {
        for(int i=0; i<=11; i++)
        {
            for(int j=0; j<=11; j++){

                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        grid();
    }
}
