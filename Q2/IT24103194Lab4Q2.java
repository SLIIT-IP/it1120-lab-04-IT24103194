import java.util.Scanner;
public class IT24103194Lab4Q2
{
 public static void main(String[] args)
 {
  int num01,num02,p1,p2;
  double value;
  //variable declaration
  
  Scanner input=new Scanner(System.in);
  System.out.print("Please enter exam marks(out of 100)           :");
  num01=input.nextInt();
  //read exam marks
 if(num01 < 100 && num01 >0  )
  //check the validity
    
     { 
       System.out.print("Please enter lab submission marks(out of 100) :");
       num02=input.nextInt();
       //read lab mark

           System.out.print("Please enter the precentage given for the exam:");
           p1=input.nextInt();
           //read mark p
       
           System.out.print("Please enter the precentage given for the lab :");
           p2=input.nextInt();
          
 
           if (p1+p2==100)
            //check the validity of precentages
            {
             value=(num01*p1/100.0 ) + (num02*p2/100.0);
             //function
             System.out.print("Final Exam Mark is : " + value );
            }

          else
            {
            System.out.print("The precentages must add up to 100.Terminating program.");
            //Terminating part
            }
     }
  else
     {
     System.out.print("Invalid input for exam marks.Terminating program.");
     //Terminating part
     }
 
  }
}








    