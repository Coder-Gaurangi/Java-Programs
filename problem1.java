/* Gaurangi Tripathi
  Taking input from Command line and convert objects into primitive data type.
	Write a java program to take input as a command line argument. Your name, course, universityrollno and semester. Display the information.
	Name:
	UniversityRollNo:
	Course:
	Semester:
*/
package prg;
import java.util.Scanner;
class problem1
{                                          //start of class
    public static void main(String[] args)
    {                                //start of main method
    	Scanner sc = new Scanner(System.in);
    	System.out.println(" Enter Name, Course University Roll Number and semester in the same order: ");
        String name = sc.nextLine();
        String course = sc.nextLine();
        int urn = sc.nextInt();
        int sem = sc.nextInt();
        System.out.println(" Name: "+ name);
        System.out.println(" University Roll Number: "+ urn);
        System.out.println(" Course: "+ course);
        System.out.println(" Semester: "+ sem);
        sc.close();
    }                                  //end of main method
}                                            //end of class
