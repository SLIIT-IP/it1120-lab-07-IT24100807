import java.util.Scanner;

public class IT24100807Lab7Q1B {
  public static void main (String[] args) {
     Scanner input = new Scanner (System.in);

     int noOfStuds=3;
     for(int i=1;i<=noOfStuds;i++){
     System.out.println("Student "+i);
     System.out.print("Enter marks: ");
     int mark1=input.nextInt();
     int mark2=input.nextInt();
     int mark3=input.nextInt();
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
    
     System.out.println("Average is : "+avg);
     System.out.println("Overall Grade is : "+grade);
     System.out.println("");
     }
  }
}