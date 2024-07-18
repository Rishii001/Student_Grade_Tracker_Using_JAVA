import java.util.Scanner;
public class grade
{
 public static void main(String[] args)
 {
  int num,avg;
  int sum=0;
  Scanner scr=new Scanner(System.in);
  System.out.println("Enter your Total Subjects:");
  num=scr.nextInt();
  int[] arr=new int[num];
  System.out.println("Enter Your Subject Wise marks:");
  for(int i=0;i<num;i++)
  arr[i]=scr.nextInt();
  for(int a=0;a<num;a++)
  {
    arr[a]=arr[a]+sum;
    sum=arr[a];
  }
  avg=sum/num;
  if(avg>=90)
  System.out.println("Grade: A");
  else if(avg>=80&&avg<90)
  System.out.println("Grade: B");
  else if(avg>=70&&avg<80)
  System.out.println("Grade: C");
  else if(avg>=60&&avg<70)
  System.out.println("Grade: D");
  else if(avg>=50&&avg<60)
  System.out.println("Grade: E");
  else
  System.out.println("Grade: F"); 
 }
}
