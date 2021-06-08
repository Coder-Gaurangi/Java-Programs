/* Gaurangi Tripathi
 Java Program to print sum of following series:
 1 - 1/2 + 1/3 - 1/4 +1/5 + ... 1/n 
 */

package prg;
import java.util.Scanner;

public class seriesSum2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number of terms: ");
		int n = sc.nextInt();
		float result = 0;
		for(float i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				result -= 1/i;
			}
			else
			{
				result += 1/i;	
		    }
		}
		System.out.println(" Result = " + result);
		sc.close();
	}
}
