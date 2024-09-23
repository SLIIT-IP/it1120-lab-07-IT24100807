import java.util.Scanner;
public class IT24100807Lab7Q3 {
  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    int cus = 5;
    for(int i =1;i<=cus;i++){
      System.out.println("Customer "+i);
      System.out.print("Enter total bill amount: ");
      int total = input.nextInt();
      System.out.print("Enter mode of payment (C for cash, O for other): ");
      char mode = input.next().charAt(0);
    
      if (mode=='C'||mode=='c'){
        double dis = (double)total*(5/100.0);
        System.out.println("Discount is : "+dis);
        double atbp=(double)total-dis;
        System.out.println("Amount to be pain: "+atbp);
      } else if (mode=='O'||mode=='o'){
          System.out.println("No discount applicable");
          System.out.println("Amount to be pain: "+(double)total);
      } else {
          System.out.println("Payment mode Not Valid");
      }
      System.out.println("");
    }
  }
}
