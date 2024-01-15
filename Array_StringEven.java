//created a java program to take user input of element of an array of string type and thencount the number of string which has even length of string

import java.util.Scanner;
class javac 
{
public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  String str[]=new String[3];
  int count=0;
  System.out.println("Enter element of array of size "+str.length+" :-");
 
for(int i=0; i<str.length; i++)
  {
    str[i]=sc.nextLine();
  }
for(int j=0; j<str.length; j++)
  {
     if(str[j].length()%2==0)  //used length() method to check the length of the string
       {
         System.out.print(str[j]+" ");
	 count++;                //update the value of count
       }
 	System.out.println();
  }
System.out.println("count of even length of element is "+count);

}
}