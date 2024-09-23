public class IT24100807Lab7Q2C {
  public static void main (String[] args) {
    int no = 1 ;
    for(int i = 5;i>=no;i--){
      String strno = Integer.toString(i);
      System.out.println(strno.repeat(i));
    }

  }
}