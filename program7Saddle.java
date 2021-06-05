/* Gaurangi Tripathi
  Java Program to find Saddle Point of a matrix.
  Saddle point is an element in the matrix which is minimum element in its row and is maximum in its column.
  Steps:
    Traverse first row and check if an element is minimum in its row or not.
    Store the column index of the element which is minimum in the row.
    Check if it is maximum in its column-
    		If yes, then this is the Saddle Point
    		If no, then check for the next row with the same procedure.
  */
package prg;
import java.util.Scanner;
class program7Saddle
{                                                  //start of class 
   static boolean findSaddle(int mat[][], int n)
    {                                              //start of method findSaddle
        for (int i = 0; i < n; i++)
        {                                          //traversing rows
            int rowmin = mat[i][0], columnindex = 0;
            for (int j = 1; j < n; j++)
            {
                if (rowmin > mat[i][j])
                {
                    rowmin = mat[i][j];
                    columnindex = j;              //storing column index of min element of the row
                }
            }          
            int k;
            for (k = 0; k < n; k++)               // Check if the minimum element of row is also the maximum element of column or not
                if (rowmin < mat[k][columnindex])
                {
                    break;
                } 
                if (k == n)
                {                                 //saddle point found
                   System.out.println("Value of Saddle Point " + rowmin);
                   return true;
                }
        }
        return false;
    }
    public static void main(String[] args) 
    {                                            //start of main method
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter order of matrix: ");
    	int n = sc.nextInt();                    //matrix order from user
    	int matrix[][] = new int[n][n];
    	System.out.println("Enter the elements of the matrix"); 
        for (int i = 0; i < n; i++) 
        {                                        //matrix input from user
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Elements of the matrix are"); 
        for (int i = 0; i < n; i++) 
        {                                         //displaying input matrix
            for (int j = 0; j < n; j++) 
                System.out.print(matrix[i][j] + "  "); 
            System.out.println();
        }
        if (findSaddle(matrix, n) == false)
            System.out.println("No Saddle Point ");
     sc.close();
    }                                             //end of main method
}                                                 //end of class
