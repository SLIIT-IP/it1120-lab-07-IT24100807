import java.util.Scanner;

public class IT24100807Lab7Q1A {
  public static void main (String[] args) {
     Scanner input = new Scanner (System.in);
     
     System.out.print("Enter makrs for four subjects : \nEnter Subject Mark 1: ");
     int mark1=input.nextInt();
     System.out.print("Enter Subject Mark 2: ");
     int mark2=input.nextInt();
     System.out.print("Enter Subject Mark 3: ");
     int mark3=input.nextInt();
     System.out.print("Enter Subject Mark 4: ");
     int mark4=input.nextInt();

     int total=mark1+mark2+mark3+mark4;
     double avg=(double)total/4;

     String grade;
     if(avg>=75){
       grade = "Distinction";
     }else if(avg>=50){
       grade = "Credit";
     }else{
       grade = "Fail";
     }
     
     System.out.println("");
     System.out.println("Average is : "+avg);
     System.out.println("Overall Grade is : "+grade);
  }
}