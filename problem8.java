/* Gaurangi Tripathi
  Java Program to delete vowels from a string using String Buffer
 */
package prg;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class problem8
{                                                              //start of class
   static String deletevowel(String strVowel)
   {                                              //start of deletevowel method
      Character[] vowel ={'a','e','i','o','u','A','E','I','O','U'};
      List<Character> li = Arrays.asList(vowel);
      StringBuffer strBuffer = new StringBuffer(strVowel);
      for(int a = 0; a < strBuffer.length(); a++)
      {                                                //logic to delete vowels
         if(li.contains(strBuffer.charAt(a)))
         {
        	strBuffer.replace(a, a + 1, "");
            a--;
         }
      }
      return strBuffer.toString();
   }                                                //end of deletevowel method                         
   public static void main(String[] args)
   {                                                     //start of main method 
	   Scanner sc = new Scanner(System.in); 
	   System.out.print(" Enter a string: ");
	   String strInput = sc.nextLine(); 
       System.out.println(deletevowel(strInput));
       sc.close();
   }                                                       //end of main method
}                                                                //end of class
