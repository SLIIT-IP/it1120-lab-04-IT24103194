import java.util.Scanner;
public class IT24103194Lab4Q1
{ 
 public static void main(String[] args)
 { 
 int num01;
 // variable declaration
 Scanner input=new Scanner(System.in);
 System.out.print("Enter a number: ");
 num01=input.nextInt();
 //User to input value
  
 if (num01 > 0)
 //positive part
  { 
    System.out.print("The number is :Positive");
  }
else if (num01 < 0)
 //negative part
  {
    System.out.print("The number is :Negative");
  }
 else
  {
    System.out.println("The number is Zero");
  }
 }
}