/* Gaurangi Tripathi
   Program to replace all 0's with 1 in a given integer. Given an integer as an input, all the 0's in the number has to be replaced with 1.
		For example, consider the following number
			Input: 102405
			Output: 112415
			Input: 56004
			Output: 56114
Steps to replace all 0's with 1 in a given integer
	Input the integer from the user.
	Traverse the integer digit by digit.
	If a '0' is encountered, replace it by '1'.
	Print the integer
 */
package prg;
import java.util.Scanner;
public class problem4
{                                             //start of class
  public static void main(String[] args)
  {                                           //start of main method
   Scanner sc = new Scanner(System.in);       //scanner class declaration
   System.out.print("Enter the number : ");		
   int number = sc.nextInt();                 //input from the user
   String str = Integer.toString(number);     //convert the number to string and then calculate its length
   int len = str.length();
   String str1 = "";
  for(int i = 0 ; i < len ; i++)
  {                               			  //logic to replace all 0's with 1 
    	if(str.charAt(i) == '0')
    		str1 = str1 + '1';
    	else
    		str1 = str1 + str.charAt(i);	
  }
  System.out.println("Output : "+str1);
  sc.close();	                              //closing scanner class
    }                                         //end of main method
}                                             //end of class
