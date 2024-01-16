import java.util.Scanner;
class Binary_search
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
System.out.print("Enter array element of size:10");

for(int j=0; j<arr.length; j++)
 {
   int arr[j]=sc.nextInt();
 }

int a=sc.nextInt();
 int pos=1;
int s=0;
int e=arr.length-1;

for(int i=0; i<arr.length-1; i++)
{
  int mid=(s+e)/2;
 if(arr[mid]==a)
   {
     pos=mid;
     break;
    }
else if(arr[mid]>a)
  {
     e=mid;
   }
else{
  s=mid;
   }
}

 if(pos>=0)
 {
  System.out.print(pos+" index");
 } 
 else
 {
 System.out.print("the value is not present inside array");
 }
}
}

