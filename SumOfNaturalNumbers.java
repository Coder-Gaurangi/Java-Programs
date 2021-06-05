/*Gaurangi Tripathi 
Program to find sum of natural numbers till n, where n>=0
Example:
 	Input: n = 5		Output = Sum of first 5 natural numbers = 15
*/
package prg;
import java.util.Scanner;
public class SumOfNaturalNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print(" Enter number of terms: ");
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println(" Invalid value ");
		}
		for(int i = 0; i <= n; i++ )
		{
			sum = sum + i;
		}
		System.out.println(" Sum of first " + n + " natural numbers = " + sum);
		sc.close();
	}
}
