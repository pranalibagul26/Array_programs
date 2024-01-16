// Q. write a program to create a string array and store given data
//output will be
// 0010010100101001
//11000100100111001101
//111000101010
//000101001100  000=DNA 111=RNA

import java.util.Scanner;

class Example_string
{
String arr[]={"00010010100101001","11000100100111001101","111000101010","000101001100"};
 	//String arr[]=new String();                


public static void main(String[]args)
  {



Example_string ref=new Example_string();
ref.DnaRna();

  }

public void DnaRna()
{
  for(int i=0; i<arr.length; i++)  //OUTER FOR LOOP
     {
        String a="";

     for(int j=0; j<3; j++)    //INNER FOR LOOP
        {
            // if(arr[i].charAt(j)=='0' || arr[i].charAt(j)=='1')
              //{
	        a=a+arr[i].charAt(j);
             // }
         }       //CLOSED INNER FOR

     if(a.equals("000"))
        {
             System.out.println("DNA");
        }
      else if(a.equals("111"))
        {
             System.out.println("RNA");
        }
      else
        { 
           System.out.println("not valid info");
        }


     }  // CLOSED OVERHERE
 }



}

